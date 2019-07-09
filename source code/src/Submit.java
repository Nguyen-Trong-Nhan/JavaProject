
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Submit {
    private Object sub (Sheet a, int b, int c ){
        CellType type = CellType.STRING;
        if (a.getRow(b).getCell(c).getCellType()==type) {
            return a.getRow(b).getCell(c).getStringCellValue();
        }
        else return a.getRow(b).getCell(c).getNumericCellValue();
    }
    public Submit(String link) {
        try {
            FileInputStream input = new FileInputStream(link);
            POIFSFileSystem fs = new POIFSFileSystem(input);
            Workbook workbook;
            workbook = WorkbookFactory.create(fs);
            Object cau_CK, cau_GK;
            Object MALOPHOC;

            // Sheet đầu tiên
            try {

                Object TYLE_GK, TYLE_CK; //tỷ lệ và số câu
                Sheet sheet1 = workbook.getSheetAt(0);

                //Kiểm tra MÃ LỚP HỌC có thuộc giáo viên đó không
                MALOPHOC = sub(sheet1,0,0);
                String[] a = Giaovien.getDsLop(main.Maso);
                for (int i = 0; i < a.length; i++) {
                    if (a[i].equals(MALOPHOC)) {
                        a[0] = "found";
                    }
                    if (a[i + 1] == null) {
                        break;
                    }
                }
                if (!"found".equals(a[0])) {
                    JOptionPane.showMessageDialog(null, "Lớp " + MALOPHOC + " không thuộc trong danh sách lớp của bạn!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                //Kiểm tra lớp này đã được nhập chưa, nếu nhập rồi thì xóa và nhập lại cái mới
                int flag = 0;
                ResultSet rs = main.st.executeQuery("select DISTINCT MALOPHOC from DETHI");
                while (rs.next()) {
                    if (rs.getString("MALOPHOC").trim().equals(MALOPHOC)) {
                        flag = 1; //phát hiện đã có lớp này trong csdl
                    }
                }
                if (flag == 1) {
                    int dialogButton = JOptionPane.showConfirmDialog(null, "Lớp " + MALOPHOC + " đã tồn tại trong CSDL, bạn có muốn xóa và tải tập tin mới?", "WARNING", JOptionPane.YES_NO_OPTION);
                    if (dialogButton == JOptionPane.NO_OPTION) {
                        return;
                    } else {
                        main.st.execute("delete from DIEM where MADETHI = '"+MALOPHOC+".GK'");
                        main.st.execute("delete from DIEM where MADETHI = '"+MALOPHOC+".CK'");
                        main.st.execute("delete from DETHI where MALOPHOC = '" + MALOPHOC + "'");  
                    }
                }
                
                TYLE_GK = sub(sheet1,2,1);
                TYLE_CK = sub(sheet1,3,1);
                cau_GK = (int) Math.round(Float.parseFloat(sub(sheet1,2,2).toString()));
                cau_CK = (int) Math.round(Float.parseFloat(sub(sheet1,3,2).toString()));
                
                main.st.execute("insert into DETHI values('" + MALOPHOC + ".GK','" + MALOPHOC + "','GK','" + (int) Math.round(Float.parseFloat(TYLE_GK.toString())) + "','" + cau_GK + "')");
                main.st.execute("insert into DETHI values('" + MALOPHOC + ".CK','" + MALOPHOC + "','CK','" + (int) Math.round(Float.parseFloat(TYLE_CK.toString())) + "','" + cau_CK + "')");

            } catch (java.lang.NullPointerException | SQLException exception) {
                System.out.println(exception);
                JOptionPane.showMessageDialog(null, "Nhập thông tin sai ở sheet TY_LE! \n" + exception.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Sheet thứ 2 và thứ 3 và thứ 4
            Sheet sheet2 = workbook.getSheetAt(1);
            Sheet sheet3 = workbook.getSheetAt(2);
            Sheet sheet4 = workbook.getSheetAt(3);
            int MSSV;
            
            //nhập điểm GK SV
            int demSV_OK = 0; //đếm số SV đã import thành công
            for (int i = 2; i < sheet4.getLastRowNum(); i++) {
                if (sheet4.getRow(i).getCell(1).getCellType()==CellType.NUMERIC) {
                    double mssv =  sheet4.getRow(i).getCell(1).getNumericCellValue();
                    MSSV = (int) Math.round(mssv);
                }else{
                    String mssv = sheet4.getRow(i).getCell(1).getStringCellValue();
                    MSSV = Integer.parseInt(mssv);
                }
                int flag=0; //Tín hiệu khi update SV trong CSDL thành công
                System.out.println(MSSV);
                for (int j = 1; j <= sheet2.getLastRowNum(); j++) { // Số câu
                    for (int k = 3; sheet2.getRow(j).getCell(k) != null && sheet2.getRow(j).getCell(k).getCellType() != CellType.BLANK; k++) {
                        Object MaG = sub(sheet2,j,k);
                        Object DIEM = sub(sheet2,j,2);
                        Object QUATRINH = sub(sheet4,i,3);
                        Object DIEMTHUC = sub(sheet4,i,3+j);
                        try {
                            System.out.println("insert into DIEM values('" +  MSSV + "','" + MALOPHOC + ".GK','" + j + "','" + MaG + "','" + DIEM + "','" + DIEMTHUC + "','" + QUATRINH + "')");
                            main.st.execute("insert into DIEM values('" +  MSSV + "','" + MALOPHOC + ".GK','" + j + "','" + MaG + "','" + DIEM + "','" + DIEMTHUC + "','" + QUATRINH + "')");
                            flag = 1;
                        } catch (SQLException ex) {
                            Logger.getLogger(Submit.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                //nhập điểm CK SV
                for (int j = 1; j <= sheet3.getLastRowNum(); j++) { // Số câu
                    for (int k = 3; sheet3.getRow(j).getCell(k) != null && sheet3.getRow(j).getCell(k).getCellType() != CellType.BLANK; k++) {
                        Object MaG = sub(sheet3,j,k);
                        Object DIEM = sub(sheet3,j,2);
                        Object QUATRINH = sub(sheet4,i,3);
                        Object DIEMTHUC = sub(sheet4,i,(3 +(int)cau_GK + j));
                        System.out.println("insert into DIEM values('" +  MSSV + "','" + MALOPHOC + ".CK','" + j + "','" + MaG + "','" + DIEM + "','" + DIEMTHUC + "','" + QUATRINH + "')");
                        try {
                            main.st.execute("insert into DIEM values('" +  MSSV + "','" + MALOPHOC + ".CK','" + j + "','" + MaG + "','" + DIEM + "','" + DIEMTHUC + "','" + QUATRINH + "')");
                            if(flag == 1)
                                flag=2;
                        } catch (SQLException ex) {
                            Logger.getLogger(Submit.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if (flag==2)
                    demSV_OK++;
            }
            JOptionPane.showMessageDialog(null, "Cập nhật thành công "+demSV_OK+" sinh viên vào lớp "+MALOPHOC+" !", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            input.close();
        } catch (java.io.FileNotFoundException a) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy file!", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Không đọc được tệp tin", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}


package BUS;

import DAO.TaiKhoanDAO;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import java.util.ArrayList;

public class TaiKhoanBUS {
    TaiKhoanDAO taikhoan = new TaiKhoanDAO();
    public boolean addTaiKhoan(TaiKhoanDTO s){
        if (taikhoan.addTaiKhoan(s))
            return true;
        return false;
    }
    public boolean updateTaiKhoan(TaiKhoanDTO s){
        if (taikhoan.updateTaiKhoan(s))
            return true;
        return false;
    }
    public boolean deleteTaiKhoan(TaiKhoanDTO s){
        if (taikhoan.deleteTaiKhoan(s))
            return true;
        return false;
    }
     public ArrayList<TaiKhoanDTO> getListTaiKhoan(){
        return taikhoan.getListTaiKhoan();
}
     public ArrayList<TaiKhoanDTO> searchTaiKhoan(String key) throws Exception{
        return taikhoan.searchTaiKhoan(key);
    }
}

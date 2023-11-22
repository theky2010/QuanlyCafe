/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.BangLuongDAO;
import DTO.BangLuongDTO;
import DTO.HoaDonDTO;
import java.util.ArrayList;

public class BangLuongBUS {
    BangLuongDAO bangluong=new BangLuongDAO();
    public boolean updateBangLuong(BangLuongDTO s){
        if (bangluong.updateBangLuong(s))
            return true;
        return false;
    }
    public boolean addBangLuong(BangLuongDTO s){
        if (bangluong.addBangLuong(s))
            return true;
        return false;
    }
    public boolean deleteBangLuong(BangLuongDTO s){
        if (bangluong.deleteBangLuong(s))
            return true;
        return false;
    }
    public ArrayList<BangLuongDTO> getListBangLuong(){
        return bangluong.getListBangLuong();
    }
    public ArrayList<BangLuongDTO> searchBangLuong(String key) throws Exception{
        return bangluong.searchBangLuong(key);
    }
}

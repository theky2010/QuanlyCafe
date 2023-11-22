/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChiTietNhapDAO;
import DTO.ChiTietNhapDTO;
import DTO.HoaDonDTO;
import DTO.MenuDTO;
import java.util.ArrayList;


public class ChiTietNhapBUS {
    ChiTietNhapDAO ctnhap= new ChiTietNhapDAO();
    public boolean addPhieuNhap(ChiTietNhapDTO s){
        if (ctnhap.addPhieuNhap(s))
            return true;
        return false;
    }
    public boolean updatePhieuNhap(ChiTietNhapDTO s){
        if (ctnhap.updatePhieuNhap(s))
            return true;
        return false;
    }
    public boolean deletePhieuNhap(ChiTietNhapDTO s){
        if (ctnhap.deletePhieuNhap(s))
            return true;
        return false;
    }
    public ArrayList<ChiTietNhapDTO> getListPhieuNhap(){
        return ctnhap.getListPhieuNhap();
    }
    public ArrayList<ChiTietNhapDTO> searchPhieuNhap(String key) throws Exception{
        return ctnhap.searchPhieuNhap(key);
    }
}

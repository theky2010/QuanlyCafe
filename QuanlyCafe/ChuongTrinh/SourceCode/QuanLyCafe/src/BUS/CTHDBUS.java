package BUS;

import DAO.CTHDDAO;
import DTO.CTHDDTO;
import DTO.HoaDonDTO;
import DTO.MenuDTO;
import java.util.ArrayList;

public class CTHDBUS {
    CTHDDAO cthd = new CTHDDAO();
    public boolean addCTHD(CTHDDTO s){
        if (cthd.addCTHD(s))
            return true;
        return false;
    }
    public boolean updateCTHD(CTHDDTO s){
        if (cthd.updateCTHD(s))
            return true;
        return false;
    }
    public boolean deleteCTHD(CTHDDTO s){
        if (cthd.deleteCTHD(s))
            return true;
        return false;
    }
    public ArrayList<CTHDDTO> getListCTHD(){
        return cthd.getListCTHD();
    }
    public ArrayList<CTHDDTO> searchCTHD(String key) throws Exception{
        return cthd.searchCTHD(key);
    }
}

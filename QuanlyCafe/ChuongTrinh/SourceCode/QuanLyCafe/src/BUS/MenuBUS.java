
package BUS;

import DAO.MenuDAO;
import DTO.HoaDonDTO;
import DTO.MenuDTO;
import java.util.ArrayList;


public class MenuBUS {
    MenuDAO menu= new MenuDAO();
    public boolean addMenu (MenuDTO s){
        if (menu.addMenu(s))
            return true;
        return false;
    }
    public ArrayList<MenuDTO> getListMenu(){
        return menu.getListMenu();
    }
    public boolean updateMenu(MenuDTO s){
        if (menu.updateMenu(s))
            return true;
        return false;
    }
    public boolean deleteMenu(MenuDTO s){
        if (menu.deleteMenu(s))
            return true;
        return false;
    }
    public ArrayList<MenuDTO> searchMenu(String key) throws Exception{
        return menu.searchMenu(key);
    }
}


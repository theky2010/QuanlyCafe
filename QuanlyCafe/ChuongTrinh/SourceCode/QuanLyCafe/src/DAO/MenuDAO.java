
package DAO;

import DTO.ChiTietNhapDTO;
import DTO.HoaDonDTO;
import DTO.MenuDTO;
import DTO.TaiKhoanDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MenuDAO {
    ConnectSQL.Connect db=new ConnectSQL.Connect();
    Connection con=db.getCon();
     public boolean updateMenu(MenuDTO s){
         String sql="UPDATE Menu SET TenMon=?,DonGia=?,SoLuongTon=? WHERE MaMon=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getTenMon());
            ps.setInt(2,s.getDonGia());
            ps.setInt(3,s.getSoLuongTon());
            ps.setString(4,s.getMaMon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     public boolean addMenu (MenuDTO s){
         String sql="insert into Menu(MaMon, TenMon, DonGia, SoLuongTon)"+"values(?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaMon());
            ps.setString(2,s.getTenMon());
            ps.setInt(3,s.getDonGia());
            ps.setInt(4,s.getSoLuongTon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
     }
     public boolean deleteMenu(MenuDTO s){
       String sql="delete from Menu where MaMon=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,s.getMaMon());
            if (ps.executeUpdate()>=1)
                return true;
            //return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<MenuDTO> getListMenu(){
        ArrayList<MenuDTO> list=new ArrayList<>();
        String sql="select * from Menu";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                MenuDTO s=new MenuDTO();
                s.setMaMon(rs.getString("MaMon"));
                s.setTenMon(rs.getString("TenMon"));
                s.setDonGia(rs.getInt("DonGia")); 
                s.setSoLuongTon(rs.getInt("SoLuongTon")); 
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }    
    public ArrayList<MenuDTO> searchMenu(String key) throws Exception{
        ArrayList<MenuDTO> lst=new ArrayList<>();
        MenuDTO s;
        String nameString="%"+key+"%";
        String sql="SELECT* FROM Menu WHERE MaMon LIKE ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"%"+key+"%");
        try(ResultSet rs=ps.executeQuery();) {
            while (rs.next()) {
                s=new MenuDTO();
                s.setMaMon(rs.getString("MaMon"));
                s.setTenMon(rs.getString("TenMon"));
                s.setDonGia(rs.getInt("DonGia"));
                s.setSoLuongTon(rs.getInt("SoLuongTon"));
                lst.add(s);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return lst;
    }
}

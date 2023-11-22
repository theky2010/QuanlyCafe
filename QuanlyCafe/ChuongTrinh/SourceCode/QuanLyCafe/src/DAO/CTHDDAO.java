
package DAO;

import DTO.CTHDDTO;
import DTO.HoaDonDTO;
import DTO.MenuDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CTHDDAO {
    ConnectSQL.Connect db=new ConnectSQL.Connect();
    Connection con=db.getCon();
    public boolean addCTHD(CTHDDTO s){
        String sql="insert into CTHD(MaHoaDon,MaMon,SoLuong,Gia,TenMon)"+"values(?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaHoaDon());
            ps.setString(2,s.getMaMon());
            ps.setInt(3,s.getSoLuong());
            ps.setInt(4,s.getGia());
            ps.setString(5,s.getTenMon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return false;
    }
    public boolean updateCTHD(CTHDDTO s){
         String sql="UPDATE CTHD SET MaMon=?,SoLuong=?,Gia=?,TenMon=? WHERE MaHoaDon=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,s.getMaMon());
            ps.setInt(2,s.getSoLuong());
            ps.setInt(3,s.getGia());
            ps.setString(4,s.getTenMon());
            ps.setString(5,s.getMaHoaDon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteCTHD(CTHDDTO s){
       String sql="delete from CTHD where MaHoaDon=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,s.getMaHoaDon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<CTHDDTO> getListCTHD(){
        ArrayList<CTHDDTO> list=new ArrayList<>();
        String sql="select * from CTHD";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                CTHDDTO s=new CTHDDTO();
                s.setMaHoaDon(rs.getString("MaHoaDon"));
                s.setMaMon(rs.getString("MaMon"));
                s.setTenMon(rs.getString("TenMon"));
                s.setSoLuong(rs.getInt("SoLuong"));
                s.setGia(rs.getInt("Gia"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<CTHDDTO> searchCTHD(String key) throws Exception{
        ArrayList<CTHDDTO> lst=new ArrayList<>();
        CTHDDTO s;
        String nameString="%"+key+"%";
        String sql="SELECT* FROM CTHD WHERE MaHoaDon LIKE ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"%"+key+"%");
        try(ResultSet rs=ps.executeQuery();) {
            while (rs.next()) {
                s=new CTHDDTO();
                s.setGia(rs.getInt("Gia"));
                s.setMaHoaDon(rs.getString("MaHoaDon"));
                s.setTenMon(rs.getString("TenMon"));
                s.setMaMon(rs.getString("MaMon"));
                s.setSoLuong(rs.getInt("SoLuong"));
                s.setGia(rs.getInt("Gia"));
                lst.add(s);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return lst;
    }
}

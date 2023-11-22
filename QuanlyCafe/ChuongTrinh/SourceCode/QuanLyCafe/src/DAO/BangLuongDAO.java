package DAO;

import DTO.BangLuongDTO;
import DTO.HoaDonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class BangLuongDAO {
    ConnectSQL.Connect db=new ConnectSQL.Connect();
    Connection con=db.getCon();
     public boolean addBangLuong(BangLuongDTO s){
        String sql="insert into BangLuong(MaNV,TienThuong,TamUng,Luong)"+"values(?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,s.getMaNV());
            ps.setInt(2,s.getTienThuong());
            ps.setInt(3,s.getTamUng());
            ps.setInt(4,s.getLuong());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return false;
    }
    public boolean updateBangLuong(BangLuongDTO s){
        String sql="UPDATE BangLuong SET TienThuong=?,TamUng=?,Luong=? WHERE MaNV=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1,s.getTienThuong());
            ps.setInt(2,s.getTamUng());
            ps.setInt(3,s.getLuong());
            ps.setString(4,s.getMaNV());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return false;
    }
    public boolean deleteBangLuong(BangLuongDTO s){
       String sql="delete from BangLuong where MaNV=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,s.getMaNV());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<BangLuongDTO> getListBangLuong(){
        ArrayList<BangLuongDTO> list=new ArrayList<>();
        String sql="select * from BangLuong";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                BangLuongDTO s=new BangLuongDTO();
                s.setMaNV(rs.getString("MaNV"));
                s.setTienThuong(rs.getInt("TienThuong"));
                s.setTamUng(rs.getInt("TamUng"));
                s.setLuong(rs.getInt("Luong"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<BangLuongDTO> searchBangLuong(String key) throws Exception{
        ArrayList<BangLuongDTO> lst=new ArrayList<>();
        BangLuongDTO s;
        String nameString="%"+key+"%";
        String sql="SELECT * from BangLuong WHERE MaNV LIKE ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"%"+key+"%");
        try(ResultSet rs=ps.executeQuery();) {
            while (rs.next()) {
                s=new BangLuongDTO();
                s.setMaNV(rs.getString("MaNV"));
                s.setTienThuong(rs.getInt("TienThuong"));
                s.setLuong(rs.getInt("Luong"));
                s.setTamUng(rs.getInt("TamUng"));
                lst.add(s);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return lst;
    }
}

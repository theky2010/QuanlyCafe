/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.HoaDonDTO;
import DTO.MenuDTO;
import DTO.TaiKhoanDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HoaDonDAO {
    ConnectSQL.Connect db=new ConnectSQL.Connect();
    Connection con=db.getCon();
    public boolean addHoaDon(HoaDonDTO s){
        String sql="insert into HoaDon(MaHoaDon,NgayLapHD,ThoiGian,SoLuong,MaNV)"+"values(?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaHoaDon());
            ps.setString(2,s.getNgayLapHD());
            ps.setString(3, s.getThoiGian());
            ps.setInt(4,s.getSoLuong());
            ps.setString(5,s.getMaNV());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return false;
    }
    public boolean updateHoaDon(HoaDonDTO s){
         String sql="UPDATE HoaDon SET NgayLapHD=?,ThoiGian=?,SoLuong=?,MaNV=? WHERE MaHoaDon=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,s.getNgayLapHD());
            ps.setString(2, s.getThoiGian());
            ps.setInt(3,s.getSoLuong());
            ps.setString(4,s.getMaNV());
            ps.setString(5,s.getMaHoaDon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteHoaDon(HoaDonDTO s){
       String sql="delete from HoaDon where MaHoaDon=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,s.getMaHoaDon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<HoaDonDTO> getListHoaDon(){
        ArrayList<HoaDonDTO> list=new ArrayList<>();
        String sql="select * from HoaDon";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                HoaDonDTO s=new HoaDonDTO();
                s.setMaHoaDon(rs.getString("MaHoaDon"));
                s.setNgayLapHD(rs.getString("NgayLapHD"));
                s.setThoiGian(rs.getString("ThoiGian"));
                s.setSoLuong(rs.getInt("SoLuong"));
                s.setMaNV(rs.getString("MaNV"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<HoaDonDTO> getListHoaDon1(){
        ArrayList<HoaDonDTO> list=new ArrayList<>();
        String sql="SELECT NgayLapHD, COUNT(*) as SoLuong FROM HoaDon GROUP BY NgayLapHD";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                HoaDonDTO s=new HoaDonDTO();
                s.setNgayLapHD(rs.getString("NgayLapHD"));
                s.setSoLuong(rs.getInt("SoLuong"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    /*public boolean searchHoaDon(HoaDonDTO s){
        String sql="SELECT * FROM HoaDon WHERE MaHoaDon=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                s=new HoaDonDTO();                
                s.setMaHoaDon(rs.getString("MaHoaDon"));
                s.setNgayLapHD(rs.getString("NgayLapHD"));
                s.setThoiGian(rs.getString("ThoiGian"));
                s.setSoLuong(rs.getInt("SoLuong"));
                s.setMaNV(rs.getString("MaNV"));
                return true;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }*/
    public ArrayList<HoaDonDTO> searchHoaDon(String key) throws Exception{
        ArrayList<HoaDonDTO> lst=new ArrayList<>();
        HoaDonDTO s;
        String nameString="%"+key+"%";
        String sql="select * from HoaDon WHERE MaHoaDon LIKE ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"%"+key+"%");
        try(ResultSet rs=ps.executeQuery();) {
            while (rs.next()) {
                s=new HoaDonDTO();
                s.setMaHoaDon(rs.getString("MaHoaDon"));
                s.setNgayLapHD(rs.getString("NgayLapHD"));
                s.setThoiGian(rs.getString("ThoiGian"));
                s.setSoLuong(rs.getInt("SoLuong"));
                s.setMaNV(rs.getString("MaNV"));
                lst.add(s);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return lst;
    }
}

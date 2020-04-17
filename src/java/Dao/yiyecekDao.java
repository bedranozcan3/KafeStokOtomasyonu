/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entity.yiyecek;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author bedra
 */
public class yiyecekDao {
    public List<yiyecek> getyiyecek(){
        List<yiyecek> clist =new ArrayList();
        
           DBConnection db=new DBConnection();
            Connection c= db.connect();
        try {
          
            Statement st= c.createStatement();
            ResultSet rs =st.executeQuery("select * from yiyecek");
            while(rs.next()){
               // System.out.println(rs.getString("name"));
               yiyecek tmp= new  yiyecek(rs.getInt("id"),rs.getString("yemekadi"),rs.getFloat("fiyatı"),rs.getInt("stokadedi"));
                clist.add(tmp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return clist;
    }
    
}

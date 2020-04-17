/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bedra
 */
public class DBConnection {
    public Connection connect(){
        Connection c=null;
        try{
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            c=DriverManager.getConnection("jdbc:mariadb://localhost:3306/kafestok?user=root&password=123456789");
        }catch(SQLException e){
              System.out.println(e.getMessage());
        } catch (ClassNotFoundException | InstantiationException |IllegalAccessException ex) {        
            System.out.println(ex.getMessage());
        } 
        return c;
    }
}

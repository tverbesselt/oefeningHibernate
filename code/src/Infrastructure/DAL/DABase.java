/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infrastructure.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 11640
 */
public abstract class DABase {
    
    private String connString = "jdbc:mysql://localhost:3307/studentregistratie?";
    Connection conn = null;
    
    public Connection GetConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(connString);
            } catch (SQLException ex) {
                
            }
        }
        return conn;
    }
    
}

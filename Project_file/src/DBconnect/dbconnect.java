/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBconnect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp
 */
public class dbconnect {
    
    public static Connection connect(){
        
        Connection con = null ;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:1527/campus2", "root", "");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return con ;
        
    }
    
}

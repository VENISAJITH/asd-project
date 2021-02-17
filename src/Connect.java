/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swathi
 */

    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author swati
 */
public class Connect {
     Connection con;
   
     public Connect()
     {
         try{
             Class.forName("com.mysql.jdbc.Driver");
             
         }
         catch(ClassNotFoundException e)
         {
             System.out.println(e);
             
         }
         try{
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","password");
             
         }
         catch(SQLException e1)
         {
             System.out.println(e1);
         }
     }
     public Connection getRegisterConnection()
     {
         return con;
     }

    public Connection getConnection(){
        return con;
    }
   
   

    
}

    


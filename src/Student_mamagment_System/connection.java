package Student_mamagment_System;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connection {
    public static Connection connect(){
        Connection conn=null;
        try{
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:student_managment_system.db");
        System.out.println("Connected" );
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e+" " );
        }
        return conn;        
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

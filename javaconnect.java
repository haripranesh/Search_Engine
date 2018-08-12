

import java.sql.*;
import javax.swing.*;

public class javaconnect {
    Connection conn=null;
    public static Connection ConnecrDb()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\hp\\Documents\\NetBeansProjects\\My_Search_Engine\\index.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}

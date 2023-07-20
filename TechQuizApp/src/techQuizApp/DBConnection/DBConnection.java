/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techQuizApp.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author spsub
 */
public class DBConnection {
    protected static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","onlineexam","student");
//            JOptionPane.showMessageDialog(null,"Successfully connected to the DB!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException cnf)
        {
            JOptionPane.showMessageDialog(null,"Error in connecting to the DB!","Error!",JOptionPane.ERROR_MESSAGE);
            cnf.printStackTrace();
            System.exit(1);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in connecting to the DB!","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(0);
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
        try
        {
            conn.close();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in disconnecting to the DB!"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}

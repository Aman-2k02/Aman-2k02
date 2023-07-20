/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techQuizApp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import techQuizApp.DBConnection.DBConnection;

/**
 *
 * @author spsub
 */
public class UserDAO {
    public static Boolean ValidateUser(techQuizApp.POJO.UserPOJO ur) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");
        ps.setString(1, ur.getUserID());
        ps.setString(2, ur.getPassword());
        ps.setString(3, ur.getUserType());
        ResultSet result = ps.executeQuery();
        return result.next();
    }
}

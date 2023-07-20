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
import java.sql.Statement;
import java.util.ArrayList;
import techQuizApp.DBConnection.DBConnection;
import techQuizApp.POJO.ExamPOJO;

/**
 *
 * @author spsub
 */
public class ExamDAO {
    private static final Connection CONN = DBConnection.getConnection();
    public static String getExamID() throws SQLException
    {
        
        Statement st = CONN.createStatement();
        ResultSet rst = st.executeQuery("Select count(*) from exam");
        rst.next();
        int count = rst.getInt(1);
        return "EX-"+(count+1);
    }
    public static boolean addExam(ExamPOJO exam) throws SQLException
    {
        PreparedStatement ps = CONN.prepareStatement("insert into exam values(?,?,?)");
        ps.setString(1, exam.getExamID());
        ps.setString(2, exam.getLanguage());
        ps.setInt(3, exam.getTotalQuestion());
        int result = ps.executeUpdate();
        return result == 1;
    }
    public static ArrayList<String> getExamIdBySubject(String subject) throws SQLException
    {
        PreparedStatement ps = CONN.prepareStatement("select examid from exam where language = ?");
        ps.setString(1, subject);
        ResultSet rs = ps.executeQuery();
        ArrayList<String> examIdList = new ArrayList<>();
        while(rs.next())
        {
            examIdList.add(rs.getString(1));
        }
        return examIdList;
    }
    public static int getQuestionCountByExam(String examID) throws SQLException
    {
        PreparedStatement ps = CONN.prepareStatement("select total_question from exam where examid = ?");
        ps.setString(1, examID);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    public static boolean isPaperSet(String subject) throws SQLException
    {
        PreparedStatement ps = CONN.prepareStatement("select 1 from exam where language = ?");
        ps.setString(1, subject);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    public static ArrayList<String> getExamIdBySubject(String userID,String subject) throws SQLException
    {
        String query = "Select examid from exam where language = ? minus select examid from performance where examid = ?";
        PreparedStatement ps = CONN.prepareStatement(query);
        ps.setString(1, subject);
        ps.setString(2, userID);
        ResultSet rs = ps.executeQuery();
        ArrayList<String> examIdList = new ArrayList<>();
        while(rs.next())
        {
            examIdList.add(rs.getString(1));
        }
        return examIdList;
    }
}

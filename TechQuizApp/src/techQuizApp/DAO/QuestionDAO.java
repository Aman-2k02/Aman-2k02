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
import java.util.ArrayList;
import techQuizApp.DBConnection.DBConnection;
import techQuizApp.POJO.QuestionPOJO;
import techQuizApp.POJO.QuestionStore;

/**
 *
 * @author spsub
 */
public class QuestionDAO {
    private static final Connection CONN = DBConnection.getConnection();
    private static PreparedStatement ps;
    public static void addQuestion(QuestionStore qstore) throws SQLException
    {
        ps = CONN.prepareStatement("insert into question values(?,?,?,?,?,?,?,?,?)");
        ArrayList<QuestionPOJO> questionList = qstore.getAllQuestions();
        for(QuestionPOJO q: questionList)
        {
            ps.setString(1, q.getExamID());
            ps.setInt(2, q.getQno());
            ps.setString(3, q.getQuestion());
            ps.setString(4, q.getAnswer1());
            ps.setString(5, q.getAnswer2());
            ps.setString(6, q.getAnswer3());
            ps.setString(7, q.getAnswer4());
            ps.setString(8, q.getCorrectAnswer());
            ps.setString(9, q.getLanguage());
            ps.executeUpdate();
        }
    }
    public static ArrayList<QuestionPOJO> getQuestionsByExamId(String examId) throws SQLException
    {
        ps = CONN.prepareStatement("select * from Question where examid = ?");
        ps.setString(1, examId);
        ResultSet rs = ps.executeQuery();
        ArrayList<QuestionPOJO> questionList = new ArrayList<>();
        while(rs.next())
        {
            int qno = rs.getInt(2);
            String question = rs.getString(3);
            String option1 = rs.getString(4);
            String option2 = rs.getString(5);
            String option3 = rs.getString(6);
            String option4 = rs.getString(7);
            String correctAnswer = rs.getString(8);
            String language = rs.getString(9);
            QuestionPOJO Qp = new QuestionPOJO(examId, qno, question, option1, option2, option3, option4, correctAnswer,language);
            questionList.add(Qp);
        }
        return questionList;
    }
    public static void updateQuestion(QuestionStore qstore) throws SQLException
    {
        ps = CONN.prepareStatement("update question set question=?,answer1=?, answer2=?, answer3=?, answer4=?, correct_answer=? where examid=? and qno=? and language=?");
        ArrayList<QuestionPOJO> questionList = qstore.getAllQuestions();
        for(QuestionPOJO q: questionList)
        {
            ps.setString(1, q.getQuestion());
            ps.setString(2, q.getAnswer1());
            ps.setString(3, q.getAnswer2());
            ps.setString(4, q.getAnswer3());
            ps.setString(5, q.getAnswer4());
            ps.setString(6, q.getCorrectAnswer());
            ps.setString(7, q.getExamID());
            ps.setInt(8, q.getQno());
            ps.setString(9, q.getLanguage());
            ps.executeUpdate();
        }
    }
}

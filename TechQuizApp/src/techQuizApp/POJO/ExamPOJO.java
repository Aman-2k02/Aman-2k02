/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techQuizApp.POJO;

/**
 *
 * @author spsub
 */
public class ExamPOJO {
    private String examID;
    private String language;
    private int totalQuestion;

    public ExamPOJO(String examID, String language, int totalQuestion) {
        this.examID = examID;
        this.language = language;
        this.totalQuestion = totalQuestion;
    }

    public ExamPOJO() {
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }
    
     
}

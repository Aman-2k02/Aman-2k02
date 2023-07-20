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
public class PerformancePOJO {
    private String userId;
    private String examId;
    private int right;
    private int wrong;
    private int unattemped;
    private double percentage;
    private String language;

    public PerformancePOJO() {
    }

    public PerformancePOJO(String userId, String examId, int right, int wrong, int unattemped, double percentage, String language) {
        this.userId = userId;
        this.examId = examId;
        this.right = right;
        this.wrong = wrong;
        this.unattemped = unattemped;
        this.percentage = percentage;
        this.language = language;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnattemped() {
        return unattemped;
    }

    public void setUnattemped(int unattemped) {
        this.unattemped = unattemped;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "PerformancePOJO{" + "userId=" + userId + ", examId=" + examId + ", right=" + right + ", wrong=" + wrong + ", unattemped=" + unattemped + ", percentage=" + percentage + ", language=" + language + '}';
    }
    
    
}

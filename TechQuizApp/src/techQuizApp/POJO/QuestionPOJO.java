/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techQuizApp.POJO;

import java.util.Objects;

/**
 *
 * @author spsub
 */
public class QuestionPOJO {
    private String examID;
    private int Qno;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;
    private String language;

    public QuestionPOJO() {
    }

    public QuestionPOJO(String examID, int Qno, String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer, String language) {
        this.examID = examID;
        this.Qno = Qno;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
        this.language = language;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public int getQno() {
        return Qno;
    }

    public void setQno(int Qno) {
        this.Qno = Qno;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "QuestionPOJO{" + "examID=" + examID + ", Qno=" + Qno + ", question=" + question + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", correctAnswer=" + correctAnswer + ", language=" + language + '}';
    }


    @Override
    public boolean equals(Object obj) {
        QuestionPOJO other = (QuestionPOJO) obj;
                
        if (this.Qno != other.Qno) {
            return false;
        }
        if (this.examID.equals(other.examID) == false) {
            return false;
        }
        if (this.question.equals(other.question) == false) {
            return false;
        }
        if (this.answer1.equals(other.answer1) == false) {
            return false;
        }
        if (this.answer2.equals(other.answer2) == false) {
            return false;
        }
        if (this.answer3.equals(other.answer3) == false) {
            return false;
        }
        if (this.answer4.equals(other.answer4) == false) {
            return false;
        }
        if (this.correctAnswer.equals(other.correctAnswer) == false) {
            return false;
        }
        if (this.language.equals(other.language) == false) {
            return false;
        }
        return true;
    }

    
    
    
}

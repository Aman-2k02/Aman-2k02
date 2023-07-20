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
public class AnswerPOJO {
    private String examId;
    private String subject;
    private int qno;
    private String choosenAnswer;
    private String correctAnswer;

    public AnswerPOJO() {
    }

    public AnswerPOJO(String examId, String subject, int qno, String choosenAnswer, String correctAnswer) {
        this.examId = examId;
        this.subject = subject;
        this.qno = qno;
        this.choosenAnswer = choosenAnswer;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "AnswerPOJO{" + "examId=" + examId + ", subject=" + subject + ", qno=" + qno + ", choosenAnswer=" + choosenAnswer + ", correctAnswer=" + correctAnswer + '}';
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getChoosenAnswer() {
        return choosenAnswer;
    }

    public void setChoosenAnswer(String choosenAnswer) {
        this.choosenAnswer = choosenAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnswerPOJO other = (AnswerPOJO) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.choosenAnswer, other.choosenAnswer)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        return true;
    }
    
    
}

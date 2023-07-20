/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techQuizApp.POJO;

import java.util.ArrayList;

/**
 *
 * @author spsub
 */
public class QuestionStore {
    private ArrayList<QuestionPOJO> questionList;

    public QuestionStore() {
        questionList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "QuestionStore{" + "questionList=" + questionList + '}';
    }
    
    public void addQuestion(QuestionPOJO question)
    {
        questionList.add(question);
    }

    public QuestionPOJO getQuestion(int pos) {
        return questionList.get(pos);
    }
    
    public QuestionPOJO getQuestionByQno(int qno) {
        for(QuestionPOJO question: questionList)
        {
            if(question.getQno() == qno)
                return question;
        }
        return null;
    }

    public void removeQuestion(int pos) {
        questionList.remove(pos);
    }
    
    public void setQuestionAt(int pos,QuestionPOJO q)
    {
        questionList.add(pos, q);
    }
    
    public ArrayList<QuestionPOJO> getAllQuestions()
    {
        return questionList;
    }
    
    public int getCount()
    {
        return questionList.size();
    }
    
}

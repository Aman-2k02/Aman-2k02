/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techQuizApp.GUI;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techQuizApp.DAO.PerformanceDAO;
import techQuizApp.DAO.QuestionDAO;
import techQuizApp.POJO.AnswerPOJO;
import techQuizApp.POJO.AnswerStore;
import techQuizApp.POJO.ExamPOJO;
import techQuizApp.POJO.PerformancePOJO;
import techQuizApp.POJO.QuestionPOJO;
import techQuizApp.POJO.QuestionStore;
import techQuizApp.POJO.UserProfilePOJO;

/**
 *
 * @author spsub
 */
public class TakeTestFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentOptionFrame
     */
    private Color oldColor;
    private QuestionStore qStore;
    private AnswerStore ansStore;
    private ExamPOJO newExam;
    int qno;
    int pos;
    public TakeTestFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblShowName.setText("Hello "+ UserProfilePOJO.getUserName());
        oldColor = lblLogout.getForeground();
        qStore = new QuestionStore();
        ansStore = new AnswerStore();
    }
    public TakeTestFrame(ExamPOJO exam)
    {
        this();
        newExam = exam;
        qno = 1;
        pos = 0;
        lblShowQuestionNo.setText("Question No. "+qno);
        lblShowExamName.setText(newExam.getLanguage().toUpperCase()+" PAPER");
        loadQuestions();
        showQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblShowExamName = new javax.swing.JLabel();
        lblShowName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblShowQuestionNo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jcOption1 = new javax.swing.JRadioButton();
        jcOption2 = new javax.swing.JRadioButton();
        jcOption3 = new javax.swing.JRadioButton();
        jcOption4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tech Quiz App");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblShowExamName.setBackground(new java.awt.Color(0, 0, 0));
        lblShowExamName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblShowExamName.setForeground(new java.awt.Color(153, 255, 153));
        lblShowExamName.setText("Edit  C Paper");

        lblShowName.setBackground(new java.awt.Color(0, 0, 0));
        lblShowName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblShowName.setForeground(new java.awt.Color(102, 255, 102));

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(102, 255, 102));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblShowQuestionNo.setBackground(new java.awt.Color(0, 0, 0));
        lblShowQuestionNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblShowQuestionNo.setForeground(new java.awt.Color(153, 255, 153));
        lblShowQuestionNo.setText("Question no :");

        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtQuestion.setRows(5);
        jScrollPane2.setViewportView(txtQuestion);

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(153, 255, 153));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(153, 255, 153));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(153, 255, 153));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDone.setForeground(new java.awt.Color(153, 255, 153));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jcOption1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jcOption1);
        jcOption1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jcOption1.setForeground(new java.awt.Color(153, 255, 153));
        jcOption1.setText("jRadioButton1");

        jcOption2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jcOption2);
        jcOption2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jcOption2.setForeground(new java.awt.Color(153, 255, 153));
        jcOption2.setText("jRadioButton2");

        jcOption3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jcOption3);
        jcOption3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jcOption3.setForeground(new java.awt.Color(153, 255, 153));
        jcOption3.setText("jRadioButton3");

        jcOption4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jcOption4);
        jcOption4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jcOption4.setForeground(new java.awt.Color(153, 255, 153));
        jcOption4.setText("jRadioButton4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblShowName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblShowQuestionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jcOption1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jcOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jcOption2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jcOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(lblShowExamName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShowName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(lblShowExamName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lblShowQuestionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcOption1)
                    .addComponent(jcOption2))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcOption3)
                    .addComponent(jcOption4))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(oldColor);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        String choosenAnswer = getUserAnswer();
        if(choosenAnswer != null)
        {
            QuestionPOJO ques = qStore.getQuestionByQno(qno);
            String correctAnswer = ques.getCorrectAnswer();
            AnswerPOJO ans = new AnswerPOJO(newExam.getExamID(), newExam.getLanguage(), qno, choosenAnswer, correctAnswer);
            AnswerPOJO attemped = ansStore.getAnswerByQno(qno);
            if(attemped == null)
            {
                ansStore.addAnswer(ans);
            }
            else
            {
                String preAnswer = attemped.getChoosenAnswer();
                if(preAnswer.equals(choosenAnswer))
                {
                    int apos = ansStore.removeAnswer(attemped);
                    ansStore.setAnswerAt(apos, ans);
                }
            }
        }
        pos--;
        if(pos < 0)
        {
            pos = qStore.getCount()-1;
        }
        showQuestion();
        qno--;
        if(qno <= 0)
        {
            qno = qStore.getCount();
        }
        lblShowQuestionNo.setText("Question No : "+qno);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        String choosenAnswer = getUserAnswer();
        if(choosenAnswer != null)
        {
            QuestionPOJO ques = qStore.getQuestionByQno(qno);
            String correctAnswer = ques.getCorrectAnswer();
            AnswerPOJO ans = new AnswerPOJO(newExam.getExamID(), newExam.getLanguage(), qno, choosenAnswer, correctAnswer);
            AnswerPOJO attemped = ansStore.getAnswerByQno(qno);
            if(attemped == null)
            {
                ansStore.addAnswer(ans);
            }
            else
            {
                String preAnswer = attemped.getChoosenAnswer();
                if(preAnswer.equals(choosenAnswer))
                {
                    int apos = ansStore.removeAnswer(attemped);
                    ansStore.setAnswerAt(apos, ans);
                }
            }
        }
        pos++;
        if(pos >= qStore.getCount())
        {
            pos = 0;
        }
        showQuestion();
        qno++;
        if(qno > qStore.getCount())
        {
            qno = 1;
        }
        lblShowQuestionNo.setText("Question No : "+qno);
        showQuestion();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        StudentOptionFrame studentOptionFrame = new StudentOptionFrame();
        studentOptionFrame.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
//        QuestionPOJO ques = qStore.getQuestionByQno(qno);
//        String correctAnswer = ques.getCorrectAnswer();
//        AnswerPOJO ans = new AnswerPOJO(newExam.getExamID(), newExam.getLanguage(), qno, choosenAnswer, correctAnswer);
//        AnswerPOJO attemped = ansStore.getAnswerByQno(qno);
//        if(attemped == null)
//        {
//            ansStore.addAnswer(ans);
//        }
//        else
//        {
//            String preAnswer = attemped.getChoosenAnswer();
//            if(preAnswer.equals(choosenAnswer))
//            {
//                int apos = ansStore.removeAnswer(attemped);
//                ansStore.setAnswerAt(apos, ans);
//            }
//        }
        int right = 0;
        int wrong = 0;
        StringBuilder sb = new StringBuilder();
        for (QuestionPOJO ques: qStore.getAllQuestions()) {
            int qno = ques.getQno();
            System.out.println("qno is : "+qno);
            AnswerPOJO ans = ansStore.getAnswerByQno(qno);
            System.out.println("ans is " + ans);
            if(ans == null)
                continue;
            String attempedAnswer = ans.getChoosenAnswer();
            String correctAnswer = ans.getCorrectAnswer();
            
            if(attempedAnswer.equals(correctAnswer))
                right++;
            else 
                wrong++;
            
            try
            {
                PerformancePOJO performance = new PerformancePOJO();
                performance.setUserId(UserProfilePOJO.getUserName());
                performance.setExamId(ques.getExamID());
                performance.setRight(right);
                performance.setWrong(wrong);
                performance.setUnattemped(qStore.getCount()-(right+wrong));
                performance.setPercentage((double)right/qStore.getCount()*100);
                performance.setLanguage(newExam.getLanguage());
                PerformanceDAO.addPerformance(performance);
                
            }
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
        }
        sb.append("Right answer "+right);
        sb.append("\nWrong Answer "+wrong);
        sb.append("\nUnattemped "+(qStore.getCount()-(right+wrong)));
        JOptionPane.showMessageDialog(this, sb.toString(),"Result",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDoneActionPerformed

    
    
    private void loadQuestions() {
        try
        {
            ArrayList<QuestionPOJO> queList = QuestionDAO.getQuestionsByExamId(newExam.getExamID());
            for (QuestionPOJO question : queList) {
                qStore.addQuestion(question);
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    
    private void showQuestion()
    {
        QuestionPOJO question = qStore.getQuestion(pos);
        buttonGroup1.clearSelection();
        lblShowQuestionNo.setText("Question No. "+question.getQno());
        txtQuestion.setText(question.getQuestion());
        jcOption1.setText(question.getAnswer1());
        jcOption2.setText(question.getAnswer2());
        jcOption3.setText(question.getAnswer3());
        jcOption4.setText(question.getAnswer4());
        AnswerPOJO ans = ansStore.getAnswerByQno(qno);
        if(ans == null)
            return;
        String choosenAns = ans.getChoosenAnswer();
        switch(choosenAns)
        {
            case "answer1":
                jcOption1.setSelected(true);
                break;
            case "answer2":
                jcOption2.setSelected(true);
                break;
            case "answer3":
                jcOption3.setSelected(true);
                break;
            case "answer4":
                jcOption4.setSelected(true);
                break;
        }
    }
    
    private String getUserAnswer()
    {
        if(jcOption1.isSelected())
            return "answer1";
        else if(jcOption2.isSelected())
            return "answer2";
        else if(jcOption3.isSelected())
            return "answer3";
        else if(jcOption4.isSelected())
            return "answer4";
        else
            return null;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton jcOption1;
    private javax.swing.JRadioButton jcOption2;
    private javax.swing.JRadioButton jcOption3;
    private javax.swing.JRadioButton jcOption4;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblShowExamName;
    private javax.swing.JLabel lblShowName;
    private javax.swing.JLabel lblShowQuestionNo;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}

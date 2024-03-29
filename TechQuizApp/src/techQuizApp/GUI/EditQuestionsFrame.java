/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techQuizApp.GUI;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;
import techQuizApp.DAO.ExamDAO;
import techQuizApp.DAO.QuestionDAO;
import techQuizApp.POJO.ExamPOJO;
import techQuizApp.POJO.QuestionPOJO;
import techQuizApp.POJO.QuestionStore;
import techQuizApp.POJO.UserProfilePOJO;

/**
 *
 * @author spsub
 */
public class EditQuestionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditQuestionsFrame
     */
    private ExamPOJO editExam;
    private QuestionStore qStore;
    QuestionPOJO question;
    private Color oldColor;
    private final HashMap<String,String> answerMap;
    int pos;
    private int questionNo = 1;
    private String que;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;
    
    
    public EditQuestionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
        oldColor = lblLogout.getForeground();
        pos = 0;
        this.answerMap = new HashMap<>();
        answerMap.put("Option 1", "answer1");
        answerMap.put("Option 2", "answer2");
        answerMap.put("Option 3", "answer3");
        answerMap.put("Option 4", "answer4");
        lblShowUerName.setText("Hello "+UserProfilePOJO.getUserName());        
        
    }
    
    public EditQuestionsFrame(ExamPOJO exam) {
        this();
        this.editExam = exam;
        lblShowExamName.setText("EDIT "+editExam.getLanguage().toUpperCase()+" PAPER");
        qStore = new QuestionStore();
        loadQuestions();
        showQuestion();
        System.out.println(qStore.getCount());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblShowUerName = new javax.swing.JLabel();
        lblShowExamName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblShowQuestionNo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOption1 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOption3 = new javax.swing.JTextField();
        txtOption4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcAnswerList = new javax.swing.JComboBox<>();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblShowUerName.setBackground(new java.awt.Color(0, 0, 0));
        lblShowUerName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblShowUerName.setForeground(new java.awt.Color(102, 255, 102));

        lblShowExamName.setBackground(new java.awt.Color(0, 0, 0));
        lblShowExamName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblShowExamName.setForeground(new java.awt.Color(153, 255, 153));
        lblShowExamName.setText("Edit  C Paper");

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

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("Option 1");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 153));
        jLabel5.setText("Option 2");

        txtOption1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtOption2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 153));
        jLabel6.setText("Option 3");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 153));
        jLabel7.setText("Option 4");

        txtOption3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtOption4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 153));
        jLabel8.setText("Correct Answer");

        jcAnswerList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcAnswerList.setMaximumRowCount(4);
        jcAnswerList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 1", "Option 2", "Option 3", "Option 4" }));

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

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(153, 255, 153));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblShowUerName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(lblShowExamName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblShowQuestionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 51, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jcAnswerList, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtOption4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShowUerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblShowExamName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(lblShowQuestionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcAnswerList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        Boolean result = validateInputs();
        if(result == false)
        {
            JOptionPane.showMessageDialog(this, "Please input all values","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }

        question = new QuestionPOJO();
        question.setQno(questionNo);
        question.setExamID(editExam.getExamID());
        question.setQuestion(que);
        question.setAnswer1(option1);
        question.setAnswer2(option2);
        question.setAnswer3(option3);
        question.setAnswer4(option4);
        question.setCorrectAnswer(correctAnswer);
        question.setLanguage(editExam.getLanguage());

        qStore.removeQuestion(pos);
        qStore.setQuestionAt(pos, question);
        pos--;
        if(pos < 0)
        {
            JOptionPane.showMessageDialog(this, "You Have Successfully Editted The Paper.","Notification",JOptionPane.INFORMATION_MESSAGE);
            pos = qStore.getCount()-1;
        }
        showQuestion();
        questionNo--;
        if(questionNo <= 0)
        {
            questionNo = qStore.getCount();
        }
        lblShowQuestionNo.setText("Question No : "+questionNo);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        int ans = JOptionPane.showConfirmDialog(this, "Are you sure you want to save the changes to the database.","Comformation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

        if(ans != JOptionPane.YES_OPTION)
        {
            return;
        }
        try
        {
            //            ExamDAO.addExam(editExam);
            QuestionDAO.updateQuestion(qStore);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured while saving in database", "Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        this.dispose();
        AdminOptionFrame adminOption = new AdminOptionFrame();
        adminOption.setVisible(true);
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        EditPaperFrame editPaper = new EditPaperFrame();
        editPaper.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        Boolean result = validateInputs();
        if(result == false)
        {
            JOptionPane.showMessageDialog(this, "Please input all values","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        question = new QuestionPOJO();
        question.setQno(questionNo);
        question.setExamID(editExam.getExamID());
        question.setQuestion(que);
        question.setAnswer1(option1);
        question.setAnswer2(option2);
        question.setAnswer3(option3);
        question.setAnswer4(option4);
        question.setCorrectAnswer(correctAnswer);
        question.setLanguage(editExam.getLanguage());

        qStore.removeQuestion(pos);
        qStore.setQuestionAt(pos, question);
        pos++;
        if(pos >= qStore.getCount())
        {
            JOptionPane.showMessageDialog(this, "You Have Successfully Editted The Paper.","Notification",JOptionPane.INFORMATION_MESSAGE);
            pos = 0;
        }
        showQuestion();
        questionNo++;
        if(questionNo > qStore.getCount())
        {
            questionNo = 1;
        }
        lblShowQuestionNo.setText("Question No : "+questionNo);
    }//GEN-LAST:event_btnNextActionPerformed

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(oldColor);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked
    
    
    private void showQuestion()
    {
        QuestionPOJO question = qStore.getQuestion(pos);
        lblShowQuestionNo.setText("Question No. "+question.getQno());
        txtQuestion.setText(question.getQuestion());
        txtOption1.setText(question.getAnswer1());
        txtOption2.setText(question.getAnswer2());
        txtOption3.setText(question.getAnswer3());
        txtOption4.setText(question.getAnswer4());
        jcAnswerList.setSelectedItem(getKeyFromValue(question.getCorrectAnswer()));
        
    }
    
    private String getKeyFromValue(String value)
    {
        Set<String> keys = answerMap.keySet();
        for(String key : keys)
        {
            if(value.equals(answerMap.get(key)))
                return key;
        }
        return null;
    }
    
    private Boolean validateInputs() {
        que = txtQuestion.getText().trim();
        option1 = txtOption1.getText().trim();
        option2 = txtOption2.getText().trim();
        option3 = txtOption3.getText().trim();
        option4 = txtOption4.getText().trim();
        correctAnswer = answerMap.get(jcAnswerList.getSelectedItem().toString());
        return !(que.isEmpty() || option1.isEmpty() || option2.isEmpty() || option3.isEmpty() || option4.isEmpty());
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
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQuestionsFrame().setVisible(true);
            }
        });
    }

    private void loadQuestions() {
        try
        {
            ArrayList<QuestionPOJO> queList = QuestionDAO.getQuestionsByExamId(editExam.getExamID());
            for (QuestionPOJO question : queList) {
                qStore.addQuestion(question);
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcAnswerList;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblShowExamName;
    private javax.swing.JLabel lblShowQuestionNo;
    private javax.swing.JLabel lblShowUerName;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}

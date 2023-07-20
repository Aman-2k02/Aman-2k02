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
public class RegisterStudentPOJO {
    private String userID;
    private char [] password;
    private char [] repoPassword;

    public String getUserID() {
        return userID;
    }

    public RegisterStudentPOJO(String userID, char[] password, char[] repoPassword) {
        this.userID = userID;
        this.password = password;
        this.repoPassword = repoPassword;
    }

    
    
    @Override
    public String toString() {
        return "RegisterStudentPOJO{" + "userID=" + userID + ", password=" + password + ", repoPassword=" + repoPassword + '}';
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public char[] getRepoPassword() {
        return repoPassword;
    }

    public void setRepoPassword(char[] repoPassword) {
        this.repoPassword = repoPassword;
    }
    
    
}

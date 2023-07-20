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
public class UserProfilePOJO {
    private static String userName;
    private static String userType;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserProfilePOJO.userName = userName;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        UserProfilePOJO.userType = userType;
    }
    
}

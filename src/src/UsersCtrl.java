package src;

import impl.StringBinarySearch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nuclei
 */
public class UsersCtrl {
    
    // user names length should equal to password length because user[x] ==> password[x] 
    private static String[] USER_NAMES = { "sithumini", "sammy","deshan", "tilan", "supun", "udara", "ravindra", "thamali" };    
    private static String[] USER_PASSWORD = { "s123","s123", "d123", "t123", "s123", "u123", "r123", "t123" };
    
    
    public String[] getUsernameList(){
        return USER_NAMES;
    }
    
    private String getPasswordByIndex(Integer userIndex){
        return USER_PASSWORD[userIndex];
    }
    
    private Boolean isMatchPasswordByIndex(String password, Integer userIndex){
        return getPasswordByIndex(userIndex).equals(password);
    }
    
    public  String checkUsernameAndPassword(String username, String password){
        
        // implementing binary search... Search users by username
        int isExsistUser = StringBinarySearch.bsearch(username, USER_NAMES, 0, USER_NAMES.length);
        
        // if position is less than 0, that means it is not there.
        if(isExsistUser < 0){
            return "User name does not found";
        }
        
        
        Boolean isMatchPasswod = isMatchPasswordByIndex(password, isExsistUser);
        
        if(!isMatchPasswod){
            return "Invalid Credentials.";
        }
        
        return "SUCCESS";
    };

}

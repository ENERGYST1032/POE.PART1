/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class LogInClass {
    
 
    
      public static boolean checkPasswordComplexity(String password) {
        // Check password length
        if (password == null || password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password too short!");
            return false;
        }

        // Check for capital letters, numbers, and special characters using regex
        boolean hasCapital = Pattern.compile("[A-Z]").matcher(password).find();
        boolean hasNumber = Pattern.compile("[0-9]").matcher(password).find();
        boolean hasSpecialChar = Pattern.compile("[^a-zA-Z0-9]").matcher(password).find();

        if (!hasCapital) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one capital letter!");
            return false;
        }

        if (!hasNumber) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one number!");
            return false;
        }

        if (!hasSpecialChar) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one special character!");
            return false;
        }

        // Password is valid
        return true;
    

       
    }
    public static boolean checkUserName(String username) {
    if (!username.contains("_")) {
        // If username does not contain an underscore
        return false;
    } else if (username.length() >= 5) {
        // If username is longer than 5 characters
        return false;
    } else {
        // If username contains an underscore and has no more than 5 characters
        return true;
    }
    
    } 
    
    
    
    
    public static boolean loginUser(String Username,String username ){
      if(Username.equals(username)){
          JOptionPane.showMessageDialog(null,"User name correct.");
      }else { 
          JOptionPane.showMessageDialog(null, "Incorrct user name.");
      }
        return true;
        
       
            
        
    }
    
    public static boolean loginPassword(String Password , String password){
         if(!Password.equals(password)){
             JOptionPane.showMessageDialog(null, "Incorrect password.");
        } else {
             JOptionPane.showMessageDialog(null, "Welcome");
        } 
        return true ;
    }
    
}

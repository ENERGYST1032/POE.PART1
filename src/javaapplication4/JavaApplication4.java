package javaapplication4;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import static javaapplication4.LogInClass.checkPasswordComplexity;
import static javaapplication4.LogInClass.checkUserName;

import static javaapplication4.LogInClass.loginPassword;
import static javaapplication4.LogInClass.loginPassword;
import static javaapplication4.LogInClass.loginUser;


public class JavaApplication4 {
    
    public String firstname ;
    public String username ;
    public String password ;
    public String lastname ;
    public static void main(String[] args) {
        
        //Registration registration = new Registration();

        // Prompt user to enter registration details
        String firstname = JOptionPane.showInputDialog("Enter your first name:");
        String lastname = JOptionPane.showInputDialog("Enter your lastname");
        String username = "";
        String password = "";
        
      
    
        do { 
            username = JOptionPane.showInputDialog(null, "Enter your username that contains an underscore(_) and is no more 5 characters."); 
        } while (!checkUserName(username));{
               JOptionPane.showMessageDialog(null,"Username successfully captured.");
        }

        do {
            password = JOptionPane.showInputDialog(null, "Please enter a password that meets the following requirements:\n- At least 8 characters long\n- Contain a capital letter\n- Contain a number\n- Contain a special character");
        } while (!checkPasswordComplexity(password));{
        JOptionPane.showMessageDialog(null,"Password successfully captured.");
        }
        
        
   
       // Out put message to inform user that they have created an account successfully .
      JOptionPane.showMessageDialog(null, "Account successfully created. Welcome " + username + " Would you like to log in... ");
     
    
      
    
       
      //............................................. LOG IN .................................................
      
      LogInClass loginclass = new LogInClass(); 
        
     String Username = JOptionPane.showInputDialog("Enter your username:"); 
      String Password = JOptionPane.showInputDialog("Enter your password:");
      
      if(Username.equals(username)&& Password.equals(password)){
         
          
      JOptionPane.showMessageDialog(null,"Welcome " + firstname +" "+ lastname + " it is nice to see you again." );
      } else {
          JOptionPane.showMessageDialog(null,"User name or password incorrect, please try again.");
          
     }
     
    /*  while(!Username.equals(username)&& !Password.equals(password)){
           JOptionPane.showMessageDialog(null,"Welcome " + firstname +" "+ lastname + " it is nice to see you again." );
           
      }
      */
      
        
    

       
    }
    
     
    

    
    
    
   
    
    
    
 

}

          

            
    

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

/**
 *
 * @author intern02
 */
 import javax.swing.JOptionPane;
public class Grades{
/**
 * This class will be used to run the program
 */
  
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // this is made so a selection can be made for which student object shall be created!
        boolean done = false;
        String response;
        while(!done){
          response = JOptionPane.showInputDialog(null,"Welcome Enter 1 for English Student"
                  + "\n 2 for Math Student"+"\n Or 3 for a(n) Science Student");
          if(response == null){
            JOptionPane.showMessageDialog(null,"Good-Bye.");
            done = true;
          }
          else if(response.equals("")){
               JOptionPane.showMessageDialog(null,"You must enter input for the program to work!","ERROR",JOptionPane.ERROR_MESSAGE);
          }
          // this will be a English Student object to be created
          else if(Integer.parseInt(response)== 1){
             int midterm = Integer.parseInt(JOptionPane.showInputDialog("Enter Midterm Grade."));
             int finals = Integer.parseInt(JOptionPane.showInputDialog("Enter Finals Grade."));
             int presentation = Integer.parseInt(JOptionPane.showInputDialog("Enter presentation Grade."));
             int research = Integer.parseInt(JOptionPane.showInputDialog("Enter research Grade."));
             Student person = new EnglishStudent(midterm,finals,presentation,research);
             done = true;
          }
          // this will be a Math Student object to be created
          else if(Integer.parseInt(response)== 2){
              int midterm = Integer.parseInt(JOptionPane.showInputDialog("Enter Midterm Grade."));
              int finals = Integer.parseInt(JOptionPane.showInputDialog("Enter Finals Grade."));
              Student person = new MathStudent(midterm,finals);
              done = true;
          }
          //this will be a Science Student object to be created
          else if(Integer.parseInt(response)== 3){
              int midterm = Integer.parseInt(JOptionPane.showInputDialog("Enter Midterm Grade."));
              int finals = Integer.parseInt(JOptionPane.showInputDialog("Enter Finals Grade."));
              int research = Integer.parseInt(JOptionPane.showInputDialog("Enter research Grade."));
              Student person = new ScienceStudent(midterm,finals,research);
              done = true;
         }
          else{
           JOptionPane.showMessageDialog(null,"Wrong Input only 1,2 or 3 try again.","ERROR",JOptionPane.ERROR_MESSAGE);
          }
         
      }     
      
    }
    
}// end class

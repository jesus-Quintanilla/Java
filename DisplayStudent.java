/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

/**
 *
 * @author intern02
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DisplayStudent extends JFrame {
 /**
  * This will hold all the GUI's to display the students
  * this must take the a Student object to be able to calculate grade + 
  */  
  private Student holdStudent;
  private JLabel displayLabel,boolLabel,toCharLabel,numericLabel;
  private JRadioButton bool,toChar,numeric;
  private JButton button;
  private JPanel buttonPanel,gradePanel,checkBoxPanel;
  
  DisplayStudent(){
     // nor args constructor will not display anything!!!!!!
     holdStudent = null;
 }// end constructor
  /**
   * 
   * @param stu 
   */
 DisplayStudent(Student stu){
     // constructor that takes in object of type Student
     super("Student's Grade");
     holdStudent = stu;
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     buildButtonPanel();
     buildGradePanel();
     buildCheckBoxPanel();
     pack();
     setVisible(true);
     
 }// end 2nd constructor
  private void buildButtonPanel(){
      buttonPanel = new JPanel();
      button = new JButton("Submit");
      button.addActionListener(new ButtonListener());
      buttonPanel.add(button);
      add(buttonPanel,BorderLayout.SOUTH);
    
  }// end build
  private void buildGradePanel(){
      gradePanel = new JPanel();
      boolLabel = new JLabel();
      toCharLabel = new JLabel();
      numericLabel = new JLabel();
      gradePanel.add(numericLabel);
      gradePanel.add(toCharLabel);
      gradePanel.add(boolLabel);
      add(gradePanel,BorderLayout.EAST);
     
      
      
  }// end build
  
  private void buildCheckBoxPanel(){
      ButtonGroup group = new ButtonGroup();
      checkBoxPanel = new JPanel();
      displayLabel = new JLabel("Pick Which Grading Method To Display");
      bool = new JRadioButton("Pass Or Fail");
      toChar = new JRadioButton("Letter Grade");
      numeric = new JRadioButton("Numeric Grade");
      bool.addActionListener(new ButtonListener());
      toChar.addActionListener(new ButtonListener());
      numeric.addActionListener(new ButtonListener());
      group.add(bool);
      group.add(toChar);
      group.add(numeric);
      checkBoxPanel.add(displayLabel);
      checkBoxPanel.add(numeric);
      checkBoxPanel.add(toChar);
      checkBoxPanel.add(bool);
      add(checkBoxPanel,BorderLayout.CENTER);
     
      
      
  }// end build
  
  /*private class CheckListener implements ItemListener{
     @Override
     public void itemStateChanged(ItemEvent e) {
       // this is for the check box
    
      }// end itemstatechanged
      
  }// end checklistener*/
  /**
   * 
   */
  private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           // this is for the button
         int finalGrade =0;
         if(numeric.isSelected()){
            if(holdStudent.toString().equalsIgnoreCase("Math")){
                finalGrade=(int)calculateGrade(holdStudent.getMidterm(),holdStudent.getFinal());
            }
            else if(holdStudent.toString().equalsIgnoreCase("Science")){
                finalGrade=(int) calculateGrade(holdStudent.getMidterm(),holdStudent.getResearch(),holdStudent.getFinal());
            }
            else if(holdStudent.toString().equalsIgnoreCase("English")){
                finalGrade=(int) calculateGrade(holdStudent.getMidterm(),holdStudent.getFinal(),
                       holdStudent.getPresentation(),holdStudent.getResearch() );
            }
            numericLabel.setText(""+finalGrade);
            // this will call the student.calculateGrade
         }
         // these two dont work fix them!!!@!@!@!
         else if(toChar.isSelected()){
            char answer;
            answer = toLetterGrade(Integer.parseInt(numericLabel.toString()));
           // this will call the student.toLetterGrade()
           toCharLabel.setText("You're Letter Grade Is: "+answer);
         }
         else if(bool.isSelected()){
             if(passOrFail(Integer.parseInt(numericLabel.toString()))==true){
                 boolLabel.setText("You Passed!");
             }
             else{
                 boolLabel.setText("You Failed.");
             }
             
             // this will call the student.passOrFail 
             // NOTE** must make an if statement to see if this function will be
             // true of false.
         }
         pack();
        }// end actionperformed
        
        
  }// end button class
  

public static void main(String[]args){
      DisplayStudent displayStudent = new DisplayStudent(null);
}// this is used to test this class! not to be used when main program is runing.
    /**
     * This is one of three methods that will be overloaded to 
     * Calculate final grade.
     * @param finals will be used to calculate final grade
     * @param midterms will be used to calculate final grade
     * @return will return final grade.
     */
    public double calculateGrade(double finals,double midterms){
        double finalGrade = (finals+midterms)/2;
        return finalGrade;
     }// end 1st calclateGrade
    /**
     * this is the second overloaded method to be used forScience student
     * @param finals
     * @param midterms
     * @param research this is the only thing different in this method
     * @return will return final grade
     */
    public double calculateGrade(double finals,double midterms,double research){
        double finalGrade =(finals+midterms+research)/3;
        
        return finalGrade;
     }// end 2nd calclateGrade
    /**
     * This is to be use for the science student 
     * @param finals
     * @param midterms
     * @param research
     * @param presentation this is the only thing different about the method
     * @return 
     */
     public double calculateGrade(double finals,double midterms,double research,double presentation){
        double finalGrade = (finals+midterms+research+presentation)/4;
        return finalGrade;
     }// end last calclateGrade
     public char toLetterGrade(double finalgrade){
         char grade;
         if( finalgrade >=90){
             grade = 'A';
         }
         else if(( finalgrade >=80)&&( finalgrade <90)){
             grade = 'B';
         }
         else if(( finalgrade >=70)&&( finalgrade < 80)){
             grade = 'C';
         }
         else if(( finalgrade >=60)&&( finalgrade <70)){
             grade = 'D';
         }
         else{
             grade = 'F';
         }
         return grade;
     }// end to char
     
     public boolean passOrFail(int finalGrade){
         boolean passNfail = false;
         if(finalGrade >=60){
             passNfail = true;
         }
         return passNfail;
     }// end passOrFail



}// end class

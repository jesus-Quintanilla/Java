/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

/**
 *
 * @author intern02
 */
public class Student {
    private String name;
    private String id;
    /**
     * This will be the super class student whom which all student will be derived from!
     *  Also each student has a midterm and a final anything else will be made in each class
     */
    Student(){
        name = null;
        id = null;
    }// end no arg constructor
    Student(String person,String ident){
        name = person;
        id = ident;
    }
    public void setName(String person){
        name = person;
    }
    public void setID(String ident){
        id = ident;
    }
    public String getName(){
        return name;
     }
    public String getID(){
        return id;
    }
  public int getMidterm(){
     int midterms = 0;
     return midterms ;
 }// end get
 
 public int getFinal(){
     int finals = 0;
     return finals ;
 }// end get
 
 public int getPresentation(){
     int presentations = 0;
     return presentations;
 }// end get
 
 public int getResearch(){
     int research = 0;
     return research;
 }// end get
     /**
     * 
     * @return 
     */
    @Override
     public String toString(){
         String str ="This is the Student SuperClass"
                 + "\n Name of Student is: "+name
                 +"ID of Student is: "+id;
         return str;
     }
}// end class

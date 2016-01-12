/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

/**
 *
 * @author intern02
 */

public class MathStudent extends Student {
 final double MATH_MIDTERM=0.35;
 final double MATH_FINAL=0.65;
 private int finals,midterms;
 MathStudent(int mid,int fin){
     midterms = mid;
     finals = fin;
     new DisplayStudent(this);
     
 }
 @Override
 public int getFinal(){
     return finals;
 }
 @Override
 public int getMidterm(){
     return midterms;
 }
 
 @Override
 public String toString(){
     String str ="Math";
     return str;
 }
 
}// end class

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

/**
 *
 * @author intern02
 */
public class EnglishStudent extends Student {
 final double ENGLISH_MIDTERM=0.25;
 final double ENGLISH_FINAL=0.35;
 final double ENGLISH_RESEARCH=0.20;
 final double ENGLISH_PRESENTATION=0.20;
 final int midterms,finals,presentations,research;
  
 EnglishStudent(int midterm,int fin,int pres,int res){
      midterms = midterm;
      finals = fin;
      presentations = pres;
      research = res;
      new DisplayStudent(this);
  }// end constructor 
 
 @Override
 public int getMidterm(){
     return midterms ;
 }// end get
 
 @Override
 public int getFinal(){
     return finals ;
 }// end get
 
 @Override
 public int getPresentation(){
     return presentations;
 }// end get
 
 @Override
 public int getResearch(){
     return research;
 }// end get
 

 @Override
 public String toString(){
     String str ="English";
     return str;
 }

  
}// end class 

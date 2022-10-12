import java.util.Scanner;
import java.util.*;
class Student{
 int rollno;
 void getnumber(){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the roll no.:");
   rollno = sc.nextInt();
  }
 void putnumber(){
   System.out.println("the roll no. is : " + rollno);
  }
 }
class test extends Student{
 float sem1,sem2;
 void getmarks(){
   Scanner sc = new Scanner(System.in);
   System.out.println("the sem1 and sem2 marks respectively: " );
   sem1 = sc.nextFloat();  
   sem2 = sc.nextFloat();
  }
 void putmarks(){
  System.out.println("the sem1 marks are : "+ sem1);  
  System.out.println("the sem1 marks are : "+ sem2);  
 }
}
interface sports{
 public static final float score = 20;
 void putscore();
}
class Result extends test implements sports{
 float total;
 void display(){
   total = sem1 + sem2+ score;
   putnumber();
   putmarks();
   putscore();
   System.out.println("the total marks are :"+ total);
  }
  public void putscore(){
    System.out.println("the score is : "+ score);
  }
 }
class Exp9{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  Result ob = new Result();
  ob.getnumber();
  ob.getmarks();
  ob.display();
 }
}

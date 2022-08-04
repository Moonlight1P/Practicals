import java.io.*;
import java.util.*;
class exp4
{
 void Area(double r)
 {
   double a=3.14*r*r;
   System.out.println("Area of circle:" + a);
 }
 void Area(int length, int breadth)
 {
  int a = length*breadth;
  System.out.println("Area of rectangle:" + a);
 } 
 void Area(int side)
 {
  int a = side*side;
  System.out.println("Area of square:" + a);
 }
 void Area(double base, double height)
 {
  double a = 0.5*base*height;
  System.out.println("Area of triangle:" + a);
 }
 public static void main(String[] args)
 {
  exp4 obj = new exp4();
  obj.Area(6);
  obj.Area(4,5);
  obj.Area(9);
  obj.Area(3,8);
 }
}

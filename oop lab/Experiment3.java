import java.util.Scanner;
class Rectangle
{
    double length,breadth,area,perimeter;
	void getDim(double l,double b){
		length=l;
		breadth=b;
	}
	void Area(){
		area=length*breadth;
		System.out.println("\n Area of rectangle: "+area);
	}
	void Perimeter(){
		perimeter=2*(length+breadth);
		System.out.println("Perimeter of rectangle: "+perimeter);
	}
	void Area(double x){
		area=x*x;
		System.out.println("Area of Square : "+area);
	}
}
public class Experiment3
{
	public static void main(String[] args){
		Rectangle ob1= new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		double length = sc.nextDouble();
		System.out.println("Enter Breadth");
		double breadth = sc.nextDouble();
		ob1.getDim(length,breadth);
		ob1.Area();
		ob1.Perimeter();
		System.out.println("\nEnter Side");
		double side = sc.nextDouble();
		ob1.Area(side);
	}
}

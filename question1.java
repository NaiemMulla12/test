// write a java program to crete a class called shape with a method called getArea(),create a subclass called rectangle that override the getArea()
// method to calculate the area of a rectangle
package Test;
//method to get area
class Shape{
	public double getArea() {
		return 0.0;
	}
}

// rectangle class, subclass of shape
class Reactangle extends Shape{
	public double length;
	public double width;
	
	//constructor for rectangle
	public Reactangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	
	//override the getArea() ,method to calculate area of reactangle
	public double getArea() {
		return length*width;
	}
}

public class question1 {

	public static void main(String [] args) {
		//create a reactangle object
		Reactangle rt=new Reactangle(5.0,3.0);
		
		System.out.println("Area of the reactangle: "+rt.getArea());
	}
}

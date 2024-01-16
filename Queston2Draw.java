//Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. 
//Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw()
//method to draw their respective shapes.


package Test;

//Drawable interface
interface Drawable {
void draw();
}

//Circle class implementing Drawable interface
class Circle implements Drawable {

public void draw() {
   System.out.println("Drawing a circle");  
}
}

//Rectangle class implementing Drawable interface
class Rectangle implements Drawable {

public void draw() {
   System.out.println("Drawing a rectangle");
}
}
//Triangle class implementing Drawable interface
class Triangle implements Drawable {

public void draw() {
   System.out.println("Drawing a triangle");
}
}

public class Queston2Draw {

	 public static void main(String[] args) {
	        // Create objects of different shapes
	        Drawable circle = new Circle();
	        Drawable rectangle = new Rectangle();
	        Drawable triangle = new Triangle();

	        // Draw each shape
	        circle.draw();
	        rectangle.draw();
	        triangle.draw();
	    }
}

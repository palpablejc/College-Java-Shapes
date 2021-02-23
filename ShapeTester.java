/**
 * CIS 225 This program displays the area and perimeter of circles, squares,
 * and rectangles using other classes
 * @author John Carter
 * @version 1.0 12/2/16
 */
public class ShapeTester {
    /**
     * main method
     * @param args 
     */
	public static void main(String[] args) {
            /** main entry point for program */
            
		//create a Circle object
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(2);
		
		// squares
		Square square1 = new Square();
                Square square2 = new Square(2);
                
                // rectangles
                Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(2, 3);
		
		//output circles
		System.out.println("Area of circle 1: \t \t" + circle1.getArea());
		System.out.println("Area of circle 2: \t \t" + circle2.getArea());
		System.out.println("Perimeter of circle 1: \t \t" + circle1.getPerimeter()); 
                System.out.println("Perimeter of circle 2: \t \t" + circle2.getPerimeter());
                
                System.out.println();
		
		//output squares
		System.out.println("Area of square 1: \t \t" + square1.getArea());
                System.out.println("Area of square 2: \t \t" + square2.getArea());
                System.out.println("Perimeter of square 1: \t \t" + square1.getPerimeter());
                System.out.println("Perimeter of square 2: \t \t" + square2.getPerimeter());
                
                System.out.println();
                
                //output rectangle
                System.out.println("Area of rectangle 1: \t \t" + rectangle1.getArea());
                System.out.println("Area of rectangle 2: \t \t" + rectangle2.getArea());
                System.out.println("Perimeter of rectangle 1:  \t" + rectangle1.getPerimeter());
                System.out.println("Perimeter of rectangle 2:  \t" + rectangle2.getPerimeter());
	}
}

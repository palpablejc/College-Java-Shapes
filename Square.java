/**
 * 
 * @author John Carter
 */
public class Square {
	//instance var
	double size;
	
	//constructors
	Square(){
		size = 1;
	}
	
	Square(double inputSize) {
		size = inputSize;
	}
	/** Return the area of this square */
	double getArea() {
		return size * size;
	}

	/** Return the perimeter of this square */
	double getPerimeter() {
		return size * 4;
	}

	/** Set a new radius for this square */
	void setSize(double newSize) {
		size = newSize;
	}
	
	
}

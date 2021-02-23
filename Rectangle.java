

/**
 *
 * @author John Carter
 */
public class Rectangle {
    double length;
    double width;
    
    //constructors
    Rectangle() {
        length = 1;
        width = 2;
    }
    
    Rectangle(double inputLen, double inputWidth) {
        length = inputLen;
        width = inputWidth;
        
    }
    /** Return the area of this rectangle */
	double getArea() {
		return length * width;
	}

	/** Return the perimeter of this square */
	double getPerimeter() {
		return ((length * 2) + (width * 2));
	}

	/** Set a new radius for this square */
	void setLength(double newLength) {
		length = newLength;
	}
        void setWidth(double newWidth) {
		width = newWidth;
	}
    
}

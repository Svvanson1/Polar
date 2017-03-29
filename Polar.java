public class Polar {

	public String rectangularPolar(double x, double y) { //returns polar given rectangular
		double radius = Math.sqrt((x*x) + (y*y));
		double angle = Math.acos(x / radius);
		return "The polar point is: " + Double.toString(radius) + "," + Double.toString(angle);
	}
	
	public String polarRectangular(double angle, double radius) { //returns rectangular given polar
		double x = Math.cos(angle) * radius;
		double y = Math.sin(angle) * radius;
		return "The rectangular point is: " + Double.toString(x) + "," + Double.toString(y);
	}
	
	public String completeTriangle(double a, double b, double c) { //TODO
		double missingSide = 0;
		if (c == 0) {
			missingSide = Math.sqrt((a*a) + (b*b));
		}
		
		if (b == 0) {
			missingSide = Math.sqrt((c*c) - (a*a));
		}
		
		if (a == 0) {
			missingSide = Math.sqrt((c*c) - (b*b));
		}
	}
	
	public boolean isPositive(double x) {
		if (x > 0) {
			return true;
		}
		return false;
	}
	
	public String whatQuadrantPoint(double x, double y) { //returns what quadrant the point is located in
		boolean positive = false, negative = false;
			if (x == 0 || y == 0) {
				return "On axis";
			}
			if (isPositive(x) && isPositive(y)) {
				return "1";
			}
			if (isPositive(x) == false && isPositive(y)) {
				return "2";
			}
			if ((isPositive(x) == false) &&  (isPositive(y) == false)) {
				return "3";
			}
			else {
				return "4";
			}
		}
	
	public Double getInRange(double x) { //gets double into range of 0-2 radians by adding or subtracting 1 radian until it's in range
		boolean NotinRange = true;
		while (NotinRange) {
		if (x > 0 && x < 2) {
			NotinRange = false;
			return x;
			}
		else {
			if (x > 2) {
				x--;
			}
			if (x < 0) {
				x++;
					}
				}
			}
		return x;
	}
	
	public Double negativePositive(double x) { //returns the positive angle given a negative angle 
		while (x < 0) {
			x += 2;
		}
		return x;
	}
	
	public String whatQuadrantAngle(double x) { //returns what quadrant the point is located in
		x = getInRange(negativePositive(x));
		if (x <= 0.5) {
			return "1";
		}
		if (x > 0.5 && x <= 1) {
			return "2";
		}
		if (x > 1 && x <= 1.5) {
			return "3";
		}
		else {
			return "4";
		}
	}
	
	public String ComplexRectPolar(double x, String operation, String y) { //returns the polar equation given complex rectangular
		double yNum = (double) Integer.parseInt(y);
		double radius = Math.sqrt((x*x) + (yNum*yNum));
		double angle = Math.acos(x / radius);
		double x1 = Math.cos(angle);
		double y1 = Math.sin(angle);
		return Double.toString(radius) + "(" + Double.toString(x1) + " " + operation + " " + Double.toString(y1) + "i)";
		}
	}

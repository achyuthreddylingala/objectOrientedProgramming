package abstractClass;

public class Main {
	public static void main(String[] args) {
        // Create an object of the Circle class
        Circle circle = new Circle(5);
        
        // Call the calculateArea method to calculate the area of the circle
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}

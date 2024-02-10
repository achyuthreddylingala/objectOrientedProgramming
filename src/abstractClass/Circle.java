package abstractClass;

public class Circle extends AbstractClass  {
private double radius;
public Circle(double radius) {
	this.radius=radius;
}
public double calculateArea() {
    return Math.PI * radius * radius;
}
}

//calculate the area of a given shapes
package Day4;
abstract class Shapes{
	protected String name;
	abstract Float calculateArea();  
	Shapes(String name)
	{
this.name=name;
	}
	public String getName() {
	return name;
	}

}
class Circle extends Shapes
{
	final float PI=3.14f;
	private int radius;
	Circle(String name,int radius)
	{
	super(name);
	this.radius=radius;
	}
	Float calculateArea()
	{
	float area=PI*radius;
	return area;
	}
}


class Square extends Shapes
{
	private int side;
	Square(String name,int side)
	{
	super(name);
	this.side=side;
	}
	Float calculateArea() {
	float area=side*side;
	return area;
	}
}
class Rectangle extends Shapes
{
 private int breadth,length;
 Rectangle(String name,int length,int breadth)
 {
 super(name);
 this.length=length;
 this.breadth=breadth;
 }
 Float calculateArea() {
 float area=length*breadth;
 return area;
 }
}
public class Exception1{

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Circle circle=new Circle("Circle",2);
	Square square=new Square("Square",2);
	Rectangle rectangle=new Rectangle("rectangle",5,3);
	System.out.println("Area of a circle: ");
	System.out.println(circle.calculateArea());
	System.out.println("Area of a square: ");
	System.out.println(square.calculateArea());
	System.out.println("Area of a rectangle: ");
	System.out.println(rectangle.calculateArea());
	}

}
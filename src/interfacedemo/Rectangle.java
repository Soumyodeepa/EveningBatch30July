package interfacedemo;

public class Rectangle implements Shape{

	private int lenght;
	private int breadth;
	
	public Rectangle(int lenght, int breadth){
		this.lenght=lenght;
		this.breadth=breadth;
	}
	
	@Override
	public int getArea() {
		return  (lenght*breadth);
	}

	@Override
	public int getPerimeter() {
		
		return (2*(lenght+breadth));
	}

}

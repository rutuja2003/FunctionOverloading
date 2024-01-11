
public class Circle extends Shape {
	private float r;

	public Circle(float r) {
		this.r = r;
	}

	@Override
	public void area() {
		 float ca = 3.14f*r*r;
		 System.out.println("Area of Circle is "+ca);
		 
	}
	
	

}

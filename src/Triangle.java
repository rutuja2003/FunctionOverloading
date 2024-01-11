public class Triangle extends Shape {
	private float h;
	private float b;
	public Triangle(float h, float b) {
		this.h = h;
		this.b = b;
	}
	@Override
	public void area() {
		 float ta = 0.5f*b*h;
		 System.out.println("Area of Triangle "+ta);
	} 
}

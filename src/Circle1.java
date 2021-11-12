
public class Circle1 {

	public static void main(String[] args) {
		Circle1 r1=new Circle1();
		System.out.println(r1.getArea());
		Circle1 r2=new Circle1(25);
		System.out.println(r2.getArea());
		Circle1 r3=new Circle1(125.0);
		System.out.println(r3.getArea());

	}
	public double radius;
	Circle1() {
		radius=1;
	}
	Circle1(double newradius) {
		radius=newradius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}

}

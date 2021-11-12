
public class Circle {
	public double radius;
	Circle() {  //与类名同名的方法名不要加数据类型，这样更便于传入各种类型的参数
		radius=1;
	}
	Circle(double newradius) {
		radius=newradius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	

}

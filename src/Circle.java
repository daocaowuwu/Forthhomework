
public class Circle {
	public double radius;
	Circle() {  //������ͬ���ķ�������Ҫ���������ͣ����������ڴ���������͵Ĳ���
		radius=1;
	}
	Circle(double newradius) {
		radius=newradius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	

}

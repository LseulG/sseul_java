package Day7;

public class Day7_pro6 {
//
//	static double sumArea(Shape[] arr) {
//		//�־��� �迭�� ��� �������� ���̸� ��� ���ؼ� ��ȯ
//		double sum=0.0;
//		for(int i=0; i<arr.length; i++) {
//			sum = sum + arr[i].calcArea();
//		}
//		return sum;
//	}

	public static void main(String[] args) {
//		Shape[] arr = { new Circle(5.0), new Rectangle(3,4), new Circle(1) };
//		System.out.println("������ ��:" + sumArea(arr));	//93.68140899333463
	}

}

//abstract class Shape {
//	Point p;
//	Shape(){
//		this(new Point(0,0));
//	}
//	
//	Shape(Point p){
//		this.p = p;
//	}
//	
//	abstract double calcArea(); //���� ���� ��� ��ȯ �޼���
//	
//	Point getPosition() {
//		return p;
//	}
//	
//	void setPosition(Point p) {
//		this.p = p;
//	}
//}
//
//class Point {
//	int x;
//	int y;
//	Point(){
//		this(0,0);
//	}
//	
//	Point(int x, int y){
//		this.x = x;
//		this.y = y;
//	}
//	
//	public String toString() {
//		return "[" + x + "," + y + "]";
//	}
//}
//
//class Circle extends Shape{
//	double r;
//	
//	Circle(int r) {
//		this.r = (double)r;
//	}
//	
//	Circle(double r) {
//		this.r = r;
//	}
//	
//	@Override
//	double calcArea() {
//		double resulte = r*r*Math.PI;
//		return resulte;
//	}
//
//}
//
//class Rectangle extends Shape{
//	double width; //��
//	double height; //����
//	
//	Rectangle(int w, int h) {
//		width = (double)w;
//		height = (double)h;
//	}
//	
//	boolean isSquare() {
//		//���簢������ �ƴ��� �˷���
//		if (width == height)
//			return true;
//		else
//			return false;
//	}
//
//	@Override
//	double calcArea() {
//		double result = width*height;
//		return result;
//	}
//}

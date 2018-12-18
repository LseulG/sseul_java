package Day7;

public class Day7_pro6 {
//
//	static double sumArea(Shape[] arr) {
//		//주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환
//		double sum=0.0;
//		for(int i=0; i<arr.length; i++) {
//			sum = sum + arr[i].calcArea();
//		}
//		return sum;
//	}

	public static void main(String[] args) {
//		Shape[] arr = { new Circle(5.0), new Rectangle(3,4), new Circle(1) };
//		System.out.println("면접의 합:" + sumArea(arr));	//93.68140899333463
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
//	abstract double calcArea(); //도형 면적 계산 반환 메서드
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
//	double width; //폭
//	double height; //높이
//	
//	Rectangle(int w, int h) {
//		width = (double)w;
//		height = (double)h;
//	}
//	
//	boolean isSquare() {
//		//정사각형인지 아닌지 알려줌
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

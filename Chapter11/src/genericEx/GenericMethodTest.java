package genericEx;

public class GenericMethodTest {

	public static void main(String[] args) {
		
		Point p1 = new Point(1,7);
		Point p2 = new Point(7,3);
		
		double rectangle1 = GenericMethod.makeRectangle(p1, p2);
		
		System.out.println("대각선상의 꼭짓점 좌표가 ("+p1.getX()+","+p1.getY()+") , ("+p2.getX()+","+ p2.getY()+")"+"인 사각형의 넓이는"+rectangle1+"이다");
		
		
	}

}

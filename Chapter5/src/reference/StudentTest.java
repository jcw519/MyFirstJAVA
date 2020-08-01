package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJeong = new Student(201912461,"정채원");
		studentJeong.setKoreaSubject("국어", 95);
		studentJeong.setMathSubject("수학", 98);
		studentJeong.setEnglishSubject("영어", 98);
		studentJeong.setSienceSubject("과학", 88);
		
		
		studentJeong.showInfoStudent();
		
	
		
		
	}

}

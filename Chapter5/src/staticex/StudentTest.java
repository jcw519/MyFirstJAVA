package staticex;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(201912461,"이순신" ); //생성자
		//'.' : 참조 변수
		
		studentLee.studentID = 201912461;
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(201911686, "김유신");
		//'.' : 참조 변수
		studentKim.address = "부산";
		studentKim.showStudentInfo();
		
		Student studentjeong = new Student("정채원");
		studentjeong.showStudentInfo();
		
		
		
	}

}

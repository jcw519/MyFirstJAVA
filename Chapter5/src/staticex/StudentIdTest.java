package staticex;

public class StudentIdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum());
		
		Student studentKim = new Student("Kim");
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		
		Student studentJeong = new Student("jeong");
		System.out.println(Student.getSerialNum());
		
		System.out.println(studentKim.getStudentID());
		System.out.println(studentLee.getStudentID());
	}

}

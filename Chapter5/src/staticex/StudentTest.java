package staticex;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(201912461,"�̼���" ); //������
		//'.' : ���� ����
		
		studentLee.studentID = 201912461;
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(201911686, "������");
		//'.' : ���� ����
		studentKim.address = "�λ�";
		studentKim.showStudentInfo();
		
		Student studentjeong = new Student("��ä��");
		studentjeong.showStudentInfo();
		
		
		
	}

}

package classpart;

//class���� �ϳ��� �ٸ� class�� ���� �� �ִ�.



//public�� ��  class�� class���Ͽ� �ϳ��� �����Ͽ��� �ϰ� class���� java���̷ΰ� �Ȱ��ƾ��ϳ�.
public class Student {
	
	public int studentID;
	public String studentName; //char[];
	public String address = "�ּ� ����";
	//public : ���� ������
	
	
	//�����ε�
	public Student(String name) {
		studentName = name;
	}
	
	
	public Student(int id, String name){
	studentID = id;
	studentName = name;
	address = "�ּ� ����";
	}
	

	//����� �޼���� �����Ѵ�.
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address+","+studentID);
	}
	
	
	
	
}

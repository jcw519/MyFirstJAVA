package staticex;

//class���� �ϳ��� �ٸ� class�� ���� �� �ִ�.



//public�� ��  class�� class���Ͽ� �ϳ��� �����Ͽ��� �ϰ� class���� java���̷ΰ� �Ȱ��ƾ��ϳ�.
public class Student {
	
	private static int serialNum = 1000;
	public int studentID;
	public String studentName; //char[];
	public String address = "�ּ� ����";
	//public : ���� ������
	
	
	//�����ε�
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	
	public static int getSerialNum() {
		return serialNum;
	}


	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}


	public Student(int id, String name){
	studentID = id;
	studentName = name;
	address = "�ּ� ����";
	serialNum++;
	studentID = serialNum;
	}
	
	public int getStudentID() {
		return studentID;
	}

	//����� �޼���� �����Ѵ�.
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address+","+studentID);
	}
	
	
	
	
}

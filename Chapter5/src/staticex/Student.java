package staticex;

//class파일 하나에 다른 class도 있을 수 있다.



//public이 들어간  class는 class파일에 하나만 존재하여야 하고 class명은 java파이로가 똑같아야하낟.
public class Student {
	
	private static int serialNum = 1000;
	public int studentID;
	public String studentName; //char[];
	public String address = "주소 없음";
	//public : 접근 제어자
	
	
	//오버로딩
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
	address = "주소 없음";
	serialNum++;
	studentID = serialNum;
	}
	
	public int getStudentID() {
		return studentID;
	}

	//기능은 메서드로 구현한다.
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address+","+studentID);
	}
	
	
	
	
}

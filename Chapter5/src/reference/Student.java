package reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	Subject english;
	Subject sience;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		//�����ڿ��� �����ڷ��������� ������ ������� 
		korea = new Subject();
		math = new Subject();
		english = new Subject();
		sience = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void setEnglishSubject(String name, int score) {
		english.subjectName = name;
		english.score = score;
	}
	
	public void setSienceSubject(String name, int score) {
		sience.subjectName = name;
		sience.score = score;
	}
	
	
	public void showInfoStudent() {
		System.out.println("�й�: "+studentID);
		System.out.println("�̸�: "+studentName);
		System.out.println("�����: "+korea.score);
		System.out.println("���м���: "+math.score);
		System.out.println("�����: "+english.score);
		System.out.println("���м���: "+sience.score);
		
	}
	
	
}

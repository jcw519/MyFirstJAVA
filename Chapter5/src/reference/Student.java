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
		
		//생성자에서 참조자료형에대한 생성을 해줘야함 
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
		System.out.println("학번: "+studentID);
		System.out.println("이름: "+studentName);
		System.out.println("국어성적: "+korea.score);
		System.out.println("수학성적: "+math.score);
		System.out.println("영어성적: "+english.score);
		System.out.println("과학성적: "+sience.score);
		
	}
	
	
}

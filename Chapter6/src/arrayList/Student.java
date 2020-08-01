package arrayList;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	
	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject(subjectName, score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject subject: subjectList) {
		total += subject.getScore();	
		System.out.println(studentName+"�л��� "+subject.getSubjectName()+"������ ������ "+subject.getScore()+"�� �Դϴ�.");
		}
		System.out.println(studentName+"�л��� ������ "+total+"�� �Դϴ�.");
	}
}
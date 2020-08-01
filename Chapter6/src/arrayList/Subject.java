package arrayList;

public class Subject {
	private String subjectName;
	private int score;
	
	public Subject(String subjectName, int score) {
		this.score = score;
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}

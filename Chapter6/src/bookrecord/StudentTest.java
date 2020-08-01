package bookrecord;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		Student studentKim = new Student("Kim");
		Student studentCho = new Student("Cho");
		
		studentLee.addBook("태백산맥1", 20000);
		studentLee.addBook("태백산맥2", 18000);
		
		studentKim.addBook("토지1", 12000);
		studentKim.addBook("토지2", 13000);
		studentKim.addBook("토지3", 13000);
		
		studentCho.addBook("해리포터1", 11000);
		studentCho.addBook("해리포터2", 11000);
		studentCho.addBook("해리포터3", 11000);
		studentCho.addBook("해리포터4", 11000);
		studentCho.addBook("해리포터5", 11000);
		studentCho.addBook("해리포터6", 11000);
		
		studentLee.showReadInfo();
		studentKim.showReadInfo();
		studentCho.showReadInfo();
		
		
	}

}

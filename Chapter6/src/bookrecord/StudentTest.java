package bookrecord;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		Student studentKim = new Student("Kim");
		Student studentCho = new Student("Cho");
		
		studentLee.addBook("�¹���1", 20000);
		studentLee.addBook("�¹���2", 18000);
		
		studentKim.addBook("����1", 12000);
		studentKim.addBook("����2", 13000);
		studentKim.addBook("����3", 13000);
		
		studentCho.addBook("�ظ�����1", 11000);
		studentCho.addBook("�ظ�����2", 11000);
		studentCho.addBook("�ظ�����3", 11000);
		studentCho.addBook("�ظ�����4", 11000);
		studentCho.addBook("�ظ�����5", 11000);
		studentCho.addBook("�ظ�����6", 11000);
		
		studentLee.showReadInfo();
		studentKim.showReadInfo();
		studentCho.showReadInfo();
		
		
	}

}

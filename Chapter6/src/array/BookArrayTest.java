package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("�ظ�����0","�Ѹ�");
		library[1] = new Book("�ظ�����1","�Ѹ�");
		library[2] = new Book("�ظ�����2","�Ѹ�");
		library[3] = new Book("�ظ�����3","�Ѹ�");
		library[4] = new Book("�ظ�����4","�Ѹ�");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}

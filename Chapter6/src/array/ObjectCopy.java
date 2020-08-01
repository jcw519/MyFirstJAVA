package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�ظ�����0","�Ѹ�");
		library[1] = new Book("�ظ�����1","�Ѹ�");
		library[2] = new Book("�ظ�����2","�Ѹ�");
		library[3] = new Book("�ظ�����3","�Ѹ�");
		library[4] = new Book("�ظ�����4","�Ѹ�");
		
		//���� ����
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		/*for(Book book : copyLibrary) {
			book.showBookInfo();
		}*/
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("-------------------------");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}

	}

}

package array;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("해리포터0","롤링");
		library[1] = new Book("해리포터1","롤링");
		library[2] = new Book("해리포터2","롤링");
		library[3] = new Book("해리포터3","롤링");
		library[4] = new Book("해리포터4","롤링");
		
		//깊은 복사
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		
		for(int i = 0; i < library.length;i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		/*----------------------------------------------*/
		
		//얕은 복사
		//System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		/*for(Book book : copyLibrary) {
			book.showBookInfo();
		}*/
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("-------------------------");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}

	}

}

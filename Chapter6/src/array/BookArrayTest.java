package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("해리포터0","롤링");
		library[1] = new Book("해리포터1","롤링");
		library[2] = new Book("해리포터2","롤링");
		library[3] = new Book("해리포터3","롤링");
		library[4] = new Book("해리포터4","롤링");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}

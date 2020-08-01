package bookrecord;

import java.util.ArrayList;

public class Student {
	private String studentName;
	
	ArrayList<Book> bookList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String bookName, int bookPrice) {
		Book book = new Book(bookName, bookPrice);
		
		bookList.add(book);
	}
	
	
	
	public void showReadInfo() {
		System.out.print(studentName+" 학생이 읽은 책은 : ");
		for(Book book : bookList) {
			System.out.print(book.getBookName()+" ");
		}
		System.out.println("입니다");
	}
	
	
	
	
	
}

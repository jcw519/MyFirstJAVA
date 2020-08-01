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
		System.out.print(studentName+" �л��� ���� å�� : ");
		for(Book book : bookList) {
			System.out.print(book.getBookName()+" ");
		}
		System.out.println("�Դϴ�");
	}
	
	
	
	
	
}

﻿package object;


class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book("토지", "박경리");
		
		System.out.println(book);
		
		String str = new String("토지");
		
		System.out.println(str.toString());

		Book book2 = (Book)book.clone();
		
		System.out.println(book2);
	}

}

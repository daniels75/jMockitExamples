package org.daniels.samples;

public class App {

	private Book book;

	public String getBookDatails() {
		String name = book.getName();
		int price = book.getPrice();
		return name + price;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}

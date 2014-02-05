package org.daniels.samples;

public class BookImpl implements Book {

	private String name;
	private int value;
	
	public BookImpl(String name, int value){
		this.name = name;
		this.value = value;
	}
	
	public String getDetails(){
		return name + value;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package nLayeredKodlamaIO.entities;

public class Category {
	//Attribute Tanımlamaları
	private String categoryName;
	private int howMuch;
	
	//Constructor
	public Category(String categoryName, int howMuch) {
		this.categoryName = categoryName;
		this.howMuch = howMuch;
	}
	
	//Getters and Setters
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getHowMuch() {
		return howMuch;
	}

	public void setHowMuch(int howMuch) {
		this.howMuch = howMuch;
	}
	
}

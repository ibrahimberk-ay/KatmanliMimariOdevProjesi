package nLayeredKodlamaIO.entities;

public class Category {
	private String categoryName;
	private int howMuch;
	
	public Category(String categoryName, int howMuch) {
		this.categoryName = categoryName;
		this.howMuch = howMuch;
	}

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

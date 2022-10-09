package nLayeredKodlamaIO.entities;

public class Course {
	//Attribute Tanımlamaları
	private String courseName;
	private String educatorName;
	private int percentage;
	private int price;
	
	//Constructor
	public Course(String courseName, String educatorName, int percentage,int price) {
		this.courseName = courseName;
		this.educatorName = educatorName;
		this.percentage = percentage;
		this.price = price;
	}

	//Getters and Setters
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getEducatorName() {
		return educatorName;
	}

	public void setEducatorName(String educatorName) {
		this.educatorName = educatorName;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}

package nLayeredKodlamaIO.business;

import java.util.ArrayList;

import nLayeredKodlamaIO.dataAccess.ProductDao;
import nLayeredKodlamaIO.entities.Course;

public class CourseManager {
	private ArrayList<String> list;
	private ProductDao productDao;
	
	public CourseManager(ArrayList<String> list,ProductDao productDao) {
		this.list = list;
		this.productDao = productDao;
	}
	
	public void add(Course course)throws Exception{
		boolean flag = false;
		for(String name:list) {
			if(name == course.getCourseName()) {flag = true;}
		}
		if(flag == true) {
			throw new Exception("There is a course with the same name.");
		}
		if(course.getPrice() < 0) {
			throw new Exception("The course price can't be less than 0.");
		}
		productDao.add(course);
		list.add(course.getCourseName());
		
	}
}

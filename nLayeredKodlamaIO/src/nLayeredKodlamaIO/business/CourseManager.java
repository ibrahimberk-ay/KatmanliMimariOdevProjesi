package nLayeredKodlamaIO.business;

import java.util.ArrayList;

import nLayeredKodlamaIO.core.logging.Logger;
import nLayeredKodlamaIO.dataAccess.ProductDao;
import nLayeredKodlamaIO.entities.Course;

public class CourseManager {
	//Attribute Tanımlamaları
	private ArrayList<String> list;
	private ProductDao productDao;
	private Logger[] loggers;
	
	//Constructor
	public CourseManager(ArrayList<String> list,ProductDao productDao, Logger[] loggers) {
		this.list = list;
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	public void add(Course course)throws Exception{
		//Kontrol işaret değişkeni
		boolean flag = false;
		
		//Döngü ile bütün liste kontrol edilip eğer aynı isim mevcutsa-
		//işaret değişkeni true dönüyor ve Exception atılmasına sebep oluyor.
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
		
		//Logger listesi içindeki loggerlar dolaşılarak datalar loglandı şeklinde bilgi veriliyor.
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}

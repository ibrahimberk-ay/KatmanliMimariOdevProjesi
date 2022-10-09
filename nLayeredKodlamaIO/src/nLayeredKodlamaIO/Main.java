package nLayeredKodlamaIO;

import java.util.ArrayList;

import nLayeredKodlamaIO.business.CategoryManager;
import nLayeredKodlamaIO.business.CourseManager;
import nLayeredKodlamaIO.business.EducatorManager;
import nLayeredKodlamaIO.core.logging.DatabaseLogger;
import nLayeredKodlamaIO.core.logging.FileLogger;
import nLayeredKodlamaIO.core.logging.Logger;
import nLayeredKodlamaIO.core.logging.MailLogger;
import nLayeredKodlamaIO.dataAccess.HibernateProductDao;
import nLayeredKodlamaIO.dataAccess.JdbcProductDao;
import nLayeredKodlamaIO.entities.Category;
import nLayeredKodlamaIO.entities.Course;
import nLayeredKodlamaIO.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception{
		//Nesne tanımlamaları
		Educator educator1 = new Educator("Engin Demiroğ");
		Course course = new Course("Ders1", educator1.getEducatorName(),89,0);
		Category category = new Category("Programlama", 6);
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		//Kurs listesi
		ArrayList<String> couseList = new ArrayList<String>();
		couseList.add("Ders2");
		couseList.add("Ders3");
		couseList.add("Ders4");
		
		//Kategori Listesi
		ArrayList<String> categoryList = new ArrayList<String>();
		categoryList.add("Yönetim");
		
		//Kurs listesini değiştirmeden önce ekrana yansıt
		System.out.print("Course List: ");
		for(String isim : couseList) {
			System.out.print(" "+isim);
		}
		System.out.println("");
		
		//Kategori listesini değiştirmeden önce ekrana yansıt
		System.out.print("Category List: ");
		for(String isim : categoryList) {
			System.out.print(" "+isim);
		}
		System.out.println("\n");
		
		//Hibernate kullanarak educator1 nesnesini database'e ekle
		EducatorManager educatorManager = new EducatorManager(new HibernateProductDao(),loggers);
		educatorManager.add(educator1);
		
		//JDBC kullanarak course nesnesini database'e ekle
		CourseManager courseManager = new CourseManager(couseList, new JdbcProductDao(),loggers);
		courseManager.add(course);
		
		//Hibernate kullanarak kategori nesnesini database'e ekle
		CategoryManager categoryManager = new CategoryManager(categoryList, new HibernateProductDao(),loggers);
		categoryManager.add(category);
		
		System.out.print("\n");
		
		//Kurs listesini değiştirmeden önce ekrana yansıt
		System.out.print("New Course List: ");
		for(String isim : couseList) {
			System.out.print(" "+isim);
		}
		System.out.println("");
				
		//Kategori listesini değiştirmeden önce ekrana yansıt
		System.out.print("New Category List: ");
		for(String isim : categoryList) {
			System.out.print(" "+isim);
		}
		System.out.println("");
	}

}

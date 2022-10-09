package nLayeredKodlamaIO.business;

import java.util.ArrayList;

import nLayeredKodlamaIO.core.logging.Logger;
import nLayeredKodlamaIO.dataAccess.ProductDao;
import nLayeredKodlamaIO.entities.Category;

public class CategoryManager {
	//Attribute Tanımlamaları
	private ArrayList<String> list;
	private ProductDao productDao;
	private Logger[] loggers;
	
	//Constructor
	public CategoryManager(ArrayList<String> list,ProductDao productDao,Logger[] loggers) {
		this.list = list;
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	
	public void add(Category category)throws Exception{
		//Kontrol işaret değişkeni
		boolean flag = false;
		
		//Döngü ile bütün liste kontrol edilip eğer aynı isim mevcutsa-
		//işaret değişkeni true dönüyor ve Exception atılmasına sebep oluyor.
		for(String name:list) {
			if(name == category.getCategoryName()) {flag = true;}
		}
		if(flag == true) {
			throw new Exception("There is a category with the same name.");
		}
		
		productDao.add(category);
		list.add(category.getCategoryName());
		
		//Logger listesi içindeki loggerlar dolaşılarak datalar loglandı şeklinde bilgi veriliyor.
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}

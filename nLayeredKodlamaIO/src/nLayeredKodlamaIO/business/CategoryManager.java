package nLayeredKodlamaIO.business;

import java.util.ArrayList;

import nLayeredKodlamaIO.dataAccess.ProductDao;
import nLayeredKodlamaIO.entities.Category;

public class CategoryManager {
	private ArrayList<String> list;
	private ProductDao productDao;
	
	public CategoryManager(ArrayList<String> list,ProductDao productDao) {
		this.list = list;
		this.productDao = productDao;
	}
	
	public void add(Category category)throws Exception{
		boolean flag = false;
		for(String name:list) {
			if(name == category.getCategoryName()) {flag = true;}
		}
		if(flag == true) {
			throw new Exception("There is a category with the same name.");
		}
		
		productDao.add(category);
		list.add(category.getCategoryName());
		
	}
}

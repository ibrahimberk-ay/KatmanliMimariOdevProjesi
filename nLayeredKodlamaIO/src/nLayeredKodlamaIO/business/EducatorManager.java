package nLayeredKodlamaIO.business;

import nLayeredKodlamaIO.dataAccess.ProductDao;
import nLayeredKodlamaIO.entities.Educator;

public class EducatorManager {
	private ProductDao productDao;
	
	public EducatorManager(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void add(Educator educator){
		productDao.add(educator);
	}
}

package nLayeredKodlamaIO.business;

import nLayeredKodlamaIO.core.logging.Logger;
import nLayeredKodlamaIO.dataAccess.ProductDao;
import nLayeredKodlamaIO.entities.Educator;

public class EducatorManager {
	//Attribute Tanımlamaları
	private ProductDao productDao;
	private Logger[] loggers;
	
	//Constructor
	public EducatorManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	public void add(Educator educator){
		productDao.add(educator);
		
		//Logger listesi içindeki loggerlar dolaşılarak datalar loglandı şeklinde bilgi veriliyor.
		for(Logger logger : loggers) {
			logger.log(educator.getEducatorName());
		}
	}
}

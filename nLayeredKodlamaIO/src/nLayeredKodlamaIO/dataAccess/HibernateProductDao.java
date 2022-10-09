package nLayeredKodlamaIO.dataAccess;

import nLayeredKodlamaIO.entities.Category;
import nLayeredKodlamaIO.entities.Course;
import nLayeredKodlamaIO.entities.Educator;

public class HibernateProductDao implements ProductDao {
	@Override
	public void add(Category category) {
		System.out.println("Added with Hibernate to database: "+ category.getCategoryName());
	}

	@Override
	public void add(Course course) {
		System.out.println("Added with Hibernate to database: "+ course.getCourseName());
	}

	@Override
	public void add(Educator educator) {
		System.out.println("Added with Hibernate to database: "+ educator.getEducatorName());
	}
}

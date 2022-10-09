package nLayeredKodlamaIO.dataAccess;

import nLayeredKodlamaIO.entities.Category;
import nLayeredKodlamaIO.entities.Course;
import nLayeredKodlamaIO.entities.Educator;

public interface ProductDao {
	//Function Overloading Signature
	public void add(Category category);
	public void add(Course course);
	public void add(Educator educator);
}

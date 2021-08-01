package ECommerce.DAO;

import java.util.List;

import ECommerce.model.Category;

public interface CategoryDAO {

	public boolean addCategory(Category category);
	public boolean deleteCategory(Category category);
	public boolean updateCategory(Category category);
	
	public List<Category> listcategories();
	public Category getCategory(int categoryId);
	
}

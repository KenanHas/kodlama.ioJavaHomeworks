package kodlamaioNLayeredApp.dataAccess;

import kodlamaioNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veri tabanına kaydedildi : " + category.getCategoryName());
		
	}

}
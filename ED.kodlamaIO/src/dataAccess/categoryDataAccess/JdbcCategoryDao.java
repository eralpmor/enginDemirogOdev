package dataAccess.categoryDataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    public void add (Category category){
        System.out.println("Kategori JDBC ile veritabanına eklendi...");
    }
    
}

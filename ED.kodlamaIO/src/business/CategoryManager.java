
package business;

import core.logging.Logger;
import dataAccess.categoryDataAccess.CategoryDao;
import entities.Category;


public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    
    public CategoryManager(CategoryDao categoryDao, Logger[] loggers){
        this.categoryDao = categoryDao;
        this.loggers = loggers;    
    }
    public void add(Category category) throws Exception{
        if(category.getName() == ""){
            throw new Exception("Kategori ismi boş olamaz!");
        }
        categoryDao.add(category);
        
        for(Logger logger : loggers){
            logger.log(category.getName());
        }
    }
}



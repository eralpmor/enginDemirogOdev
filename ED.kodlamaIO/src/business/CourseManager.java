
package business;

import core.logging.Logger;
import dataAccess.courseDataAccess.CourseDao;
import entities.Course;


public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    
    public CourseManager(CourseDao courseDao, Logger[] loggers){
        this.courseDao = courseDao;
        this.loggers = loggers;
        
        
    }
    
    public void add(Course course) throws Exception {
        if (course.getUnitPrice() <= 0){
            throw new Exception("Kurs fiyatı 0 TL ve aşağısı olamaz!");
            
        }
        
        courseDao.add(course);
        
        for(Logger logger : loggers){
            logger.log(course.getName());
        }
    }
}

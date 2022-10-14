
package business;

import core.logging.Logger;
import dataAccess.instructorDataAccess.InstructorDao;
import entities.Instructor;


public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;
    
    public InstructorManager(InstructorDao instructorDao, Logger[] loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        
    }
    
public void add(Instructor instructor) throws Exception{
    if(instructor.getAge() < 18){
        throw new Exception("Eğitmenin yaşı 18'den küçük olamaz!");
    }
    
    for(Logger logger : loggers){
        logger.log(instructor.getName());
    }
    
}
}

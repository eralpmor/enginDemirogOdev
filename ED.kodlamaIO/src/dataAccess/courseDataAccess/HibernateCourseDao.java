
package dataAccess.courseDataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao{
        public void add (Course course){
        System.out.println("Kurs JDBC ile veritabanına eklendi...");
    }
}

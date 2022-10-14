
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.CategoryLogger;
import core.logging.CourseLogger;
import core.logging.DatabaseLogger;
import core.logging.InstructorLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.categoryDataAccess.JdbcCategoryDao;
import dataAccess.courseDataAccess.HibernateCourseDao;
import dataAccess.instructorDataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;


public class Main {
    public static void main(String[] args) throws Exception {
        Category category1 = new Category(1,"Programlama", "Java");
        Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı ", 500, "8 Hafta", "Java");
        Instructor instructor1 = new Instructor(1, "Engin Demiroğ", "Erkek", 35, "Türkiye");
        
        Logger[] loggers = {new CategoryLogger(), new CourseLogger(), new DatabaseLogger(), new InstructorLogger(), new MailLogger()};
        
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);
        System.out.println("-----------------------------------------------");
        System.out.println("Kategori ID : " + category1.getId());
        System.out.println("Kategori Adı : " + category1.getName());
        System.out.println("Kategori Tipi : " + category1.getType());
        System.out.println("-----------------------------------------------");
        
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);
        System.out.println("-----------------------------------------------");
        System.out.println("Kurs ID : " + course1.getId());
        System.out.println("Kurs Adı : " + course1.getName());
        System.out.println("Kurs Ücreti : " + course1.getUnitPrice());
        System.out.println("Kurs Süresi : " + course1.getDuration());
        System.out.println("Kurs Dili : " + course1.getLanguage());
        System.out.println("-----------------------------------------------");
        
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor1);
        System.out.println("-----------------------------------------------");
        System.out.println("Eğitmen ID : " + instructor1.getId());
        System.out.println("Eğitmen Ad ve Soyad : " + instructor1.getName());
        System.out.println("Eğitmen Cinsiyet : " + instructor1.getGender());
        System.out.println("Eğitmen Yaş : " + instructor1.getAge());
        System.out.println("Eğitmen Uyruk : " + instructor1.getNationality());
        System.out.println("-----------------------------------------------");
        
        
    }
}


package core.logging;

public class CourseLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Kurs bilgisi loglandı : " + data);
    }
    
}


package core.logging;

public class InstructorLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Eğitmen bilgisi loglandı : " + data);
    }
    
}

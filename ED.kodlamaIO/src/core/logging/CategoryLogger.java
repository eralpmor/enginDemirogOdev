
package core.logging;


public class CategoryLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Kategori bilgisi loglandı : " + data);
    }
    
}

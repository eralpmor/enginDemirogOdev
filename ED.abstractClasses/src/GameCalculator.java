
public abstract class GameCalculator {
    public abstract void calculate();
// ABSTRACT CLASSLAR BASE CLASSTA TANIMLAMALAR ALT CLASSLARIN OVERRIDE ETMELERİNİ İSTER. HER SINIFIN KENDİ TANIMI VARDIR.
    public final void gameOver(){
        System.out.println("Game over!");
// FINAL KOMUTU İSE TÜM ALT SINIFLARA BU KOMUTU ZORUNLU KILAR. OVERRIDE EDİLEMEZ.
    }
    
    
    
}

package ro.sda.advanced._3_composition;

public class Pc {
    private Monitor monitor;
    private Case theCase;

    public Pc(Monitor monitor, Case theCase) {
        this.monitor = monitor;
        this.theCase = theCase;
    }
    public void  powerUp(){
        theCase.pressPowerButton();
        this.drawLogo();
    }
    public  void drawLogo(){
        monitor.drawPixelArt(1200,500,"red");
    }
}

package ro.sda.advanced._3_composition;

public class Main {
    public static void main(String[] args) {

    Case case1  = new Case("220B", "HP", "230",  new Dimensions(10,20,30));

    Monitor monitor1 = new Monitor("27 INCH", "ASUS", "27", new Resolution(20, 30));
    Pc pc1 = new Pc(monitor1, case1);
    pc1.powerUp();


    Pc pc2 = new Pc(new Monitor("3x4", "AOC","32", new Resolution(10,20)),
                    new Case("Model", "manufacturer","230",
                            new Dimensions(30,40,50)));
    pc2.powerUp();
    }

}

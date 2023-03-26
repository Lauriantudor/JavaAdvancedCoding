package ro.sda.advanced._2_polimorfism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(true, "myCar", 4);
        car.startEngine();
        car.accelerate();

        Audi audi = new Audi(true,"A5",6);
        audi.startEngine();
        audi.accelerate();

        audi.nos();

        Car audi2 = new Audi(true,"A5",6);
        audi2.startEngine();
        audi2.accelerate();

        // method nos is not visible because the type of the variable is of the parent class
        // audi2.nos();

    }
}

class Car {

    private boolean hasEngine;
    private String name;
    private int noCylinders;

    public Car(boolean hasEngine, String name, int noCylinders) {
        this.hasEngine = hasEngine;
        this.name = name;
        this.noCylinders = noCylinders;
    }

    public Car(){

    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public String getName() {
        return name;
    }

    public int getNoCylinders() {
        return noCylinders;
    }

    public void startEngine() {
        System.out.println("Car -> start engine");
    }

    public void accelerate() {
        System.out.println("Car -> accelerate");
    }

    public void brake(){
        System.out.println("Car -> brake");
    }
}

class Ford extends Car{
    public Ford(boolean hasEngine, String name, int noCylinders) {
        super(hasEngine, name, noCylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford -> start engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford -> accelerate");
    }
}

class Audi extends Car{
    public Audi(boolean hasEngine, String name, int noCylinders) {
        super(hasEngine, name, noCylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi -> start engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi -> accelerate");
    }
    public void nos(){
        System.out.println("Audi -> nos");
    }
}
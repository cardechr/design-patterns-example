package designpatterns.creational.abstractfactory;

public class HybridSuv extends HybridVehicle {
    HybridSuv() {
        super(CarBodyType.SUV);
    }
    @Override
    public void greetDriver() {
        System.out.println("Greeting from your hybrid "
                + CarBodyType.SUV);
    }
}

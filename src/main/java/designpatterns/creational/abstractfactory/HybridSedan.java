package designpatterns.creational.abstractfactory;

public class HybridSedan extends HybridVehicle {
    HybridSedan() {
        super(CarBodyType.SEDAN);
    }
    @Override
    public void greetDriver() {
        System.out.println("Greeting from your hybrid "
                + CarBodyType.SEDAN);
    }
}

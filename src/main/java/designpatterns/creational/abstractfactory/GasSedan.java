package designpatterns.creational.abstractfactory;

public class GasSedan extends GasVehicle {
    GasSedan() {
        super(CarBodyType.SUV);
    }
    @Override
    public void greetDriver() {
        System.out.println("Greeting from your gas "
                + CarBodyType.SUV);
    }
}

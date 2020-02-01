package designpatterns.creational.abstractfactory;

public class GasSuv extends GasVehicle {
    GasSuv() {
        super(CarBodyType.SUV);
    }
    @Override
    public void greetDriver() {
        System.out.println("Greeting from your gas "
                + CarBodyType.SUV);
    }
}

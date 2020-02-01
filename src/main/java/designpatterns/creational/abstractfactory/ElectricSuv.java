package designpatterns.creational.abstractfactory;

public class ElectricSuv extends ElectricVehicle {
    ElectricSuv() {
        super(CarBodyType.SUV);
    }
    @Override
    public void greetDriver() {
        System.out.println("Greeting from your electric "
                + CarBodyType.SUV);
    }
}

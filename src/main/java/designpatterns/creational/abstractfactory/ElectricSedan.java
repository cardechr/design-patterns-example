package designpatterns.creational.abstractfactory;

public class ElectricSedan extends ElectricVehicle {
    ElectricSedan() {
        super(CarBodyType.SEDAN);
    }
    @Override
    public void greetDriver() {
        System.out.println("Greeting from your electric "
                + CarBodyType.SEDAN);
    }
}

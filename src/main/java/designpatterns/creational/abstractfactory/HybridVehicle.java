package designpatterns.creational.abstractfactory;


abstract class HybridVehicle implements Vehicle {
    private CarBodyType type;

    HybridVehicle(CarBodyType type) {
        this.type = type;
    }
    @Override
    public void drive() {
        System.out.println("Driving an hybrid " + type);
    }
    @Override
    public void fillUp() {
        System.out.println("your hybrid " +
                type + " is fueling or charging...");
    }
    @Override
    public String toString() {
        return "\nEnergyType=Hybrid BodyType=" + type;
    }
}

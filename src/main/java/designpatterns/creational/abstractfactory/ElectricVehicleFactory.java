package designpatterns.creational.abstractfactory;

public class ElectricVehicleFactory {
    private ElectricVehicleFactory(){}

    static Vehicle getInstance(CarBodyType type) {
        switch (type) {
            case SUV:
                return new ElectricSuv();
            case SEDAN:
                return new ElectricSedan();
            default:
                throw new UnsupportedOperationException("" +
                        "enum " + type + "not supported.");
        }
    }
}

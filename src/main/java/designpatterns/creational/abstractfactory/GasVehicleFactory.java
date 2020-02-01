package designpatterns.creational.abstractfactory;

public class GasVehicleFactory {
    private GasVehicleFactory(){}

    static Vehicle getInstance(CarBodyType type) {
        switch (type) {
            case SUV:
                return new GasSuv();
            case SEDAN:
                return new GasSedan();
            default:
                throw new UnsupportedOperationException("" +
                        "enum " + type + "not supported.");
        }
    }
}

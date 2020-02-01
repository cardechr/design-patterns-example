package designpatterns.creational.abstractfactory;

public class HybridVehicleFactory {
    private HybridVehicleFactory(){}

    static Vehicle getInstance(CarBodyType type) {
        switch (type) {
            case SUV:
                return new HybridSuv();
            case SEDAN:
                return new HybridSedan();
            default:
                throw new UnsupportedOperationException("" +
                        "enum " + type + "not supported.");
        }
    }
}

package designpatterns.creational.abstractfactory;

public class VehicleFactory {
    private VehicleFactory() {}

    public static Vehicle createInstance(CarBodyType type, FuelType fuelType) {
        switch (fuelType) {
            case GAS:
                return GasVehicleFactory.getInstance(type);
            case HYBRID:
                return HybridVehicleFactory.getInstance(type);
            case ELECTRIC:
                return ElectricVehicleFactory.getInstance(type);
            default:
                throw new UnsupportedOperationException(
                        "EnergyType " + fuelType +
                                " not supported.");
        }
    }
}

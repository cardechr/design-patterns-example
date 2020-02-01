package designpatterns;

import designpatterns.creational.abstractfactory.CarBodyType;
import designpatterns.creational.abstractfactory.FuelType;
import designpatterns.creational.abstractfactory.Vehicle;
import designpatterns.creational.abstractfactory.VehicleFactory;
import designpatterns.creational.builder.Car;
import designpatterns.creational.factory.Pastry;
import designpatterns.creational.factory.PastryFactory;
import designpatterns.creational.factory.PastryType;
import designpatterns.creational.singleton.DbConnection;
import designpatterns.creational.singleton.LazyDbConnection;

public class DesignPatterns {

    public static void main(String... args) {
        // Singleton
        DbConnection eagerInstance = DbConnection.getInstance();
        eagerInstance.executeAction();

        LazyDbConnection lazyDbConnection = LazyDbConnection.getInstance();
        lazyDbConnection.executeAction();

        // Factory
        Pastry baklava = PastryFactory.getPastry(PastryType.BAKLAVA);
        Pastry cinnamonRoll = PastryFactory.getPastry(PastryType.CINNAMONROLL);
        System.out.println(baklava.getFirstTimeImpression());
        System.out.println(cinnamonRoll.getFirstTimeImpression());

        // Abstract Factory
        Vehicle tesla = VehicleFactory.createInstance(CarBodyType.SEDAN, FuelType.ELECTRIC);
        System.out.println(tesla);
        tesla.fillUp();
        tesla.greetDriver();
        tesla.drive();

        // Builder
        Car car = Car.builder().year(2020).make("tesla").model("e").build();
        System.out.println(car);

        // Prototype
    }
}

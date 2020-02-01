package designpatterns.creational.singleton;
/*
 Eager Singleton Example
 */
public class DbConnection {

    //create the only private instance of the class
    private static DbConnection instance = new DbConnection();

    //prevents the class from getting instantiated by getting constructor to private
    private DbConnection() {}

    public static DbConnection getInstance() {
        return instance;
    }

    public void executeAction() {
        System.out.println("CRUD action execute successfully");
    }
}

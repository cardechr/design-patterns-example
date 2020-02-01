package designpatterns.creational.singleton;
/*
Lazy Singleton Example
 */
public class LazyDbConnection {

    private static volatile LazyDbConnection instance;

    //prevents the class from getting instantiated by setting a private constructor
    private LazyDbConnection(){}

    public static LazyDbConnection getInstance() {
        if (instance == null) {
            // for multi-thread applications, otherwise just return instance
            synchronized (LazyDbConnection.class) {
                instance = new LazyDbConnection();
            }
        }
        return instance;
    }

    public void executeAction(){
        System.out.println("CRUD action execute successfully");
    }
}

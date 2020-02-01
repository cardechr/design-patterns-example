package designpatterns.creational.factory;

public class Flaky implements Pastry {
    @Override
    public String getFirstTimeImpression() {
        return "Flaky is really good specially while still warm.";
    }
}

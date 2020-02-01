package designpatterns.creational.factory;

public class PastryFactory {
    public static Pastry getPastry(PastryType type) {
        switch (type) {
            case PUFF:
                return new Puff();
            case BAKLAVA:
                return new Baklava();
            case FLAKY:
                return new Flaky();
            case CINNAMONROLL:
                return new CinnamonRoll();
            default:
                throw new IllegalArgumentException("We don't have that pastry");
        }
    }
}

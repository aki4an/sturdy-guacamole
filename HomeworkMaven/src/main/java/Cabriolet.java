public class Cabriolet extends Car {
    public String roofView;

    public Cabriolet(String brand, String model, int numberOfSeat, int horsePower, double engineCapacity, String roofView) {
        this.brand = brand;
        this.model = model;
        this.numberOfSeat = numberOfSeat;
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        this.roofView = roofView;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s \nModel: %s \nNumber of seat: %d \nHorse power: %d \nEngine capacity: %s " +
                "\nRoof view: %s", brand, model, numberOfSeat, horsePower, engineCapacity, roofView);
    }
}


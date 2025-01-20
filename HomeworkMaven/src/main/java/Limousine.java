public class Limousine extends Car {
    public int bodyLength;

    public Limousine(String brand, String model, int numberOfSeat, int horsePower, double engineCapacity, int bodyLength) {
        this.brand = brand;
        this.model = model;
        this.numberOfSeat = numberOfSeat;
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        this.bodyLength = bodyLength;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s \nModel: %s \nNumber of seat: %d \nHorse power: %d \nEngine capacity: %s " +
                "\nBody length: %d", brand, model, numberOfSeat, horsePower, engineCapacity, bodyLength);
    }
}

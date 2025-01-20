public class Car {
    public String brand;
    public String model;
    public int numberOfSeat;
    public int horsePower;
    public double engineCapacity;

    @Override
    public String toString() {
        return String.format("Brand: %s \nModel: %s \nNumber of seat: %d \nHorse power: %d \nEngine capacity: %s",
                brand, model, numberOfSeat, horsePower, engineCapacity);
    }
}

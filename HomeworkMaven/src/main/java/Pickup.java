public class Pickup extends Car {
    public int trunkVolume;

    public Pickup(String brand, String model, int numberOfSeat, int horsePower, double engineCapacity, int trunkVolume) {
        this.brand = brand;
        this.model = model;
        this.numberOfSeat = numberOfSeat;
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        this.trunkVolume = trunkVolume;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s \nModel: %s \nNumber of seat: %d \nHorse power: %d \nEngine capacity: %s " +
                "\nTrunk volume: %d", brand, model, numberOfSeat, horsePower, engineCapacity, trunkVolume);
    }
}

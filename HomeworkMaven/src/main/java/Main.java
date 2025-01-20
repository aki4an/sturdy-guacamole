import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String filePath = "E:\\Homework.txt";
        FileWriter fileWriter = new FileWriter(filePath, true);
        File file = new File(filePath);
        Scanner scannerFromFile = new Scanner(file);

        while (scannerFromFile.hasNext()) {
            String stringCar = scannerFromFile.nextLine();
            String[] parsedCar = stringCar.split("~");
            if (parsedCar[0].equals("Limousine")) {
                cars.add(new Limousine(parsedCar[1], parsedCar[2], Integer.parseInt(parsedCar[3]),
                        Integer.parseInt(parsedCar[4]), Double.parseDouble(parsedCar[5]), Integer.parseInt(parsedCar[6])));
            } else if (parsedCar[0].equals("Pickup")) {
                cars.add(new Pickup(parsedCar[1], parsedCar[2], Integer.parseInt(parsedCar[3]),
                        Integer.parseInt(parsedCar[4]), Double.parseDouble(parsedCar[5]), Integer.parseInt(parsedCar[6])));
            } else if (parsedCar[0].equals("Cabriolet")) {
                cars.add(new Cabriolet(parsedCar[1], parsedCar[2], Integer.parseInt(parsedCar[3]),
                        Integer.parseInt(parsedCar[4]), Double.parseDouble(parsedCar[5]), parsedCar[6]));
            }
        }

        do {
            System.out.print("Select an action (0 - Exit. 1 - Add car. 2 - Output cars): ");
            n = scanner.nextInt();

            switch (n) {
                case 0:
                    System.out.println("Exit...");
                    break;
                case 1:
                    System.out.print("Select a car (1 - Limousine. 2 - Pickup. 3 - Cabriolet): ");
                    int a = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter brand: ");
                    String valueBrand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String valueModel = scanner.nextLine();
                    System.out.print("Enter number of seat: ");
                    int valueNumberOfSeat = scanner.nextInt();
                    System.out.print("Enter horse power: ");
                    int valueHorsePower = scanner.nextInt();
                    System.out.print("Enter engine capacity: ");
                    double valueEngineCapacity = scanner.nextDouble();
                    scanner.nextLine();

                    if (a == 1) {
                        System.out.print("Enter body length: ");
                        int valueBodyLength = scanner.nextInt();
                        cars.add(new Limousine(valueBrand, valueModel, valueNumberOfSeat, valueHorsePower,
                                valueEngineCapacity, valueBodyLength));
                        fileWriter.write("\nLimousine" + "~" + valueBrand + "~" + valueModel + "~" + valueNumberOfSeat
                                + "~" + valueHorsePower + "~" + valueEngineCapacity + "~" + valueBodyLength);
                    } else if (a == 2) {
                        System.out.print("Enter trunk volume: ");
                        int valueTrunkVolume = scanner.nextInt();
                        cars.add(new Pickup(valueBrand, valueModel, valueNumberOfSeat, valueHorsePower,
                                valueEngineCapacity, valueTrunkVolume));
                        fileWriter.write("\nPickup" + "~" + valueBrand + "~" + valueModel + "~" + valueNumberOfSeat
                                + "~" + valueHorsePower + "~" + valueEngineCapacity + "~" + valueTrunkVolume);
                    } else if (a == 3) {
                        System.out.print("Enter roof view: ");
                        String valueRoofView = scanner.nextLine();
                        cars.add(new Cabriolet(valueBrand, valueModel, valueNumberOfSeat, valueHorsePower,
                                valueEngineCapacity, valueRoofView));
                        fileWriter.write("\nCabriolet" + "~" + valueBrand + "~" + valueModel + "~" + valueNumberOfSeat
                                + "~" + valueHorsePower + "~" + valueEngineCapacity + "~" + valueRoofView);
                    }
                    break;
                case 2:
                    for (Car car : cars) {
                        System.out.println(car);
                    }
                    break;
                default:
                    System.out.println("There is no such action!");
                    break;
            }
        } while (n != 0);

        fileWriter.close();
    }
}

import java.util.Scanner;

class Vehicle {
    private String registrationNo;
    private String brand;
    private double price;

    Vehicle() {
        registrationNo = "";
        brand = "";
        price = 0;
    }

    Vehicle(String registrationNo, String brand, double price) {
        this.registrationNo = registrationNo;
        this.brand = brand;
        this.price = price;
    }

    Vehicle(Vehicle v) {
        this.registrationNo = v.registrationNo;
        this.brand = v.brand;
        this.price = v.price;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateTax() {
        return price * 0.10;
    }

    public void displayVehicle() {
        System.out.println("Registration No: " + registrationNo);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + calculateTax());
    }
}

class Car extends Vehicle {
    private String fuelType;
    private int numberOfSeats;

    Car() {
        super();
        fuelType = "";
        numberOfSeats = 0;
    }

    Car(String registrationNo, String brand, double price, String fuelType, int numberOfSeats) {
        super(registrationNo, brand, price);
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
    }

    Car(Car c) {
        super(c);
        this.fuelType = c.fuelType;
        this.numberOfSeats = c.numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double calculateOnRoadPrice() {
        return getPrice() + calculateTax();
    }

    public void displayCar() {
        displayVehicle();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("On-Road Price: " + calculateOnRoadPrice());
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car[] cars = new Car[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of Car " + (i + 1));

            System.out.print("Registration No: ");
            String registrationNo = sc.nextLine();

            System.out.print("Brand: ");
            String brand = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Fuel Type: ");
            String fuelType = sc.nextLine();

            System.out.print("Number of Seats: ");
            int seats = sc.nextInt();
            sc.nextLine();

            cars[i] = new Car(registrationNo, brand, price, fuelType, seats);
        }

        System.out.println("\n===== ALL CARS =====");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nCar " + (i + 1));
            cars[i].displayCar();
        }

        System.out.println("\n===== UPDATING CAR 1 =====");

        cars[0].setPrice(cars[0].getPrice() + 50000);
        cars[0].setFuelType("Hybrid");

        System.out.println("Updated Car 1:");
        cars[0].displayCar();

        System.out.println("\n===== COPY OF CAR 2 =====");

        Car copiedCar = new Car(cars[1]);

        copiedCar.setBrand("Toyota");
        copiedCar.setPrice(900000);
        copiedCar.setFuelType("Electric");

        System.out.println("Copied and Modified Car:");
        copiedCar.displayCar();

        Car highest = cars[0];

        for (int i = 1; i < 3; i++) {
            if (cars[i].calculateOnRoadPrice() > highest.calculateOnRoadPrice()) {
                highest = cars[i];
            }
        }


        highest.displayCar();

        sc.close();
    }
}

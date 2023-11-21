import java.util.Arrays;

class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(int id, String brand, String model, int year, String color, double price, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String toString() {
        return "Car{id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}

public class App {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(1, "Toyota", "Camry", 2018, "Black", 25000, "ABC123"),
                new Car(2, "Honda", "Civic", 2019, "White", 22000, "XYZ456"),
                new Car(3, "Ford", "Fusion", 2017, "Blue", 20000, "DEF789"),
        };

        System.out.println("All Cars:");
        displayCars(cars);

        System.out.println("\nCars of Brand 'Toyota':");
        displayCars(filterByBrand(cars, "Toyota"));

        System.out.println("\nCars of Model 'Camry' Exploited More Than 5 Years:");
        displayCars(filterByModelAndYear(cars, "Camry", 5));

        System.out.println("\nCars of Year 2018 with Price > 22000:");
        displayCars(filterByYearAndPrice(cars, 2018, 22000));
    }

    private static void displayCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static Car[] filterByBrand(Car[] cars, String brand) {
        return Arrays.stream(cars)
                .filter(car -> car.getBrand().equals(brand))
                .toArray(Car[]::new);
    }

    private static Car[] filterByModelAndYear(Car[] cars, String model, int years) {
        return Arrays.stream(cars)
                .filter(car -> car.getModel().equals(model) && (2023 - car.getYear() > years))
                .toArray(Car[]::new);
    }

    private static Car[] filterByYearAndPrice(Car[] cars, int year, double price) {
        return Arrays.stream(cars)
                .filter(car -> car.getYear() == year && car.getPrice() > price)
                .toArray(Car[]::new);
    }
}

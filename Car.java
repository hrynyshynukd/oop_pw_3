import java.time.Year;

public class Car {

    private String brand;
    private String model;
    private int year;
    private double mileage;

    // Стандартний конструктор
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.mileage = 0.0;
    }

    // Параметризований конструктор
    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;

        // перевірка року
        int currentYear = Year.now().getValue();
        if (year <= currentYear) {
            this.year = year;
        } else {
            this.year = currentYear;
        }

        this.mileage = mileage;
    }

    // Копіювальний конструктор
    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.year = other.year;
        this.mileage = other.mileage;
    }

    public String getInfo() {
        return "Марка: " + brand +
                ", Модель: " + model +
                ", Рік: " + year +
                ", Пробіг: " + mileage + " км.";
    }

    public void updateMileage(double newMileage) {
        if (newMileage >= this.mileage) {
            this.mileage = newMileage;
        }
    }

    public boolean isNewerThan(Car other) {
        return this.year > other.year;
    }

    public boolean hasMoreMileageThan(Car other) {
        return this.mileage > other.mileage;
    }

    // Деструктор
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Автомобіль " + brand + " " + model + " видалено з пам'яті.");
        super.finalize();
    }
}

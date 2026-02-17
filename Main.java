public class Main {

    public static void main(String[] args) {

        // Створення об'єктів

        // Через стандартний конструктор
        Car car1 = new Car();
        System.out.println(car1.getInfo());

        // Через параметризований конструктор
        Car car2 = new Car("Toyota", "Camry", 2020, 45000);
        System.out.println(car2.getInfo());

        // Через копіювальний конструктор
        Car car3 = new Car(car2);
        System.out.println(car3.getInfo());

        car2.updateMileage(50000);
        System.out.println("Після оновлення пробігу:");
        System.out.println(car2.getInfo());

        System.out.println("car2 новіший за car1? " + car2.isNewerThan(car1));
        System.out.println("car2 має більший пробіг за car1? " + car2.hasMoreMileageThan(car1));

        // Виклик збирача сміття для демонстрації деструктора
        car1 = null;
        car2 = null;
        car3 = null;

        System.gc();
    }
}

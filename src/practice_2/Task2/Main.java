package practice_2.Task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("model1", "license1", "color1", 2023);
        Car car2 = new Car("model1", "license1");
        Car car3 = new Car();

        car2.SetYear(2015);
        car3.SetYear(2020);

        System.out.println("car1:");
        car1.To_String();
        System.out.println("\ncar2:");
        car2.To_String();
        System.out.println("\ncar3:");
        car3.To_String();
        System.out.print('\n');

        System.out.println("Age of car1: " + car1.AgeOfCar());
        System.out.println("Age of car2: " + car2.AgeOfCar());
        System.out.println("Age of car3: " + car3.AgeOfCar());
    }
}
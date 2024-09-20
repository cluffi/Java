package practice_2.Task2;

public class Car {
    String model;
    String license;
    String color;
    int year;
    public static int currentYear = 2024;
    public Car(String inputModel, String inputLicense, String inputColor, int inputYear){
        model = inputModel;
        license = inputLicense;
        color = inputColor;
        year = inputYear;
    }
    public Car(){
        model = license = color = "Unknown";
        year = currentYear;
    }
    public Car(String inputModel, String inputLicense){
        model = inputModel;
        license = inputLicense;
        color = "Unknown";
        year = currentYear;
    }
    public void To_String(){
        System.out.print("model: " + model + "\nlicense: " + license + "\ncolor: " + color + "\nyear: " + year + '\n');
    }
    public void SetModel(String input){
        model = input;
    }
    public String GetModel(){
        return model;
    }
    public void SetLicense(String input){
        license = input;
    }
    public String GetLicense(){
        return license;
    }
    public void SetColor(String input){
        color = input;
    }
    public String GetColor(){
        return color;
    }
    public void SetYear(int input){
        year = input;
    }
    public int GetYear(){
        return year;
    }
    public int AgeOfCar(){
        return currentYear - year;
    }
}

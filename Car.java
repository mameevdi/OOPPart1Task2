//Задание 2. Напишите программу, которая будет выводить в консоль информацию о каждом автомобиле и все характеристики.
public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + productionYear + " года выпуска, сборка в " + productionCountry + ", " + color + " цвет кузова, объем двигателя — " + engineVolume + " л.";
    }
}
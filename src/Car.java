public class Car {


     String brand;
     String model;
     double engineVolume;
     String color;
     int productionYear;
     String productionCountry;

    public Car(){}
    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null || brand == "") this.brand = "default";
        else this.brand = brand;
        if (model == null || model == "") this.model = "default";
        else this.model = model;
        if (engineVolume <= 0) this.engineVolume = 1.5;
        else this.engineVolume = engineVolume;
        if (color == null || color == "") this.color = "белый";
        else this.color = color;
        if (productionYear <=0) this.productionYear = 2000;
        else this.productionYear = productionYear;
        if (productionCountry == null || productionCountry == "") this.productionCountry= "default";
        else this.productionCountry = productionCountry;
    }

    public String toString3() {
        return brand + ' ' + model + ", " +
                productionYear + " год выпуска," + productionCountry +
                ", "+ color + " цвета, " +
                "объем двигателя - "+ engineVolume;


    }

}


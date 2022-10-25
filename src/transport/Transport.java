package transport;

public abstract class Transport {
    private final String startStation;
    private final String model;

    private String color;
    private final int productionYear;
    private final String productionCountry;
    private int maxSpeed;
    private String fuelType;

    public Transport(String brand, String model, String color, int productionYear, String productionCountry,
                     int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) this.startStation = "default";
        else this.startStation = brand;
        if (model == null || model.isEmpty() || model.isBlank()) this.model = "default";
        else this.model = model;
        if (productionYear <= 0) this.productionYear = 2000;
        else this.productionYear = productionYear;
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank())
            this.productionCountry = "default";
        else this.productionCountry = productionCountry;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public abstract void refill();

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        if (fuelType.isEmpty() || fuelType.isBlank() || fuelType == null) {
            this.fuelType = "default";
        } else this.fuelType = fuelType;
    }

    public String getBrand() {
        return startStation;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) this.color = "белый";
        else this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) this.maxSpeed = Math.abs(maxSpeed);
        else this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return getBrand() + ' ' + getModel() + ", " +
                getProductionYear() + " год выпуска," + " страна производитель - " + getProductionCountry() +
                ", " + getColor() + " цвет, " + " максимальная скорость - " + maxSpeed
                + ", используемое топливо - " + getFuelType() + ",";
    }
}

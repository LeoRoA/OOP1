package transport;

public abstract class Transport {
    private final String brand;
    private final String model;

    private String color;
    private final int productionYear;
    private final String productionCountry;
    public int maxSpeed;
    private String fuelType;

    public Transport(String brand, String model, String color, int productionYear, String productionCountry,
                     int maxSpeed) {
        this.brand = ValidationUtil.valOrDefString(brand, "default");
        this.model = ValidationUtil.valOrDefString(model, "default");
        this.productionYear = (int) ValidationUtil.valOrDefYear(productionYear);
        this.productionCountry = ValidationUtil.valOrDefString(productionCountry, "default");
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public abstract void refill();

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = ValidationUtil.valOrDefString(fuelType, "default");
    }

    public String getBrand() {
        return brand;
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
        this.color = ValidationUtil.valOrDefString(color, "белый");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed =  ValidationUtil.valOrDefInt(maxSpeed, 200);
    }

    public String toString() {
        return getBrand() + ' ' + getModel() + ", " +
                getProductionYear() + " год выпуска," + " страна производитель - " + getProductionCountry() +
                ", " + getColor() + " цвет, " + " максимальная скорость - " + maxSpeed
                + ", используемое топливо - " + getFuelType() + ",";
    }
}

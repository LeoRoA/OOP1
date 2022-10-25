package transport;

public class Bus extends Transport {
    private final int seats;

    public Bus(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed,
               int seats, String fuelType) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        if (seats < 0) this.seats = Math.abs(seats);
        else this.seats = seats;
        setFuelType(fuelType);
    }

    @Override
    public void refill() {
        if (getFuelType().toLowerCase() == "disel" || getFuelType().toLowerCase() == "дизель") {
            System.out.println("Необходима дозаправка дизелем");
        } else if (getFuelType().toLowerCase() == "petrol" || getFuelType().toLowerCase() == "бензин") {
            System.out.println("Необходима дозаправка бензином");
        }
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString() + " количество мест: " + getSeats();
    }
}

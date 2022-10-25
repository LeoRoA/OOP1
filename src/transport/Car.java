package transport;

import java.time.LocalDate;
import java.util.Locale;


public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyStyle;
    private final int seats;
    boolean winterTires;
    String regNumber;
    int maxSpeed;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyStyle, int seats, boolean winterTires,
               String regNumber, int maxSpeed, String fuelType) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        if (bodyStyle == null || bodyStyle == "") this.bodyStyle = "default";
        else this.bodyStyle = bodyStyle;
        if (seats <= 0) this.seats = 5;
        else this.seats = seats;
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setWinterTires(winterTires);
        setRegNumber(regNumber);
        setFuelType(fuelType);

    }
    @Override
    public void refill() {
        if (getFuelType().toLowerCase() == "disel" || getFuelType().toLowerCase() == "дизель" ){
            System.out.println("Необходима дозаправка дизелем");
        }
        else if (getFuelType().toLowerCase() == "petrol" || getFuelType().toLowerCase() == "бензин" ){
            System.out.println("Необходима дозаправка бензином");
        }
        else if (getFuelType().toLowerCase() == "electro" || getFuelType().toLowerCase() == "электро" ){
            System.out.println("Необходима дозарядка на специальной электро-парковке");
        }
    }
    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth >= 10 || currentMonth <= 4) winterTires = true;
        else winterTires = false;
    }

    public boolean checkValidNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] regNumbersChars = regNumber.toUpperCase().toCharArray();
        return isChar(regNumbersChars[0]) &&
                isNumber(regNumbersChars[1]) &&
                isNumber(regNumbersChars[2]) &&
                isNumber(regNumbersChars[3]) &&
                isChar(regNumbersChars[4]) &&
                isChar(regNumbersChars[5]) &&
                isNumber(regNumbersChars[6]) &&
                isNumber(regNumbersChars[7]) &&
                isNumber(regNumbersChars[8]);
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isChar(char symbol) {
        String allowedSymbols = "ABEKMHOPCTXYАВЕКМНОРСТХУ";
        return allowedSymbols.contains("" + symbol);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) this.engineVolume = 1.5;
        else this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public int getSeats() {
        return seats;
    }
@Override
    public String toString() {
        return "Автомобиль " + super.toString()  +
                ", объем двигателя - " + engineVolume +" количество мест: "+getSeats();
    }

    public class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean hasRemoteStart() {
            return remoteStart;
        }

        public boolean hasKeylessAccess() {
            return keylessAccess;
        }
    }

    public class Insurance {
        private final LocalDate validityPeriod;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validityPeriod, float cost, String number) {
            this.validityPeriod = validityPeriod != null ? validityPeriod : LocalDate.now().plusDays(3);
            if (cost > 0) this.cost = cost;
            else this.cost = Math.abs(cost);
            if (number != null) this.number = number;
            else this.number = "default";
        }

        public boolean isInsuranceValid() {
            return (LocalDate.now().compareTo(validityPeriod) < 0);
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public float getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }


}

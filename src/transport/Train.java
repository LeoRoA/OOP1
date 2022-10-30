package transport;

public class Train extends Transport {
    private int priceTrainTicket;
    private int travelTime;
    private String startStation;
    private String lastStation;
    private int amountWagons;


    public Train(String brand, String model, String color, int productionYear, String productionCountry,
                 int maxSpeed, int priceTrainTicket, int travelTime, String startStation,
                 String lastStation, int amountWagons) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        setPriceTrainTicket(priceTrainTicket);
        setTravelTime(travelTime);
        setStartStation(startStation);
        setLastStation(lastStation);
        setAmountWagons(amountWagons);
        setFuelType("Дизель");
    }

    public void setPriceTrainTicket(int priceTrainTicket) {
        this.priceTrainTicket = ValidationUtil.valOrDefInt(priceTrainTicket, 0);
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = ValidationUtil.valOrDefInt(travelTime, 1);
    }

    public void setStartStation(String startStation) {
        this.startStation = ValidationUtil.valOrDefString(startStation, "default");
    }

    public void setLastStation(String lastStation) {
        this.startStation = ValidationUtil.valOrDefString(lastStation, "default");
    }

    public int getPriceTrainTicket() {
        return priceTrainTicket;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public String getStartStation() {
        return startStation;
    }


    public String getLastStation() {
        return lastStation;
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        this.amountWagons = ValidationUtil.valOrDefInt(amountWagons, 1);
    }

    @Override
    public String toString() {
        return "Поезд " + super.toString() + " отходит от станции " + startStation + " и следует до станции " + lastStation +
                ". Время в пути - " + getTravelTime() + ". Цена поездки - " + getPriceTrainTicket() + ", в поезде " +
                getAmountWagons() + " вагонов";
    }

    @Override
    public void refill() {
        System.out.println("Необходима дозаправка дизелем");
    }
}

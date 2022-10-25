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
        if (priceTrainTicket < 0) this.priceTrainTicket = Math.abs(priceTrainTicket);
        else this.priceTrainTicket = priceTrainTicket;
    }

    public void setTravelTime(int travelTime) {
        if (travelTime < 0) this.travelTime = Math.abs(travelTime);
        else this.travelTime = travelTime;
    }

    public void setStartStation(String startStation) {
        if (startStation == null || startStation.isEmpty() || startStation.isBlank()) this.startStation = "default";
        else this.startStation = startStation;
    }

    public void setLastStation(String lastStation) {
        if (lastStation == null || lastStation.isEmpty() || lastStation.isBlank()) this.lastStation = "default";
        else this.lastStation = lastStation;
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
        if (amountWagons == 0) this.amountWagons = 1;
        else if (amountWagons < 0) {
            this.amountWagons = Math.abs(amountWagons);
        } else this.amountWagons = amountWagons;
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

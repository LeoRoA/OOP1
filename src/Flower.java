public class Flower {
    private String flowerColor;
    private String country;
    private float cost;
    int lifeSpan;

    public Flower(String flowerColor, String country, float cost, int lifeSpan) {
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        if (lifeSpan < 0) this.lifeSpan = 3;
        else this.lifeSpan = lifeSpan;
    }
    public Flower(String flowerColor, String country, float cost) {
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        this.lifeSpan = 3;

    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) this.flowerColor = "белый";
        else this.flowerColor = flowerColor;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) this.country = "Россия";
        else this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost <= 0) this.cost = 1;
        else this.cost = cost;
    }

    @Override
    public String toString() {
        return  "цвет '" + flowerColor + '\'' +
                ", страна происхождения - " + country + '\'' +
                ", цена - " + cost + " рублей"+
                ", срок стояния - " + lifeSpan + " дней";
    }

    public int getLifeSpan() {
        return lifeSpan;
    }
}

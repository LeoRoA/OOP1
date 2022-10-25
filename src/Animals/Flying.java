package Animals;

import java.util.Objects;

public class Flying extends Birds{
    private String movingType;

    public Flying(String name, int age, String habibat, String movingType) {
        super(name, age, habibat);
        this.movingType = movingType;
    }
    private void fly(){
        System.out.println("Полечу на солнце");
    }
    public String getMovingType() {
        return movingType;
    }

    @Override
    public void hunt() {
        System.out.println("Наполним клювы!");
    }

    @Override
    public void eat() {
        System.out.println("Поймаем еще пару букашек на лету");
    }

    @Override
    public void sleep() {
        System.out.println("Спать на ветке в гнезде просто топ");
    }

    @Override
    public void move() {
        System.out.println("Я могу " + movingType + ", вот так и буду делать");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flightless)) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return getMovingType().equals(that.getMovingType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMovingType());
    }
    @Override
    public String toString() {
        return super.toString()+" летающие Кличка - " + getName()+
        ", возраст - "+ getAge() + ". Ареол обитания - " + getHabibat()+
                ". Специфика - " + getMovingType() + "полет";
    }
}

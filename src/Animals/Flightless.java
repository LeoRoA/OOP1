package Animals;

import java.util.Objects;

public class Flightless extends Birds {
    private String movingType;

    public Flightless(String name, int age, String habibat, String movingType) {
        super(name, age, habibat);
        this.movingType = ValidationUtil.valOrDefString(movingType,"jumping");
    }
    private void walk(){
        System.out.println("Пойду посмотрю на этих Икаров");
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
        System.out.println("Какие вкусные червячки на земле!");
    }

    @Override
    public void sleep() {
        System.out.println("Спать не на ветке конечно опасно, но как иначе?");
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
        return super.toString()+" нелетающие. Кличка - " + getName()+
                    ", возраст - "+ getAge() + ". Ареол обитания - " + getHabibat()+
                    ". Способ перемещения - " + getMovingType();

    }
}

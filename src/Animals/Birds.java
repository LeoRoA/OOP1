package Animals;

import java.util.Objects;

public abstract class Birds extends Animals {
    private String habibat;

    public Birds(String name, int age, String habibat) {
        super(name, age);
        setHabibat(habibat);
    }

    public String getHabibat() {
        return habibat;
    }

    public void setHabibat(String habibat) {
        this.habibat = ValidationUtil.valOrDefString(habibat, "default");
    }

    public abstract void hunt();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        Birds birds = (Birds) o;
        return getHabibat().equals(birds.getHabibat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHabibat());
    }

    @Override
    public String toString() {
        return "Класс птицы.";
    }
}

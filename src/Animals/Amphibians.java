package Animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String habibat;

    public Amphibians(String name, int age, String habibat) {
        super(name, age);
        setHabibat(habibat);
    }

    private void hunt() {
        System.out.println("Время охоты!");
    }

    public String getHabibat() {
        return habibat;
    }

    public void setHabibat(String habibat) {
        this.habibat = ValidationUtil.valOrDefString(habibat, "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(getHabibat(), that.getHabibat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHabibat());
    }

    @Override
    public void eat() {
        System.out.println("Ммм, едааа");
    }

    @Override
    public void sleep() {
        System.out.println("Если я не ем, значит я сплю");
    }

    @Override
    public void move() {
        System.out.println("Движение это для других");
    }

    @Override
    public String toString() {
        return "Класс земноводные.";
    }
}


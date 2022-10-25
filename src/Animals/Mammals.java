package Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String habibat;
    private int movingSpeed;

    public Mammals(String name, int age, String habibat, int movingSpeed) {
        super(name, age);
        setHabibat(habibat);
        if (movingSpeed < 0) this.movingSpeed = Math.abs(movingSpeed);
        else if (movingSpeed == 0) this.movingSpeed = 5;
        else this.movingSpeed = movingSpeed;
    }

    public String getHabibat() {
        return habibat;
    }

    public void setHabibat(String habibat) {
        if (habibat == null || habibat.isEmpty() || habibat.isBlank()) this.habibat = "default";
        else this.habibat = habibat;
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public abstract void walking();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        Mammals mammals = (Mammals) o;
        return getMovingSpeed() == mammals.getMovingSpeed() && getHabibat().equals(mammals.getHabibat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHabibat(), getMovingSpeed());
    }
    @Override
    public String toString() {
        return "Класс млекопитающие.";
    }
}

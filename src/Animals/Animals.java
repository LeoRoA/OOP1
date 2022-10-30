package Animals;

import java.time.LocalDate;

public abstract class Animals {
    private String name;
    private int birthYear;

    public Animals(String name, int age) {
        this.name = ValidationUtil.valOrDefString(name, "default");
        this.birthYear = ValidationUtil.valOrDefYear(age);
    }

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();
}


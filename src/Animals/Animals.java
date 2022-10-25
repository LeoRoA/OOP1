package Animals;

import java.time.LocalDate;

public abstract class Animals {
    private String name;
    private int birthYear;

    public Animals(String name, int age) {
        if (name == null || name.isEmpty() || name.isBlank()) this.name = "noname";
        else this.name = name;
        if (age >= 0) this.birthYear = LocalDate.now().getYear() - age;
        else this.birthYear = LocalDate.now().getYear() - Math.abs(age);
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


package Animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String foodType;

    public Herbivores(String name, int age, String habibat, int movingSpeed, String foodType) {
        super(name, age, habibat, movingSpeed);
        setFoodType(foodType);
    }

    private void feed() {
        System.out.println("Время пастись!");
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = ValidationUtil.valOrDefString(foodType, "grass");
    }


    @Override
    public void eat() {
        System.out.println("Ммм, " + foodType);
    }

    @Override
    public void sleep() {
        System.out.println("Поели можно и поспать");
    }

    @Override
    public void move() {
        System.out.println("Хищники! Бежим прочь!");
    }

    @Override
    public void walking() {
        System.out.println("Какой прекрасный" + getHabibat() + ", можно и побродить");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores)) return false;
        Herbivores that = (Herbivores) o;
        return foodType.equals(that.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType);
    }

    @Override
    public String toString() {
        return super.toString() + " Подкласс травоядные. Кличка - " + getName() +
                ", возраст - " + getAge() + ". Ареол обитания - " + getHabibat() +
                ". Скорость передвижения - " + getMovingSpeed() +
                ". Питается - " + foodType;
    }
}

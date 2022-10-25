package Animals;

import java.util.Objects;

public class Predators extends Mammals {
    private String foodType;

    public Predators(String name, int age, String habibat, int movingSpeed, String foodType) {
        super(name, age, habibat, movingSpeed);
        setFoodType(foodType);
    }

    private void hunt() {
        System.out.println("Время охоты!");
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void eat() {
        System.out.println("Ммм, свеженькое" + foodType);
    }

    @Override
    public void sleep() {
        System.out.println("Поcле сытного обеда...");
    }

    @Override
    public void move() {
        System.out.println("Дичь! Догнать!");
    }

    @Override
    public void walking() {
        System.out.println("Какой прекрасный" + getHabibat() + ", можно и подождать блуждающих");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        Predators predators = (Predators) o;
        return getFoodType().equals(predators.getFoodType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFoodType());
    }
    @Override
    public String toString() {
        return super.toString()+" Подкласс хищники. Кличка - " + getName()+
                ", возраст - "+ getAge() + ". Ареол обитания - " + getHabibat()+
                ". Скорость передвижения - " + getMovingSpeed() +
                ". Питается - "+ foodType;
    }
}

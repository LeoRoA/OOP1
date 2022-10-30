import java.time.LocalDate;
public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    private String position;


    public Human() {
    }

    public Human(int age, String name, String town) {
        if (age>0) this.yearOfBirth = LocalDate.now().getYear()-age;
        else this.yearOfBirth = 0;
        if (name == null || name.isEmpty()) this.name = "информация не указана";
        else this.name = name;
        if (town == null || town.isEmpty()) this.town = "информация не указана";
        else this.town = town;
        this.position = "информация не указана";
    }


    public String toString1() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Будем знакомы!";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position == null || position.isEmpty()) this.position = "информация не указана";
        else this.position = position;
    }

    public String toString2() {
        return "Привет! Меня зовут " + name + ". Я из города " + getTown() + ". Мне " + (LocalDate.now().getYear() - getYearOfBirth()) + " " +
                "лет. Я работаю на должности " + getPosition() + " Будем знакомы!";
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty()) this.town = "Информация не указана";
        else this.town = town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setAge(int age) {
        if (age>0) this.yearOfBirth = LocalDate.now().getYear()-age;
        else this.yearOfBirth = 0;
    }
}

public class Human {
    int yearOfBirth;
    String name;
    String city;
    String position;


    public Human() {
    }

    public Human(int yearOfBirth, String name, String city) {
        if (yearOfBirth>0) this.yearOfBirth = yearOfBirth;
        else this.yearOfBirth = 0;
        if (name == null || name == "") this.name = "Информация не указана";
        else this.name = name;
        if (city == null || city == "") this.city = "Информация не указана";
        else this.city = city;
    }


    public String toString1() {
        return "Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearOfBirth +
                " году. Будем знакомы!";
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString2() {
        return "Привет! Меня зовут " + name + ". Я из города " + city + ". Мне " + (2022 - yearOfBirth) + " " +
                "лет. Я работаю на должности " + position + " Будем знакомы!";
    }

}

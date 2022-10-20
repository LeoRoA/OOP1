public class Main {

    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
        task5();

    }

    public static void task1_2() {
        Human Максим = new Human();
        Максим.name = "Максим";
        Максим.city = "Минск";
        Максим.yearOfBirth = 1987;
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. " +
                "Будем знакомы! \n", Максим.name, Максим.city, Максим.yearOfBirth);

        Human Аня = new Human();
        Аня.name = "Аня";
        Аня.city = "Москва";
        Аня.yearOfBirth = 1993;
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. " +
                "Будем знакомы! \n", Аня.name, Аня.city, Аня.yearOfBirth);

        Human Катя = new Human();
        Катя.name = "Катя";
        Катя.city = "Калининград";
        Катя.yearOfBirth = 1994;
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. " +
                "Будем знакомы! \n", Катя.name, Катя.city, Катя.yearOfBirth);

        Human Артем = new Human();
        Артем.name = "Артем";
        Артем.city = "Москва";
        Артем.yearOfBirth = 1995;
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. " +
                "Будем знакомы! \n", Артем.name, Артем.city, Артем.yearOfBirth);
    }

    public static void task3() {
        Car Lada_Grande = new Car();
        Lada_Grande.brand = "Lada";
        Lada_Grande.model = "Grande";
        Lada_Grande.engineVolume = 1.7;
        Lada_Grande.color = "желтый";
        Lada_Grande.productionYear = 2015;
        Lada_Grande.productionCountry = "сборка в России";
        System.out.printf("%s %s, %s, %s цвет, объем двигателя - %f\n",
                Lada_Grande.brand, Lada_Grande.model, Lada_Grande.productionCountry,
                Lada_Grande.color, Lada_Grande.engineVolume);

        Car Audi_A8 = new Car();
        Audi_A8.brand = "Audi";
        Audi_A8.model = "A8 50 L TDI quattro";
        Audi_A8.engineVolume = 3.0;
        Audi_A8.color = "черный";
        Audi_A8.productionYear = 2020;
        Audi_A8.productionCountry = "сборка в Германии";
        System.out.printf("%s %s, %s, %s цвет, объем двигателя - %f\n",
                Audi_A8.brand, Audi_A8.model, Audi_A8.productionCountry,
                Audi_A8.color, Audi_A8.engineVolume);

        Car BMW_Z8 = new Car();
        BMW_Z8.brand = "BMW";
        BMW_Z8.model = "Z8";
        BMW_Z8.engineVolume = 3.0;
        BMW_Z8.color = "черный";
        BMW_Z8.productionYear = 2021;
        BMW_Z8.productionCountry = "сборка в России";
        System.out.printf("%s %s, %s, %s цвет, объем двигателя - %f\n",
                BMW_Z8.brand, BMW_Z8.model, BMW_Z8.productionCountry,
                BMW_Z8.color, BMW_Z8.engineVolume);

        Car Kia_Sportage = new Car();
        Kia_Sportage.brand = "Kia";
        Kia_Sportage.model = "Sportage 4 поколение";
        Kia_Sportage.engineVolume = 2.4;
        Kia_Sportage.color = "красный";
        Kia_Sportage.productionYear = 2018;
        Kia_Sportage.productionCountry = "сборка в Южной Корее";
        System.out.printf("%s %s, %s, %s цвет, объем двигателя - %f\n",
                Kia_Sportage.brand, Kia_Sportage.model, Kia_Sportage.productionCountry,
                Kia_Sportage.color, Kia_Sportage.engineVolume);

        Car Hyundai_Avante = new Car();
        Hyundai_Avante.brand = "Hyundai";
        Hyundai_Avante.model = "Avante";
        Hyundai_Avante.engineVolume = 1.6;
        Hyundai_Avante.color = "оранжевый";
        Hyundai_Avante.productionYear = 2016;
        Hyundai_Avante.productionCountry = "сборка в Южной Корее";
        System.out.printf("%s %s, %s, %s цвет, объем двигателя - %f\n",
                Hyundai_Avante.brand, Hyundai_Avante.model, Hyundai_Avante.productionCountry,
                Hyundai_Avante.color, Hyundai_Avante.engineVolume);

    }

    private static void task4() {
        Human Максим = new Human(1987, "Максим","");
        Human Аня = new Human(1993, "Аня", "Москва");
        Human Катя = new Human(-1994, "Катя", "Калининград");
        Human Артем = new Human(1995, "Артем", "Москва");
        System.out.println(Максим.toString1());
        System.out.println(Аня.toString1());
        System.out.println(Катя.toString1());
        System.out.println(Артем.toString1());
        Максим.setPosition("бренд-менеджер");
        Аня.setPosition("методист образовательных программ");
        Катя.setPosition("продакт-менеджер");
        Артем.setPosition("директор по развитию бизнеса");
        System.out.println(Максим.toString2());
        System.out.println(Аня.toString2());
        System.out.println(Катя.toString2());
        System.out.println(Артем.toString2());
    }


    private static void task5() {
        Car Lada_Grande = new Car("Lada", "Grande",
                1.7, "желтый", 2015,
                "сборка в России");
        Car Audi_A8 = new Car("Audi", "A8 50 L TDI quattro",
                3.0, "", 2020,
                "сборка в Германии");
        Car BMW_Z8 = new Car("BMW", "Z8",
                0, "черный", -2021,
                "сборка в Германии");
        Car Kia_Sportage = new Car("", "Sportage 4 поколение",
                2.4, "красный", 2018,
                "сборка в Южной Корее");
        Car Hyundai_Avante = new Car("Hyundai", "Avante",
                1.6, "оранжевый", 2016,
                "сборка в Южной Корее");
        System.out.println(Lada_Grande.toString3());
        System.out.println(Audi_A8.toString3());
        System.out.println(BMW_Z8.toString3());
        System.out.println(Kia_Sportage.toString3());
        System.out.println(Hyundai_Avante.toString3());
    }

    public static void task6 () {

    }

}
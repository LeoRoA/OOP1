import Animals.*;
import transport.Bus;
import transport.Car;
import transport.Car.Key;
import transport.Train;

public class Main {

    public static void main(String[] args) {
        //task1_1and2();
        //task1_3();
        //task1_4();
        task1_5();
        //task2_1();
        //task2_2();
        task3_2();
        task3_3();
        task3_5();
    }

    /*public static void task1_1and2() {
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

    public static void task1_3() {
        transport.Car Lada_Grande = new transport.Car();
        Lada_Grande.brand = "Lada";
        Lada_Grande.model = "Grande";
        Lada_Grande.engineVolume = 1.7;
        Lada_Grande.color = "желтый";
        Lada_Grande.productionYear = 2015;
        Lada_Grande.productionCountry = "сборка в России";
        System.out.printf("%s %s, %s, %s цвет, объем двигателя - %f\n",
                Lada_Grande.brand, Lada_Grande.model, Lada_Grande.productionCountry,
                Lada_Grande.color, Lada_Grande.engineVolume);

        transport.Car Audi_A8 = new transport.Car();
        Audi_A8.brand = "Audi";
        Audi_A8.model = "A8 50 L TDI quattro";
        Audi_A8.engineVolume = 3.0;
        Audi_A8.color = "черный";
        Audi_A8.productionYear = 2020;
        Audi_A8.productionCountry = "сборка в Германии";
        System.out.printf("%s %s, %s, %s цвет, объем двигателя - %f\n",
                Audi_A8.brand, Audi_A8.model, Audi_A8.productionCountry,
                Audi_A8.color, Audi_A8.engineVolume);

        transport.Car BMW_Z8 = new transport.Car();
        BMW_Z8.brand = "BMW";
        BMW_Z8.model = "Z8";
        BMW_Z8.engineVolume = 3.0;
        BMW_Z8.color = "черный";
        BMW_Z8.productionYear = 2021;
        BMW_Z8.productionCountry = "сборка в России";
        System.out.printf("%s %s, %s, %s цвет, объем двигателя - %f\n",
                BMW_Z8.brand, BMW_Z8.model, BMW_Z8.productionCountry,
                BMW_Z8.color, BMW_Z8.engineVolume);

        transport.Car Kia_Sportage = new transport.Car();
        Kia_Sportage.brand = "Kia";
        Kia_Sportage.model = "Sportage 4 поколение";
        Kia_Sportage.engineVolume = 2.4;
        Kia_Sportage.color = "красный";
        Kia_Sportage.productionYear = 2018;
        Kia_Sportage.productionCountry = "сборка в Южной Корее";
        System.out.printf("%s %s, %s, %s цвет, объем двигателя - %f\n",
                Kia_Sportage.brand, Kia_Sportage.model, Kia_Sportage.productionCountry,
                Kia_Sportage.color, Kia_Sportage.engineVolume);

        transport.Car Hyundai_Avante = new transport.Car();
        Hyundai_Avante.brand = "Hyundai";
        Hyundai_Avante.model = "Avante";
        Hyundai_Avante.engineVolume = 1.6;
        Hyundai_Avante.color = "оранжевый";
        Hyundai_Avante.productionYear = 2016;
        Hyundai_Avante.productionCountry = "сборка в Южной Корее";
        System.out.printf("%s %s, %s, %s цвет, объем двигателя - %f\n",
                Hyundai_Avante.brand, Hyundai_Avante.model, Hyundai_Avante.productionCountry,
                Hyundai_Avante.color, Hyundai_Avante.engineVolume);

    }*/

    private static void task1_4() {
        Human Максим = new Human(35, "Максим", "");
        Human Аня = new Human(29, "Аня", "Москва");
        Human Катя = new Human(-28, "Катя", "Калининград");
        Human Артем = new Human(27, "Артем", "Москва");
        //System.out.println(Максим.toString1());
        //System.out.println(Аня.toString1());
        //System.out.println(Катя.toString1());
        //System.out.println(Артем.toString1());
        Максим.setPosition("бренд-менеджер");
        Аня.setPosition("методист образовательных программ");
        Катя.setPosition("продакт-менеджер");
        Артем.setPosition("директор по развитию бизнеса");
        //System.out.println(Максим.toString2());
        //System.out.println(Аня.toString2());
        //System.out.println(Катя.toString2());
        //System.out.println(Артем.toString2());
    }


    private static void task1_5() {
        Car Lada_Grande = new Car("Lada", "Grande", 0, "желтый", 2015,
                "сборка в России", "auto", "sedan", 5, false, "a345bb080", 120, "electro");

        /*Car Audi_A8 = new Car("Audi", "A8 50 L TDI quattro",
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
        //System.out.println(Lada_Grande.toString3());
        //System.out.println(Audi_A8.toString3());
        //System.out.println(BMW_Z8.toString3());
        //System.out.println(Kia_Sportage.toString3());
        //System.out.println(Hyundai_Avante.toString3());*/

        //task2_3
        System.out.println("Lada_Grande.checkValidNumber() = " + Lada_Grande.checkValidNumber());
        //task 2.4
        Key keyLada = Lada_Grande.new Key(false, false);
        System.out.println("keyLada.hasKeylessAccess() = " + keyLada.hasKeylessAccess());
        System.out.println("keyLada.hasRemoteStart() = " + keyLada.hasRemoteStart());
        //task 2.5
        //Car.Insurance insuranceLada = Lada_Grande.new Insurance(11_12_22, -7564f, "");
        //System.out.println("insuranceLada.getCost() = " + insuranceLada.getCost());
        //System.out.println("insuranceLada.getNumber() = " + insuranceLada.getNumber());

        //task 3.2
        System.out.println(Lada_Grande);

        //task 3.4
        Lada_Grande.refill();
    }

    /*
    public static void task2_1 () {
    Human Владимир = new Human(21, "Владимир", "Казань");
        System.out.println(Владимир.toString2());
    }

    public static void task2_2() {
        Flower Роза = new Flower("","Голландии",35.59f);
        System.out.println("Роза: " + Роза.toString());
        Flower Хризантема = new Flower("", "",15, 5);
        System.out.println("Хризантема: " + Хризантема.toString());
       Flower Пион = new Flower("","Анлия", 69.9f, 1);
        System.out.println("Пион: " + Пион.toString());
        Flower Гипсофила = new Flower("","Турция", 19.5f, 10);
        System.out.println("Гипсофила: " + Гипсофила.toString());
        Bouquet bouquet1 = new Bouquet(new Flower[]{Роза, Хризантема, Пион, Роза, Роза});
        System.out.println("bouquet1.getBouquetCoast() = " + bouquet1.getBouquetCoast());
        System.out.println("bouquet1.getBouquetSpan() = " + bouquet1.getBouquetSpan());
    }*/
    public static void task3_2() {
        Train Lastochka = new Train("Ласточка", "B-901", "", 2011, "Россия",
                301, 3500, 7, "Белорусский вокзал", "Минск-Пассажирский", 11);
        System.out.println(Lastochka);
        Train Leningrad = new Train("Ленинград", "D-125", "", 2019, "Россия",
                270, 1700, 9, "Ленинградский вокзал", "Ленинград-Пассажирский", 11);
        System.out.println(Leningrad);
        //task 3_4
        Lastochka.refill();
    }

    public static void task3_3() {
        Bus Ford_Transit = new Bus("Ford", "Transit", "бирюзовый", 2020, "USA",
                200, 8, "бензин");
        System.out.println(Ford_Transit);
        Bus Peugeot_Boxer = new Bus("Peugeot", "Boxer", "", 2013, "Франция",
                180, 17, "дизель");
        System.out.println(Peugeot_Boxer);
        Bus Higer_KLQ6119TQ = new Bus("Higer", " KLQ6119TQ", "желтый", 2011,
                "Китай", 160, 55, "дизель");
        System.out.println(Higer_KLQ6119TQ);

        //task 3_4
        Peugeot_Boxer.refill();
    }

    public static void task3_5() {
        Herbivores Gazel = new Herbivores("Gazo", 1, "Africa", 50, "трава");
        Herbivores Giraffa = new Herbivores("Gir", 14, "South Africa", 55, "листва");
        Herbivores Horse = new Herbivores("Aisac", 4, "Siberia", 60, "сено");
        System.out.println("Газель: " + Gazel);
        System.out.println("Жираф: " + Giraffa);
        System.out.println("Лошадь: " + Horse);
        System.out.println("Наличие дубликатов среди млекопитающих:" + (Gazel.equals(Giraffa)||Horse.equals(Gazel)));

        Predators Hyena = new Predators("Asante", 3, "Africa", 63, "антилопа");
        Predators Tiger = new Predators("Shere Khan", 9, "India", 65, "косуля");
        Predators Bear = new Predators("Baloo", 9, "India", 56, "грызуны");
        System.out.println("Гиена: " + Hyena);
        System.out.println("Тигр: " + Tiger);
        System.out.println("Медведь: " + Bear);
        System.out.println("Наличие дубликатов среди хищников: " + (Hyena.equals(Tiger) || Bear.equals(Hyena)));

        Amphibians Frog = new Amphibians("Naveen", 6, "India");
        Amphibians Cerberus = new Amphibians("Naga", 4, "East Asia");
        System.out.println("Лягушка: " + Frog);
        System.out.println("Уж пресноводный: " + Cerberus);
        System.out.println("Наличие дубликатов среди амфибий: "+ (Frog.equals(Cerberus)));

        Flightless Peacock = new Flightless("Pavel", 17, "India", "бег");
        Flightless Penguin = new Flightless("Skipper", 15, "Antarctica", "плавать");
        Flightless Dodo = new Flightless("Mavrik", 15, "In our memory", "бег");
        System.out.println("Павлин: " + Peacock);
        System.out.println("Пингвин: " + Penguin);
        System.out.println("Додо птица: " + Dodo);
        System.out.println("Наличие дубликатов среди нелетающих птиц: " + (Peacock.equals(Penguin)));

        Flying Swallow = new Flying("Chif-chif", 5, "Europe", "короткий парящий");
        Flying Albatros = new Flying("Bratuha>", 5, "New Zealand", "длительный парящий");
        Flying Falcon = new Flying("Finist>", 16, "Africa", "пикирующий");
        System.out.println("Ласточка: " + Swallow);
        System.out.println("Альбатрос: " + Albatros);
        System.out.println("Сокол: " + Falcon);
        System.out.println("Наличие дубликатов среди летающих птиц: " + (Swallow.equals(Albatros) || Falcon.equals(Swallow)));
    }
}


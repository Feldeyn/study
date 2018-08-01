package lesson10;

public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons favorite = Seasons.SPRING;
        System.out.println(favorite);
        print(favorite);
        mas();
    }

    static void print(Seasons favorite) {
        switch (favorite) {
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            default:
                System.out.println("Сезоны закончились");
        }
    }

    static void mas() {
        Seasons[] seasons = Seasons.values();
        for (Seasons s : seasons) {
            System.out.println(s + "  " +s.getDescription() + ". Средняя температура приблизительно - " + "("+s.getTemperatura()+")");
        }
        Seasons lubimoe = Seasons.valueOf("SPRING");
        System.out.println("Переменная lubimoe содержит " + lubimoe);
    }
}

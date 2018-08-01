package lesson10.task4;

public class Atelier {

    public static void wearMen(Clothe[] clothers) {
        System.out.println("Мужская одежда, которая есть в ателье:");
        for (Clothe c : clothers) {
            if (c instanceof MenClothe) {
                MenClothe r = (MenClothe) c;
                r.wearMen();
            }
        }
    }

    public static void wearWomen(Clothe[] clothers) {
        System.out.println("\n"+"Женская одежда, которая есть в ателье:");
        for (Clothe c : clothers) {
            if (c instanceof WomenClothe) {
                WomenClothe r = (WomenClothe) c;
                r.wearWomen();
            }
        }
    }
}

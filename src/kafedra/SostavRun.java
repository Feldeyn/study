package kafedra;

public class SostavRun {
    public static void main(String[] args) {
        Sostav docent1 = new Sostav(Zvanie.DOCENT, "Tichenko", "Vadim", 11);
        Sostav proffesor1 = new Sostav(Zvanie.PROFFESOR, Dolgnost.ZAMESTITELZAVKAF, "Bratchenko", "Aleksandr", 27);
        Sostav proffesor2 = new Sostav(Zvanie.PROFFESOR, Dolgnost.ZAVCAFEDROY, "Moroz", "Vladimir", 32);
        Sostav asistent1 = new Sostav(Zvanie.ASISTENT, "Gromov", "Igor", 3);
        Sostav[] perechen = {docent1, proffesor1, proffesor2, asistent1};
       // Sostav.zarplata(perechen);

    }
}

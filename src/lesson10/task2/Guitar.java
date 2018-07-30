package lesson10.task2;

public class Guitar implements Instrument{
    private int kolStrun;

    public Guitar(int kolStrun){
        this.kolStrun=kolStrun;
    }
    public void setKolStrun(int kolStrun){
        this.kolStrun=kolStrun;
    }
    public String getKolStrun(){
        return "**";
    }
    public void play(){
        System.out.println("Играет гитара с "+kolStrun+" струнами");
    }
}

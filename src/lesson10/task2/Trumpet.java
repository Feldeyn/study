package lesson10.task2;

public class Trumpet implements Instrument {
    private double diametr;
    Trumpet(double diametr){
        this.diametr=diametr;
    }
    double getDiametr(){
        return diametr;
    }
    public void play(){
        System.out.println("Играет труба ее диаметр - "+diametr);
    }
}

package kafedra;

public enum Dolgnost {
    ZAVCAFEDROY(0.3), ZAMESTITELZAVKAF(0.2), SEKRETAR(0.15);
    private double dolgnost;
    Dolgnost(double dolgnost){
        this.dolgnost=dolgnost;
    }
    public double getDolgnost(){
        return dolgnost;
    }
}

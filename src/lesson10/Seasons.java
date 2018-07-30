package lesson10;

public enum Seasons {
    WINTER(-20), SPRING(15), AUTUMN(10){
        public String getDescription(){
            return "И тепло и холодно";
        }
    },SUMMER(25){
        public String getDescription(){
            return "Теплое время года";
        }
    };
    private double temperatura;

    Seasons(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }
    public String getDescription(){
        return "Холодное время года";
    }
}

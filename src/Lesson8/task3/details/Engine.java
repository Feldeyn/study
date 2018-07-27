package lesson8.task3.details;

public class Engine {
    private int power;
    private String produser;

    public Engine(int power, String produser) {
        this.power = power;
        this.produser = produser;
    }

    public void setPower(int pover) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public String getProduser() {
        return produser;
    }
}

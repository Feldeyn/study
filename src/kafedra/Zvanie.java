package kafedra;

public enum Zvanie {
    PROFFESOR(50), DOCENT(35), ASISTENT(20);
    private double zar;

    Zvanie(double zar) {
        this.zar = zar;
    }

    public double getZar() {
        return zar;
    }
}

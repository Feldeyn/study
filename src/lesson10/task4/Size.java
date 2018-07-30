package lesson10.task4;

public enum Size {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), L(38), M(40);
    private int evrosize;

    Size(int evrosize) {
        this.evrosize = evrosize;
    }

    public int getEvrosize() {
        return evrosize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}

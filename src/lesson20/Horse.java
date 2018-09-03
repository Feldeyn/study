package lesson20;

import lesson15.Animal;

public class Horse extends Animal {
    private Halter halter;

    public Horse(Halter halter) {
        this.halter = halter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horse horse = (Horse) o;

        return halter != null ? halter.equals(horse.halter) : horse.halter == null;
    }

    @Override
    public int hashCode() {
        return halter != null ? halter.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "halter=" + halter +
                "} " + super.toString();
    }
}

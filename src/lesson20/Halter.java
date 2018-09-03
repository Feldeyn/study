package lesson20;

import java.io.Serializable;

public class Halter implements Serializable {
private String name;

    public Halter(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Halter halter = (Halter) o;

        return name != null ? name.equals(halter.name) : halter.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

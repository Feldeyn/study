package lesson15;


import java.io.Serializable;

public class TreeGen<T extends Comparable, V extends Animal&Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public TreeGen(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void showTipes() {
        System.out.println("T is" + t.getClass().getName());
        System.out.println("V is" + v.getClass().getName());
        System.out.println("K is" + k.getClass().getName());
    }
}

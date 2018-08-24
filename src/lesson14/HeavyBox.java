package lesson14;

public class HeavyBox extends Box6 implements Comparable<HeavyBox> {
    private int weight; // вес коробки

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int compareTo(HeavyBox anothe) {
        int anotheWeight = anothe.getWeight();
        return this.weight - anotheWeight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                "} " + super.toString();
    }
}

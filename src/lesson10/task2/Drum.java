package lesson10.task2;

public class Drum implements Instrument {
    private int size;

    Drum (int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }
   public void play(){
       System.out.println("Играет барабан его размер - "+size);
   }
}

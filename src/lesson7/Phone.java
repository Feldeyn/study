package lesson7;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String m, String n) {
        model = m;
        number = n;
    }

    Phone() {
    }

    void reciveCall(String name) {
        System.out.println("Звонит" + name);
    }

    void reciveCall(String name, String number) {
        System.out.println("звонит " + name + " номер " + number);
    }
    void sendMessage(String ... numbers ){
        System.out.println("Отправляю сообщения");
        for (String n: numbers){
            System.out.println(n);
        }
    }

    public String getNumber() {
        return number;
    }
    public void  setNumber(String number){
        this.number=number;
    }
    String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


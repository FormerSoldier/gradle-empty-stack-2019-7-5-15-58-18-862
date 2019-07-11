package homework;

public abstract class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;
    }
    public Mobile(){}

    public void call(String message){
        System.out.println("Message ： "+message);
    }
    public abstract void printSpecifiedMsg();
}

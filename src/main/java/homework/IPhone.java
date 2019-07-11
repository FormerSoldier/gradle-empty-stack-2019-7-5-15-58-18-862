package homework;

public class IPhone extends Mobile{
    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }
    public IPhone(){}
    @Override
    public void call(String message){
        if(message.length() > 20)
            System.err.println("<Andriod> Message cannot be sent");
        else
            System.out.println("<iPhone>Message : " + message);
    }

    @Override
    public void printSpecifiedMsg(){
        System.out.println("name: 苹果, color: 白11色, brand: iphone");
    }
}

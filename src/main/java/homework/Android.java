package homework;


public class Android extends Mobile {
    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }
    public Android() { }

    @Override
    public void call(String message) {
        if(message.length() > 10)
            System.err.println("<Andriod> Message cannot be sent");
        else
            System.out.println("<Andriod>Message : " + message);
    }


    @Override
    public void printSpecifiedMsg(){
        System.out.println("name: 安卓, color: 白12222221色, brand: android");
    }
}


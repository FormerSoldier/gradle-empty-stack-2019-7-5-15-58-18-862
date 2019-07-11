package homework;


public class IPhoneRobot {
    // method 1
    public void phoneCall(IPhone iphone, String msg){
        iphone.call(msg);
    }
    // method 2
    public void phoneCall2(Mobile mobile,String msg){
        if(mobile.getClass() == IPhone.class)
            mobile.call(msg);
        else
            System.err.println("I can not support other mobiles");
    }
}

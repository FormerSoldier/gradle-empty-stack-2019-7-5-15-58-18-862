package homework;

import java.util.zip.Adler32;

public class Main {
    public static void main(String[]args){

        Mobile android = new Android();
        android.call("I'm android");

        Person person = new Person();
        //<Andriod>Message : send to android
        person.setMobile(new Android());
        person.phoneCall("send to android");
        //<iPhone>Message : send to iphone
        person.setMobile(new IPhone());
        person.phoneCall("send to iphone");
        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        //<iPhone>Message : send to IPhone
        iPhoneRobot.phoneCall2(new IPhone(),"send to IPhone");
        //I can not support other mobiles
        iPhoneRobot.phoneCall2(new Android(),"send to android");

        Mobile mobile = null;
        mobile = new IPhone();
        mobile.call("send send send send send send");

        mobile = new Android();
        mobile.call("send send send send send send");

        mobile = new IPhone("苹果","白色","iphone");
        mobile.printSpecifiedMsg();

        mobile = new Android("安卓","黑色","android");
        mobile.printSpecifiedMsg();
    }
}

package com.FactoryDesign;

import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryDesign {
    public static void main(String[] args)
    {

        //Here, we are providing the implementation itself. In future if you change OS from Android to IOS, or to windows,
        // You have to change the code and recompile it, which means client knows which classes you are working with as we are
        // exposing required OS here, We eliminate this with Factory Design pattern.
        //OS obj= new Android(); // Without Factory pattern

        // With Factory pattern
        //Factory is nothing but which provides/manufactures object
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open"); // or OS obj = osf.getInstance("Closed");
        //Even if we have extra OS in future and we want to implement it, we dont change the client code(com.FactoryDesign.FactoryDesign)
        //We change only the Factory
        obj.spec();
    }
}

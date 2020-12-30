package com.BuilderDesign;

import com.BuilderDesign.Phone;

public class shop {
    public static void main(String[] args)
    {

        //We must and should provide the values even though we are not considering that parameter,
        //Here, i dont want to pass this value, and i dont want to go into that complexity
        //Hence we use builder pattern to overcome this
//        Phone p = new Phone("Android", 2, "Qualcomm", 5.5, 3100);
//
//        System.out.println(p);

        Phone p = new PhoneBuilder().setOs("Android").setRam(2).setBattery(3000).getPhone();

        System.out.println(p);
    }
}

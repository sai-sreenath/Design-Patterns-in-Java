package com.Singleton;

public class Singleton {
    public static void main(String[] args) {
        //cannot create object like this as the constructor is private
        //A obj = new A();

        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();

        //Everytime same instance is created with getInstance() method, hence Singleton class

    }
}

class Abc
{
    private static Abc obj;
    private Abc()
    {

    }

    //Instance is created inside Instance property method, Here instantiation is not performed until an object asks for an
    // instance, the approach is known as Lazy Instantiation.
    //Not thread safe, If separate threads of execution enter Instance property method at same time, more instances maybe created.
    public static Abc getInstance()
    {
        if(obj==null)
            obj=new Abc();
        return obj;
    }
}

//Thread safe implementation as only created instance is called
class Xyz
{
    private static Xyz obj = new Xyz();
    private Xyz()
    {

    }
    public static Xyz getInstance()
    {
        return obj;
    }
}


package com.ObserverDesign;

public class Youtube {
    public static void main(String[] args)
    {
        Channel sreenath = new Channel();

        Subscriber s1 = new Subscriber("Prabath");
        Subscriber s2 = new Subscriber("sreenath");
        Subscriber s3 = new Subscriber("Teja");
        Subscriber s4 = new Subscriber("Srikanth");
        Subscriber s5 = new Subscriber("Karthik");

        sreenath.subscribe(s1);
        sreenath.subscribe(s2);
        sreenath.subscribe(s3);
        sreenath.subscribe(s4);
        sreenath.subscribe(s5);

        sreenath.unSubscribe(s3);

        s1.subscribeChannel(sreenath);
        s2.subscribeChannel(sreenath);
        s3.subscribeChannel(sreenath);
        s4.subscribeChannel(sreenath);
        s5.subscribeChannel(sreenath);

        sreenath.upload("How to learn Programming??");
    }
}

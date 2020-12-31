package com.PrototypeDesign;

//The only we can use clone() method is
//Cloneable is marker interface which doesnt have any method in it
//Giving a permission so that object can be cloned
public class Book implements Cloneable{
    private int bid;
    private String bname;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }
}

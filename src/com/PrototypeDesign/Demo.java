package com.PrototypeDesign;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Novelty");
        bs.loadData();
        bs.getBooks().remove(2);
        System.out.println(bs);


        //BookShop bs1 = new BookShop();
        //bs1.setShopName("A1");
        //System.out.println(bs1);
        //Here, A1 doesn't have a book, so again we have to load the book like bs1.loadData()
        //This will take more time to get the data from the database or file
        //Instead of fetching the data from the database, what if we can ask data from bs directly
        // We can do with BookShop bs1= bs.clone() i.e, clone copies data from old object to new object(shallow cloning)
        //Unfortunately we have 2 clonings shallow cloning and deep cloning

        //shallow copy: doesnt create new Object, just 2 references to same location
//        BookShop bs1 = (BookShop) bs.clone();
//        bs1.setShopName("A1");
//        bs1.loadData();
//        System.out.println(bs1);

        //In deep cloning, we have 2 different objects and 2 different data. So always better to perform deep cloning\
        BookShop bs1=bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("A1");

        System.out.println(bs);
        System.out.println(bs1);
    }
}

package com.PrototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData()
    {
        for(int i=1;i<=10;i++)
        {
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book: " + i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    //Normal cloning : shallow cloning
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    @Override
    protected BookShop clone() throws CloneNotSupportedException {

        //creating loop and fetching data from old object and assigning each row to new object
        //which is way faster than getting from database


        BookShop shop = new BookShop();

        for(Book b: this.getBooks())
        {
            shop.getBooks().add(b);
        }

        return shop;
    }

}

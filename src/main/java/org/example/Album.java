package org.example;

public class Album extends Book {

    @Override
    public void bookIntro() {
        System.out.println("This album has " + getNop() + " pages, It's title is " + getTitle() + " and its paper quality is " + getPq() + ".");
    }


}

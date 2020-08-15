package org.example;

public class Novel extends Book {

    @Override
    public void bookIntro() {
        System.out.println("The title of novel is " + getTitle() + ", it has " + getNop() + " pages and the type is " + getType() + ".");
    }

}

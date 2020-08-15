package org.example;

import java.util.Scanner;

public class Book {
    Scanner addBookTitle = new Scanner(System.in);
    Scanner bookNovel = new Scanner(System.in);
    Scanner bookAlbum = new Scanner(System.in);
    Scanner numberOfPage = new Scanner(System.in);
    Scanner addBook = new Scanner(System.in);
    public Integer nop; //number of pages
    public String title;
    public String type;
    public String Pq; //paper quality

    public void setNop(Integer nop) {
        this.nop = nop;
    }

    public String getTitle() {
       return title;
    }

    public int getNop() {
        return nop;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public  String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPq() {
        return Pq;
    }

    public void setPq(String Pq) {
        this.Pq = Pq;
    }

    public void bookIntro() {
        System.out.println("The " + title + " has " + nop + " pages.");
    }

        @Override
        public String toString() {
            if(type == null) {
            return "Album{" +
                    "nop=" + nop +
                    ", title='" + title + '\'' +
                    ", Pq='" + Pq + '\'' +
                    '}';
            } else return
                "Novel{" +
                "nop=" + nop +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
        }

        public void addBookToLib(){

            System.out.println("Enter title of book you wish to add:");
            setTitle(addBookTitle.nextLine());
            System.out.println("If it is a Novel please specify the type of it, otherwise just hit enter:");
            setType(bookNovel.nextLine());
            System.out.println("If it is an Album please specify the paper quality of it,  otherwise just hit enter:");
            setPq(bookAlbum.nextLine());
            System.out.println("Specify number of pages of the book you wish to add:");
            setNop(numberOfPage.nextInt());
    }
}








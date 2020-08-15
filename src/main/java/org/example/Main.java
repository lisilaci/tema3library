package org.example;

import java.util.ArrayList;

public class Main {

    public static void main( String[] args ) {

        Book book1 = new Novel();
        book1.setTitle("\"The Great Gatsby\"");
        book1.setNop(218);
        book1.setType("Tragedy");

        Book book2 = new Novel();
        book2.setTitle("\"Don Quixote\"");
        book2.setNop(863);
        book2.setType("Mystery");

        Book book3 = new Album();
        book3.setTitle("\"A Splash of Color\"");
        book3.setNop(132);
        book3.setPq("Good");

        Book book4 = new Album();
        book4.setTitle("\"Artist in Training\"");
        book4.setNop(233);
        book4.setPq("Excellent");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        book1.bookIntro();
        book2.bookIntro();
        book3.bookIntro();
        book4.bookIntro();
        System.out.println("------------------------------------------------");
        System.out.println(books);

        books.remove(2);
        books.add(book3);

        System.out.println("------------------------------------------------");
        System.out.println(books.get(0));
        System.out.println(books.get(1));
        System.out.println(books.get(2));
        System.out.println(books.get(3));
        System.out.println("------------------------------------------------");


//
//        Book book5 = new Book();
//        book5.addBookToLib();

//        System.out.println("Choose from Novel and Album the Book type you wish to add by entering Novel or Album:");
//        book5.addBook.nextLine();
//        if(book5.addBook.nextLine().equals("Novel")){
//            System.out.println("Enter title of book you wish to add:");
//            book5.setTitle(book5.addBookTitle.nextLine());
//            System.out.println("Please specify the type of it:");
//            book5.setType(book5.bookNovel.nextLine());
//            System.out.println("Specify number of pages of the book you wish to add:");
//            book5.setNop(book5.numberOfPage.nextInt());
//
//        } else if (book5.addBook.nextLine().equals("Album")){
//            System.out.println("Enter title of book you wish to add:");
//            book5.setTitle(book5.addBookTitle.nextLine());
//            System.out.println("Please specify the paper quality of it:");
//            book5.setPq(book5.bookAlbum.nextLine());
//            System.out.println("Specify number of pages of the book you wish to add:");
//            book5.setNop(book5.numberOfPage.nextInt());
//        }
//

//        books.add(0, book5);
        System.out.println(books);





    }
}





//
//        if(book5.addBook.nextLine().equals("Novel")){
//            System.out.println("Enter title of book you wish to add:");
//            book5.setTitle(book5.addBook.nextLine());
//            System.out.println("Please specify the type of it:");
//            book5.setType(book5.addBook.nextLine());
//            System.out.println("Specify number of pages of the book you wish to add:");
//            book5.setNop(book5.addBook.nextInt());
//
//        } else if (book5.addBook.nextLine().equals("Album")){
//            System.out.println("Enter title of book you wish to add:");
//            book5.setTitle(book5.addBook.nextLine());
//            System.out.println("Please specify the paper quality of it:");
//            book5.setPq(book5.addBook.nextLine());
//            System.out.println("Specify number of pages of the book you wish to add:");
//            book5.setNop(book5.addBook.nextInt());
//        } else return false;



//
//        System.out.println("Enter title of book you wish to add:");
//        book5.setTitle(book5.addBook.nextLine());
//        System.out.println("If it is a Novel please specify the type of it, otherwise just hit enter:");
//        book5.setType(book5.addBook.nextLine());
////        System.out.println("If it is an Album please specify the paper quality of it,  otherwise just hit enter:");
////        book5.setPq(book5.addBook.nextLine());
//        System.out.println("Specify number of pages of the book you wish to add:");
//        book5.setNop(book5.addBook.nextInt());
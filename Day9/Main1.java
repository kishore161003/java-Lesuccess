import java.util.Scanner;

class Book {
    String title;
    String author;
    int price;

    void disp() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class MyBook extends Book {

    MyBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class Main1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String title = sc.next();
        String author = sc.next();
        int price = sc.nextInt();
        MyBook myBook = new MyBook(title, author, price);
        myBook.disp();
    }
}
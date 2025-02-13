import java.util.*;

class Borrower{
    String name;
    ArrayList<Book> borrowedBooks = new ArrayList<Book>();
    
    public Borrower(String name){
        this.name = name;
    }

    public void displayBorrowedBooks(){
        System.out.println(name + "'s Borrowed Books:");
        for(Book book : borrowedBooks){
            System.out.println("Title: " + book.title);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Author: " + book.author.name);
            System.out.println("Biography: " + book.author.desc);
            System.out.println("------------------------");
        }
    }
}


package com.company.Bookshelf;

import com.company.Book.Book;
import com.company.Book.Novel;
import com.company.Book.SchoolBook;

public class Bookshelf {

    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();
        Book[] books = shelf.putBook(args);

        printArray(books);
    }
    public static void bookWrite(Book book){
        System.out.println(book);
    }
    public static void printArray(Book[] books){
        for (int i = 0; i < books.length; i++){
            bookWrite(books[i]);
        }
    }

    public Book[] putBook(String[] args){
        int length = 0;
        int counter = 0;
        for (int i = 0; i < args.length; i++){
            if (args[i].equals("regény")){
                length++;
            } else if (args[i].equals("tankönyv")){
                length++;
            }
        }
        Book[] books = new Book[length];
        for (int i = 0; i < args.length; i++){
            if (args[i].equals("regény")){
                Novel novel = new Novel(args[i + 1], args[i + 2], args[i + 3], Integer.parseInt(args[i + 4]));
                books[counter] = novel;
                counter++;
                i += 4;
            } else if (args[i].equals("tankönyv")){
                SchoolBook schoolBook = new SchoolBook(args[i + 1], args[i + 2], args[i + 3], Integer.parseInt(args[i + 4]), args[i + 5]);
                books[counter] = schoolBook;
                counter++;
                i += 5;
            }
        }
        return books;
    }
}

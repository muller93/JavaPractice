
package com.company.Bookshelf;

import com.company.Book.Book;

public class Bookshelf {

    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();
        Book[] books = shelf.getBook(args);

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

    public Book[] getBook(String[] args){
        Book[] books = new Book[args.length / 4];
        int counter = 0;
        for (int i = 0; i < args.length; i += 4){
            Book firstBook = new Book(args[i], args[i + 1], args[i + 2], Integer.parseInt(args[i + 3]));
            books[counter] = firstBook;
            counter++;
        }
        return books;
    }

    public void putBook(){

    }
}
/*Hozz létre egy Konyvespolc osztályt mely a konyvespolc csomagban található!
 Legyen a Konyvespolc osztálynak egy Konyv tömbje, ami képes a könyveket eltárolni.
 Ezenkívül tartalmazzon egy polcraTesz() metódust, amely egy könyvet a tömbbe teszi.
 Tedd a Konyvespolc osztályt futtathatóvá: a főprogram a parancssori paraméterek alapján hozzon
  létre tankonyv és regeny objektumokat, amelyeket helyezz a polcra! Írasd ki a konyvespolcon lévő
   konyv objektumokat a standard outputra! A program futása végén írasd ki a létrehozott regeny objektumok számát!
Példa bemenet: java Regeny Egri_csillagok,Gárdonyi_Géza,Móra,1901 Tankonyv Kalkulus1,Toth_Istvan,Tankönyv_kiadó,1997*/
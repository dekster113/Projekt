package data;
import app.Book;
import utils.DataReader;
class Library {
    public static void main(String[] args) {

        final String appName = "Biblioteka v0.5";
        DataReader dataReader = new DataReader();

        Book[] books = new Book[1000];

        System.out.print(appName);
        System.out.println("\nSystem może przechowywać "+books.length+" książek.");
        System.out.println("\nWprowadź nową książkę:");
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        books[0].DrukowanieInformacji();
        books[1].DrukowanieInformacji();

    }
}
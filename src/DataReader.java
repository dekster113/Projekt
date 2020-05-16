package utils;
import app.Book;
import java.util.Scanner;

public class DataReader {

    private Scanner sc;

    public DataReader()
    {
        sc = new Scanner(System.in);
    }

    public void close()
    {
        sc.close();
    }

    public Book readAndCreateBook() {
        System.out.println("\nTytuł: ");
        String Tytul = sc.nextLine();
        System.out.println("Autor: ");
        String Autor = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String Wydawca = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("DataWydania: ");
        int DataWydania = sc.nextInt();
        sc.nextLine();
        System.out.println("Ilosc stron: ");
        int Strony = sc.nextInt();
        sc.nextLine();

        return new Book(Tytul, Autor, DataWydania, Strony, Wydawca, isbn);

    }

}

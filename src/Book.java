public class Book {

    String Tytul;
    String Autor;
    int DataWydania;
    int Strony;
    String Wydawca;
    String isbn;

    public Book(String Tytul, String Autor, int DataWydania, int Strony, String Wydawca, String isbn) {

    this.Tytul=Tytul;
    this.Autor=Autor;
    this.DataWydania=DataWydania;
    this.Strony=Strony;
    this.Wydawca=Wydawca;
    this.isbn=isbn;
}
    void DrukowanieInformacji ()
    {
        String info = Tytul+"; "+Autor+"; "+DataWydania+"; "+Strony+"; "+Wydawca+"; "+isbn;
        System.out.println(info);
    }

}

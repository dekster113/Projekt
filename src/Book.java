package data;

public class Book {
// Pola

    private String Tytul;
    private String Autor;
    private int DataWydania;
    private int Strony;
    private String Wydawca;
    private String isbn;

    // Konstruktory
    public Book(String Tytul, String Autor, int DataWydania, int Strony, String Wydawca, String isbn) {

        this.Tytul=Tytul;
        this.Autor=Autor;
        this.DataWydania=DataWydania;
        this.Strony=Strony;
        this.Wydawca=Wydawca;
        this.isbn=isbn;
}
     Book(Book book)
    {
        this(book.Tytul, book.Autor, book.DataWydania, book.Strony, book.Wydawca, book.isbn);
    }
// set i get

    public String getTytul() {
        return Tytul;
    }

    public void setTytul(String Tytul) {
        this.Tytul = Tytul;
    }

    public String getAutor(){
      return Autor;
    }

    public void setAutor (String Autor){
        this.Autor = Autor;
    }

    public int getDataWydania(){
        return DataWydania;
    }

    public void setDataWydania (int DataWydania){
        this.DataWydania = DataWydania;
    }

    public int getStrony(){
        return Strony;
    }

    public void setStrony (int Strony){
        this.Strony=Strony;
    }

    public String getWydawca(){
        return Wydawca;
    }

    public void setWydawca(String Wydawca){
        this.Wydawca=Wydawca;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }



    public void DrukowanieInformacji ()
    {
        String info = Tytul+"; "+Autor+"; "+DataWydania+"; "+Strony+"; "+Wydawca+"; "+isbn;
        System.out.println(info);
    }

}

 class Library {
    public static void main(String[] args) {

        final String appName = "Biblioteka v0.3";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296,
                "Greg", "9788373271890");
        Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009,
                352, "Helion", "9788324620845");
        Book book3 = new Book("Potop",
                "Henryk Sienkiewicz", 2015, 936, "Greg",
                "9780071559825");

        System.out.print(appName);
        System.out.println("\nKsiążki dostępne w bibliotece:\n");
        book1.DrukowanieInformacji();
        book2.DrukowanieInformacji();
        book3.DrukowanieInformacji();

    }
}
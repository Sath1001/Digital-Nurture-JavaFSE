public class LibraryTest {

    public static void main(String[] args) {

        LibrarySearch library = new LibrarySearch();

        library.addBook(new Book(101, "Java Programming", "James Gosling"));
        library.addBook(new Book(102, "Data Structures", "Mark Allen"));
        library.addBook(new Book(103, "Operating Systems", "Galvin"));

        System.out.println("Searching Book");

        library.linearSearch("Data Structures");

    }

}
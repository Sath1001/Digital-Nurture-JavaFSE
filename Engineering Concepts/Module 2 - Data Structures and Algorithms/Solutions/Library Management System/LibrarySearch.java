import java.util.ArrayList;

public class LibrarySearch {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void linearSearch(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                return;
            }

        }

        System.out.println("Book Not Found");

    }

}
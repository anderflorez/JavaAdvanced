import java.util.List;
import java.util.Map;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		
		System.out.println("\nPrinting the list of books");
		List<Book> foundBooks = bc.findBooks(book -> book.getTitle().toLowerCase().contains("men"));
		for (Book nextBook : foundBooks) {
			System.out.println (nextBook.getTitle() + " by " + nextBook.getAuthor());
		}
		
		//New version of printing the list of books in just one line
		System.out.println("\nNew version of printing the list of books in just one line");
		bc.findBooks(book -> book.getTitle().toLowerCase().contains("men")).forEach(System.out::println);
		
		System.out.println("\nPrinting the map of books");
		Map<Integer, String> foundMapBooks = bc.findMapBooks(book -> book.getTitle().toLowerCase().contains("the"));
		foundMapBooks.forEach((k, v) -> System.out.println(v));
		
		// Another version with just one line of code
		System.out.println("\nAnother version with just one line of code");
		bc.findMapBooks(book -> book.getTitle().toLowerCase().contains("the")).forEach((k, v) -> System.out.println(v));
		
		// Number of books that match the search criteria
		System.out.println("\nNumber of books that match the search criteria");
		System.out.println(bc.findNumberOfBooks(book -> book.getTitle().toLowerCase().contains("the")));
		
		// Number of books that match the search criteria
		System.out.println("\nNumber of books that match the search criteria");
		System.out.println(bc.findNumberOfBooks(book -> book.getAuthor().toLowerCase().startsWith("d")));
		
	}
}

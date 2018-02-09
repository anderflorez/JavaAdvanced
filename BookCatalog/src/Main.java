import java.util.List;
import java.util.Map;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		List<Book> foundBooks = bc.findBooks(book -> book.getTitle().toLowerCase().contains("men"));
	
		for (Book nextBook : foundBooks) {
			System.out.println (nextBook.getTitle() + " by " + nextBook.getAuthor());
		}
		
		Map<Integer, String> foundMapBooks = bc.findMapBooks(book -> book.getTitle().toLowerCase().contains("the"));
		foundMapBooks.forEach((k, v) -> System.out.println(v));
	}
}

package sortingObjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		String test1 = "c";
		String test2 = "b";
		System.out.println(test1.compareTo(test2));
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1,"The Lord of the Rings","J. R. R. Tolkien"));
		books.add(new Book(2,"Le Petit Prince","Antoine de Saint-Exupery"));
		books.add(new Book(3,"Harry Potter and the Philosopher's Stone","J. K. Rowling"));
		books.add(new Book(4,"And Then There Were None","Agatha Christie"));
		books.add(new Book(5,"Dream of the Red Chamber","Cao Xueqin"));
		books.add(new Book(6,"The Hobbit","J. R. R. Tolkien"));
		books.add(new Book(7,"She: A History of Adventure","H. Rider Haggard"));
		books.add(new Book(8,"The Lion, the Witch and the Wardrobe","C. S. Lewis"));
		books.add(new Book(9,"The Da Vinci Code","Dan Brown"));
		books.add(new Book(10,"The Catcher in the Rye","J. D. Salinger"));
		books.add(new Book(11,"The Hobbit","A. A. Milne"));
		
		// There are several ways to sort a List using the Collections class and its method sort which receives two
		// parameters: a list and an instance of the comparator interface
		
		// First approach: sorts using comparable class which implements comparator and is used as the default second parameter 
		// in the example, the Book class implements the comparable class and overrides its method compareTo
		// The method compareTo tells java which object should go first
		Collections.sort(books);
		
		// Second approach: declare a Class which implements the comparator class and it overrides the method compare 
		// which is the method that determines the order of the objects. 
		// The example defines the class ReverseTitleComparator.
		Collections.sort(books, new ReverseTitleComparator());
		
		// Third approach: exactly like second approach but defines the class (ReverseTitleComparator in the example) 
		// within the list object class, making it a nested static class
		Collections.sort(books, new Book.ReverseTitleComparator());
		
		// Fourth approach: Using an anonymous inner class
		Collections.sort(books, new Comparator<Book>() {
			
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getId() - o2.getId();
			}
		});

		for (Book nextBook : books) {
			System.out.println(nextBook);
		}
		System.out.println();
		System.out.println();
		
		
		// HashMaps
		
		Map<Book, Integer> book = new HashMap<Book, Integer>();
		book.put(new Book(1,"The Lord of the Rings","J. R. R. Tolkien"), 7);
		book.put(new Book(2,"Le Petit Prince","Antoine de Saint-Exupery"), 16);
		book.put(new Book(3,"Harry Potter and the Philosopher's Stone","J. K. Rowling"), 22);
		book.put(new Book(4,"And Then There Were None","Agatha Christie"), 9);
		book.put(new Book(5,"Dream of the Red Chamber","Cao Xueqin"), 1);
		book.put(new Book(6,"The Hobbit","J. R. R. Tolkien"), 5);
		book.put(new Book(7,"She: A History of Adventure","H. Rider Haggard"), 31);
		book.put(new Book(8,"The Lion, the Witch and the Wardrobe","C. S. Lewis"), 16);
		book.put(new Book(9,"The Da Vinci Code","Dan Brown"), 22);
		book.put(new Book(10,"The Catcher in the Rye","J. D. Salinger"), 19);
		book.put(new Book(11,"The Hobbit","A. A. Milne"), 4);
		
		Integer result = book.get(new Book(6,"The Hobbit","J. R. R. Tolkien"));
		System.out.println(result);
	}

	

	

}

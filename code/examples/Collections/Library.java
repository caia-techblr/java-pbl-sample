import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class TitleComparator implements Comparator<Book> {
	@Override
	public int compare(Book r1, Book r2) {
		return 0; // TODO: compare titles : 0, -1, +1
	}
}

class PriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}
}

public class Library {
	List<Book> books;

	Library() {
		books = new ArrayList<>();
	}

	boolean addBook(int id, String title, String author, double price, int nPages) {
		books.add(new Book(id, title, author, price, nPages)); // Composition
		return true;
	}

	void addBook(Book rb) { // Kind of Aggregation
		books.add(rb);
	}

	void displayAll() {
		Iterator<Book> iter = books.iterator();
		Book ref;
		while (iter.hasNext()) {
			ref = iter.next();
			ref.display();
		}
		//books.forEach( (ref)-> { ref.display(); }  );
		//Consumer<Book> action = (ref) -> { ref.display(); };
		//books.forEach(action);
	}

	boolean removeBookById(int id) {
		// Hint:- temp object, equals method/iterator remove
		Iterator<Book> iter = books.iterator();
		while (iter.hasNext()) {
			Book ref = iter.next();
			if (id == ref.getId()) {
				iter.remove();
				return true;
			}
		}
		return false;
		/**
		 * books.remove(new Object(id,"","",0,0)); Book class should override equals
		 */
	}

	Book findBookById(int id) {
		// iterator based for loop, for-each loop
		// indexOf
		return null;
	}

	Book findBookByTitle(String pattern) { // sub string match
		// assume single match or return first instnace
		return null;
	}

	double avgPriceofBook() { // min, max
		final int sum=0;
		return sum/books.size();
	}

	double minimumPriceofBooks() { // min, max
		Book ref = Collections.min(books, new PriceComparator());
		return ref.getPrice();
	}

	double maximumPriceofBooks() { // min, max
		Book ref = Collections.max(books, new PriceComparator());
		return ref.getPrice();
	}

	void sortBooksByTitle() {
		//books.sort(new TitleComparator());
		//books.sort(Collections.reverseOrder();)
		Collections.sort(books,new TitleComparator());		
	}
	List<Book> findBooksByAuthor(String author) {
		List<Book> results=new ArrayList<>();
		//add the matching books to results
		return results;		
	}
	
}

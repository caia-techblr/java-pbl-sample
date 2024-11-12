import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTest {
	Library library;

	@BeforeEach
	void initEach() {
		library.addBook(new Book(101, "C++", "Schildt", 500, 350));
		library.addBook(new Book(103, "Java", "Schildt", 600, 280));
		library.addBook(new Book(102, "Linux", "Das", 700, 300));
		library.addBook(new Book(105, "Python", "Larry", 400, 250));
		library.addBook(new Book(104, "Nodejs", "Das", 650, 450));
	}

	@Test
	void testFindById() {
		Book r1 = library.findBookById(102);
		Assertions.assertNotNull(r1);
		// some more assertions to check object state

		Book r2 = library.findBookById(108);
		Assertions.assertNull(r2);
	}

	void testRemoveById() {

	}
}

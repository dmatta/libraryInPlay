package playlibrary.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import playlibrary.model.Book;
import playlibrary.model.Catalog;

public class BookDaoTest extends BaseTest {

	@Autowired
	private BookDao bookDao;
	
	@Test
	public void testGetAlLBooks() {
		List<Book> books = bookDao.getAllBooks();
		assertNotNull(books);
	}
	
	@Test
	public void getAllBooksByCatalog() {
		List<Catalog> catalogs = bookDao.getAllBooksByCatalog();
		assertNotNull(catalogs);
	}
	
	@Test
	public void findBookByIsbn() {
		Book book = bookDao.findBookByIsbnk("test-isbn");
		assertNotNull(book);
		assertEquals(book.title, "Test Title");
	}
	
	
}

package playlibrary.dao;

import java.util.List;

import playlibrary.model.Book;
import playlibrary.model.Catalog;

public interface BookDao {

	public List<Book> getAllBooks();
	public List<Catalog> getAllBooksByCatalog();
	public Book findBookByIsbnk(String isbn);
}

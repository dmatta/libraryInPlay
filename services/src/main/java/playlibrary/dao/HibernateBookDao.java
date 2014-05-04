package playlibrary.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import playlibrary.model.Book;
import playlibrary.model.Catalog;

public class HibernateBookDao extends BaseHibernateDao implements BookDao {

	@Override
	public List<Book> getAllBooks() {
		return (List<Book>) getSession().createCriteria(Book.class).list();
	}

	@Override
	public List<Catalog> getAllBooksByCatalog() {
		return (List<Catalog>) getSession().createCriteria(Catalog.class).list();
	}

	@Override
	public Book findBookByIsbnk(String isbn) {
		Book book = null;
		Criteria criteria = getSession().createCriteria(Book.class);
		criteria.add(Restrictions.eq("isbn", isbn));
		List<Book> bookList = (List<Book>)criteria.list();
		if(bookList != null && bookList.size() > 0) {
			book = bookList.get(0);
		}
		return book;
	}

}

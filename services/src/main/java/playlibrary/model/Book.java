package playlibrary.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Book {

	@Id @GeneratedValue
	public Long id;
	public String isbn;
	
	public String title;
	public Date publicationDate;
	
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="book_by_catalog", 
                joinColumns={@JoinColumn(name="catalog_id")}, 
                inverseJoinColumns={@JoinColumn(name="book_id")})
    public Set<Catalog> catalogs = new HashSet<Catalog>();

    
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="book_by_author", 
                joinColumns={@JoinColumn(name="author_id")}, 
                inverseJoinColumns={@JoinColumn(name="book_id")})
    public Set<Author> authors = new HashSet<Author>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Set<Catalog> getCatalogs() {
		return catalogs;
	}

	public void setCatalogs(Set<Catalog> catalogs) {
		this.catalogs = catalogs;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
}

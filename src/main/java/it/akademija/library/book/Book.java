package it.akademija.library.book;

import it.akademija.library.bookCategory.BookCategory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String summary;
    private String ISBN;
    private Integer pageCount;

    private Integer quantity;

    public Book() {
    }

    public Book(String title, String summary, String ISBN, Integer pageCount, Integer quantity) {
        this.title = title;
        this.summary = summary;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
        this.quantity = quantity;
    }

    public Book(Long id, String title, String summary, String ISBN, Integer pageCount, Integer quantity) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

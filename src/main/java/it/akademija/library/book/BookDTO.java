package it.akademija.library.book;

import it.akademija.library.bookCategory.BookCategory;

public class BookDTO {

    private Long id;
    private String title;
    private String summary;
    private String ISBN;
    private Integer pageCount;
    private BookCategory bookCategory;
    private Integer quantity;

    public BookDTO() {
    }

    public BookDTO(String title, String summary, String ISBN, Integer pageCount, BookCategory bookCategory, Integer quantity) {
        this.title = title;
        this.summary = summary;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
        this.bookCategory = bookCategory;
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

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

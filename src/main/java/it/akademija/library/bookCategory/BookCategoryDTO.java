package it.akademija.library.bookCategory;

import it.akademija.library.book.BookDTO;

import java.util.List;

public class BookCategoryDTO {

    private Long id;
    private String category;

    private List<BookDTO> bookDTOList;
    public BookCategoryDTO(String category) {
        this.category = category;
    }

    public BookCategoryDTO(Long id, String category) {
        this.id = id;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

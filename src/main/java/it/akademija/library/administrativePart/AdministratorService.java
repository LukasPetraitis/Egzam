package it.akademija.library.administrativePart;

import it.akademija.library.book.Book;
import it.akademija.library.book.BookDAO;
import it.akademija.library.book.BookDTO;
import it.akademija.library.bookCategory.BookCategory;
import it.akademija.library.bookCategory.BookCategoryDAO;
import it.akademija.library.bookCategory.BookCategoryDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdministratorService {

    @Autowired
    private BookCategoryDAO bookCategoryDAO;

    @Autowired
    private BookDAO bookDAO;

    public void saveBookCategory(BookCategoryDTO bookCategoryDTO) {

        BookCategory bookCategory = new BookCategory();

        bookCategory.setCategory(bookCategoryDTO.getCategory());

        bookCategoryDAO.save(bookCategory);
    }

    public void updateBookCategory(BookCategoryDTO bookCategoryDTO, Long id) {
        boolean isExist = bookCategoryDAO.existsById(id);
        if (isExist){
            BookCategory bookCategory = bookCategoryDAO.getReferenceById(id);
            bookCategory.setCategory(bookCategoryDTO.getCategory());
            bookCategoryDAO.save(bookCategory);
        }
    }

    public void deleteBookCategory(Long id) {
        boolean isExist = bookCategoryDAO.existsById(id);
            bookCategoryDAO.deleteById(id);
    }

    public void saveBook(BookDTO bookDTO) {
        Book book = new Book();
        BeanUtils.copyProperties(book, bookDTO);
        bookDAO.save(book);
    }

    public void updateBook(BookDTO bookDTO, Long id) {
        boolean isExist =  bookDAO.existsById(id);
        if (isExist){
            Book book = new Book();
            BeanUtils.copyProperties(book, bookDTO);
            bookDAO.save(book);
        }
    }

    public void deleteBook(Long id) {
        boolean isExist = bookCategoryDAO.existsById(id);
        bookCategoryDAO.deleteById(id);
    }
}

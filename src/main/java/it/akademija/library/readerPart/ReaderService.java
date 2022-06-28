package it.akademija.library.readerPart;

import it.akademija.library.book.Book;
import it.akademija.library.book.BookDAO;
import it.akademija.library.model.User;
import it.akademija.library.user.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderService {

    @Autowired
    BookDAO bookDAO;

    @Autowired
    UserDAO userDAO;

    public void reserveBook(Long userId, Long id) {
        User user = userDAO.getReferenceById(userId);
        Book book = bookDAO.getReferenceById(id);
        if(book.getQuantity() - 1 != -1){
            user.getReservedBooks().add(book);
        }
    }

    public void addToFavorite(Long userId, Long id) {
        User user = userDAO.getReferenceById(userId);
        Book book = bookDAO.getReferenceById(id);
        if(book.getQuantity() - 1 != -1){
            user.getFavoriteBooks().add(book);
        }
    }
}

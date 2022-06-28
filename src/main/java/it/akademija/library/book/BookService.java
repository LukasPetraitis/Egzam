package it.akademija.library.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public List<Book> findAll() {
        return Arrays.asList(new Book(5L ,
                "Head First Java",
                "Book about Java",
                "123456789",
                500,
                5));
    }
}

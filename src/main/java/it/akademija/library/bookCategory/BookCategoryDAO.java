package it.akademija.library.bookCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategoryDAO extends JpaRepository<BookCategory, Long> {
}

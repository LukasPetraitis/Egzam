package it.akademija.library.administrativePart;

import it.akademija.library.book.BookDTO;
import it.akademija.library.bookCategory.BookCategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdministratorController {

    @Autowired
    AdministratorService administratorService;

    @PostMapping("/category/new")
    public void createBookCategory(@RequestBody BookCategoryDTO bookCategoryDTO) {
        if(bookCategoryDTO.getCategory() != null){
            administratorService.saveBookCategory(bookCategoryDTO);
        }
    }

    @PutMapping("/category/{id}")
    public void updateBookCategory(@RequestBody BookCategoryDTO bookCategoryDTO, @PathVariable Long id) {
        if(bookCategoryDTO.getCategory() != null && bookCategoryDTO.getId() != null){
            administratorService.updateBookCategory(bookCategoryDTO, id);
        }
    }

    @DeleteMapping("/category/delete/{id}")
    public void deleteBookCategory(@PathVariable Long id) {
            administratorService.deleteBookCategory(id);
    }

    @PostMapping("/book/new")
    public void createBook(@RequestBody BookDTO bookDTO) {
        if(bookDTO != null){
            administratorService.saveBook(bookDTO);
        }
    }

    @PutMapping("/book/{id}")
    public void updateBook(@RequestBody BookDTO bookDTO, @PathVariable Long id) {
        if(bookDTO != null){
            administratorService.updateBook(bookDTO, id);
        }
    }

    @DeleteMapping("/book/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        administratorService.deleteBook(id);
    }

}

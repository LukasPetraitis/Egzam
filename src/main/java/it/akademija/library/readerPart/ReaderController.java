package it.akademija.library.readerPart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReaderController {

    @Autowired
    ReaderService readerService;

    @PutMapping("/user/{userId}/reserve/{id}")
    public void reserveBook(@PathVariable Long userId, @PathVariable Long id) {
        if(id != null){
            readerService.reserveBook(userId, id);
        }
    }
    @PutMapping("/user/{userId}/favorite/{id}")
    public void addToFavorite(@PathVariable Long userId, @PathVariable Long id) {
        if(id != null){
            readerService.addToFavorite(userId, id);
        }
    }
}

package com.db.libmanagementsystem.Controller;

import com.db.libmanagementsystem.Model.Book;
import com.db.libmanagementsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/getBooks")
    public ResponseEntity getBooks(@RequestParam(value = "isbn",required = false) String isbn,
                                   @RequestParam(value = "title",required = false) String title){

        List<Book> bookList=bookService.getBooks(isbn, title);
        return new ResponseEntity(bookList,HttpStatus.OK);
    }
}
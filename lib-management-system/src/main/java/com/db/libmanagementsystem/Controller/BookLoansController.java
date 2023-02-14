package com.db.libmanagementsystem.Controller;

import com.db.libmanagementsystem.Model.Book;
import com.db.libmanagementsystem.Service.BookLoansService;
import com.db.libmanagementsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class BookLoansController {
    @Autowired
    BookLoansService loansService;

    @GetMapping("/loanedBooks")
    public ResponseEntity getBooks(@RequestParam(value = "cardId",required = true) String card_id) {

        int num = loansService.numOfBooksLoaned(card_id);
        return new ResponseEntity(num, HttpStatus.OK);
    }
}

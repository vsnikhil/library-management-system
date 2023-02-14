package com.db.libmanagementsystem.Service;

import com.db.libmanagementsystem.Model.Book;
import com.db.libmanagementsystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBooks(String isbn, String title){
        if (isbn != null){
            return bookRepository.findBooksByIsbn(isbn);
        }
        else if (title != null){
            return bookRepository.findBooksByTitle(title);
        }
        return bookRepository.findAll();
    }

}

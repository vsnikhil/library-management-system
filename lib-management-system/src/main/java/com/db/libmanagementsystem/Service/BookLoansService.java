package com.db.libmanagementsystem.Service;

import com.db.libmanagementsystem.Repository.BookLoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookLoansService {
    @Autowired
    BookLoansRepository loansRepository;

    public int numOfBooksLoaned(String card_id){
        if (card_id != null){
            return loansRepository.getNumOfBooks(card_id).size();
        }
        return 0;
    }
}

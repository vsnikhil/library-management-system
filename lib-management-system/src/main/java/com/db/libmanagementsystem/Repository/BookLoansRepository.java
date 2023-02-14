package com.db.libmanagementsystem.Repository;

import com.db.libmanagementsystem.Model.BookLoans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface BookLoansRepository extends JpaRepository<BookLoans, Integer> {
    @Query("select b from BookLoans b where b.cardId=:card_id")
    List<BookLoans> getNumOfBooks(@Param("card_id") String cardId);

    @Modifying
    @Query("update BookLoans b set b.dateIn=:date_in b where b.cardId=:card_id and b.isbn=:isbn")
    int updateBookLoan(@Param("card_id") String cardId, @Param("isbn") String isbn, @Param("date_in") String date);
}

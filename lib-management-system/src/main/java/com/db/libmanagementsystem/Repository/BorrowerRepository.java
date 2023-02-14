package com.db.libmanagementsystem.Repository;

import com.db.libmanagementsystem.Model.Book;
import com.db.libmanagementsystem.Model.BookLoans;
import com.db.libmanagementsystem.Model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface BorrowerRepository extends JpaRepository<Borrower, Integer> {
    @Query("select b from Borrower b where b.cardId=:card_id")
    List<Borrower> getBorrower(@Param("card_id") String cardId);

    @Modifying
    @Query("insert into Borrower b where b.cardId=:#{#book?.card},b.ssn=:#{#book?.ssn}, b.name=:#{#book?.name}")
    int addBorrower(@RequestParam("borrower") Borrower borrower);
}

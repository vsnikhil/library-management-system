package com.db.libmanagementsystem.Repository;

import com.db.libmanagementsystem.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface BookRepository extends JpaRepository<Book,Integer> {
    @Query("select b from Book b where b.isbn=:isbn")
    List<Book> findBooksByIsbn(@Param("isbn") String isbn);

    @Query("select b from Book b where b.title=:title")
    List<Book> findBooksByTitle(@Param("title") String title);

    @Modifying
    @Query("update Book b set b.card=:#{#book?.card},b.available=:#{#book?.available} where b.id=:#{#book?.id}")
    int updateBook(@RequestParam("book") Book book);
}


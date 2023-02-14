package com.db.libmanagementsystem.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BOOK")
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Book_id", unique = true, nullable = false)
    private int id;

    @Column(name = "Isbn", unique = true, nullable = false)
    private String isbn;

    @Column(name = "Title")
    private String title;

//    @ManyToMany(mappedBy = "books")
//    private List<BookAuthors> bookAuthors;

    public Book() {}

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

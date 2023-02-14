package com.db.libmanagementsystem.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BOOK_AUTHORS")
public class BookAuthors {
    @Id
    @Column(name = "Author_id", unique = true, nullable = false)
    private int authorId;

    @Column(name = "Isbn", nullable = false)
    private String isbn;

//    @OneToOne
//    private Authors authors;

//    @ManyToMany
//    private List<Book> books;

    public BookAuthors() {
    }

    public BookAuthors(int authorId, String isbn) {
        this.authorId = authorId;
        this.isbn = isbn;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "BookAuthors{" +
                "authorId=" + authorId +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

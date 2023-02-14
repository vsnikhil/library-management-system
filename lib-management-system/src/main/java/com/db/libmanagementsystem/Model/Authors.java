package com.db.libmanagementsystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORS")
public class Authors {
    @Id
    @Column(name = "Author_id", unique = true, nullable = false)
    private int authorId;

    @Column(name = "Name", nullable = false)
    private String name;

    public Authors() {
    }

    public Authors(int authorId, String name) {
        this.authorId = authorId;
        this.name = name;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                '}';
    }
}

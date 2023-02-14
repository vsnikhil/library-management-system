package com.db.libmanagementsystem.Model;

import javax.persistence.*;

@Entity
@Table(name = "BOOK_LOANS")
public class BookLoans {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "Loan_id", unique = true, nullable = false)
    private int loanId;

    @Column(name = "Isbn", nullable = false)
    private String isbn;

    @Column(name = "Card_id", nullable = false)
    private int cardId;

    @Column(name = "Date_out")
    private String dateOut;

    @Column(name = "Due_date")
    private String dueDate;

    @Column(name = "Date_in")
    private String dateIn;

    public BookLoans() {
    }

    public BookLoans(int loanId, String isbn, int cardId, String dateOut, String dueDate, String dateIn) {
        this.loanId = loanId;
        this.isbn = isbn;
        this.cardId = cardId;
        this.dateOut = dateOut;
        this.dueDate = dueDate;
        this.dateIn = dateIn;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    @Override
    public String toString() {
        return "BookLoans{" +
                "loanId=" + loanId +
                ", isbn='" + isbn + '\'' +
                ", cardId=" + cardId +
                ", dateOut='" + dateOut + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", dateIn='" + dateIn + '\'' +
                '}';
    }
}

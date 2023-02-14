package com.db.libmanagementsystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FINES")
public class Fines {
    @Id
    @Column(name = "Loan_id", unique = true, nullable = false)
    private int loanId;

    @Column(name = "Fine_amt")
    private float amt;

    @Column(name = "Paid")
    private boolean paid;

    public Fines() {
    }

    public Fines(int loanId, float amt, boolean paid) {
        this.loanId = loanId;
        this.amt = amt;
        this.paid = paid;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public float getAmt() {
        return amt;
    }

    public void setAmt(float amt) {
        this.amt = amt;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Fines{" +
                "loanId=" + loanId +
                ", amt=" + amt +
                ", paid=" + paid +
                '}';
    }
}

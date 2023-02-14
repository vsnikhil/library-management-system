package com.db.libmanagementsystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BORROWER")
public class Borrower {

    @Id
    @Column(name = "Card_id", unique = true, nullable = false)
    private int cardId;

    @Column(name = "Ssn")
    private String ssn;

    @Column(name = "Bname")
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "Phone")
    private String phone;

    public Borrower() {
    }

    public Borrower(int cardId, String ssn, String name, String address, String phone) {
        this.cardId = cardId;
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "cardId=" + cardId +
                ", ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

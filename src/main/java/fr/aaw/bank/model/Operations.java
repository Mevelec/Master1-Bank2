package fr.aaw.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Operations {
    
    @Id
    private Integer id;
    private Float amount;
    private Date date;

    @OneToOne
    private BankAccounts account;

    //--------------------------- GETTERS SETTERS --------------------------
    // ID --------------------
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    // account --------------------
    public BankAccounts getBankAccount() {
        return account;
    }
    public void setBankAccount(BankAccounts account) {
        this.account = account;
    }

    // Amount --------------------
    public Float getAmount() {
        return amount;
    }
    public void setAmount(Float amount) {
        this.amount = amount;
    }

    // account --------------------
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}

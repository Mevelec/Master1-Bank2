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
    private BankAccounts srcAccount;
    @OneToOne
    private BankAccounts dstAccount;

    //--------------------------- GETTERS SETTERS --------------------------
    // ID --------------------
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    // account --------------------
    public BankAccounts getEmitterBankAccount() {
        return srcAccount;
    }
    public void setEmitterBankAccount(BankAccounts account) {
        this.srcAccount = account;
    }

    public BankAccounts getRecieverBankAccount() {
        return dstAccount;
    }
    public void setRecieverBankAccount(BankAccounts account) {
        this.dstAccount = account;
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

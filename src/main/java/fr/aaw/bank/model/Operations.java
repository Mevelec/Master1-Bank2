package fr.aaw.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
    private BankAccounts srcAccount;
    @OneToOne
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
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
    public BankAccounts getSrcAccount() {
        return srcAccount;
    }
    public void setSrcAccount(BankAccounts account) {
        this.srcAccount = account;
    }

    public BankAccounts getDstAccount() {
        return dstAccount;
    }
    public void setDstAccount(BankAccounts account) {
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

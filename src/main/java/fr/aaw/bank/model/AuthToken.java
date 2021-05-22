package fr.aaw.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AuthToken {

    @Id
    private String token;
    private Integer userId;
    private Date expiredDate;

    // ---------------------- GETTERS SETTERS -----------------------
    // TOKEN --------------------------------
    public String getToken(){
        return this.token;
    }
    // USER ID --------------------------------
    public Integer getUserId(){
        return this.userId;
    }
    // EXPIRED DATE --------------------------------
    public Date getExpiredDate(){
        return this.expiredDate;
    }
}

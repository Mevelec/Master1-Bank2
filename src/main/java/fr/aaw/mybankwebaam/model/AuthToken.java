package fr.aaw.mybankwebaam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class AuthToken {

    @Id
    private String token;
    private Integer userId;
    private Date expiredDate;

    public AuthToken(String token, Integer userId, Date expiredDate){
        this.token = token;
        this.userId = userId;
        this.expiredDate = expiredDate;
    }

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

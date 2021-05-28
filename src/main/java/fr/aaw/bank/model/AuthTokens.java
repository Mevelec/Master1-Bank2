package fr.aaw.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class AuthTokens {

    @Id
    private String id;
    private Integer userid;
    private Date expireddate;

    public AuthTokens() {
    }

    public AuthTokens(String id, Integer userid, Date expireddate) {
        this.id = id;
        this.userid = userid;
        this.expireddate = expireddate;
    }



    // ---------------------- GETTERS SETTERS -----------------------
    // TOKEN --------------------------------
    public String getToken(){
        return this.id;
    }
    // USER ID --------------------------------
    public Integer getUserId(){
        return this.userid;
    }
    // EXPIRED DATE --------------------------------
    public Date getExpiredDate(){
        return this.expireddate;
    }
}

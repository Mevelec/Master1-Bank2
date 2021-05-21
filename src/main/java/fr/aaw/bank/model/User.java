package fr.aaw.bank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private boolean admin;

    public User(String name, String password){
        this.username=name;
        this.password = password;
    }

    //--------------------------- GETTERS SETTERS --------------------------
    // ID --------------------
    public Integer getId() {
        return id;
    }

    // USERNAME --------------------
    @Override
    public String getUsername() {
        return username;
    }

    // PASSWORD --------------------
    @Override
    public String getPassword() {
        return password;
    }

    // AUTHORITIES -----------------
    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(admin){
            return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }
        return null;
    }
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}

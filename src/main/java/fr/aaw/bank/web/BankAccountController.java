package fr.aaw.bank.web;

import fr.aaw.bank.model.AuthTokens;
import fr.aaw.bank.model.BankAccountRepository;
import fr.aaw.bank.model.BankAccounts;
import fr.aaw.bank.model.AuthTokenRepository;
import fr.aaw.bank.model.Users;
import fr.aaw.bank.model.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/BankAccount")
class BankAccountController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private BankAccountRepository bankRepository;

    @GetMapping("/list")
    public List<BankAccounts> lignes(){
        return bankRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public List<BankAccounts> login(@PathVariable("id") Integer id) {
        return bankRepository.findByUserId(id);
    }
}

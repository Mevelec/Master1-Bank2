package fr.aaw.bank.web;

import fr.aaw.bank.model.BankAccountRepository;
import fr.aaw.bank.model.BankAccounts;
import fr.aaw.bank.model.Operations;
import fr.aaw.bank.model.OperationsRepository;
import fr.aaw.bank.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Operation")
class OperationsController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private OperationsRepository operationRepository;

    @Autowired
    private BankAccountRepository bankRepository;

    @GetMapping("/debits/{id}")
    public List<Operations> debits(@PathVariable("id") Integer id){
        Users principal = (Users) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        BankAccounts account = bankRepository.getById(id);
        if(account.getUser().getId() != principal.getId()){
            return null;
        }
        List<Operations> a = operationRepository.findBySrcAccountId(id);
        return a;
    }

    @GetMapping("/credits/{id}")
    public List<Operations> credits(@PathVariable("id") Integer id){
        Users principal = (Users) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        BankAccounts account = bankRepository.getById(id);
        if(account.getUser().getId() != principal.getId()){
            return null;
        }
        
        return operationRepository.findByDstAccountId(id);
    }

    @GetMapping("/list/{id}")
    public List<Operations> list(@PathVariable("id") Integer id){
        Users principal = (Users) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        BankAccounts account = bankRepository.getById(id);
        if(account.getUser().getId() != principal.getId()){
            return null;
        }
        
        List<Operations> ret = operationRepository.findByDstAccountId(id);
        ret.addAll(operationRepository.findBySrcAccountId(id));
        return ret;
    }
}

package fr.aaw.bank.web;

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

    @GetMapping("/debits")
    public List<Operations> debits(){
        Users principal = (Users) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return operationRepository.findBySrcAccountId(principal.getId());
    }

    @GetMapping("/credits")
    public List<Operations> credits(){
        Users principal = (Users) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return operationRepository.findByDstAccountId(principal.getId());
    }

    @GetMapping("/list")
    public List<Operations> list(){
        Users principal = (Users) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Operations> ret = operationRepository.findByDstAccountId(principal.getId());
        ret.addAll(operationRepository.findBySrcAccountId(principal.getId()));
        return ret;
    }
}

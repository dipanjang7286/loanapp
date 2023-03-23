package com.loanapp.loanapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanapp.loanapp.model.Loan;
import com.loanapp.loanapp.service.LoanService;

@RestController
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping("/loans")
    public ResponseEntity<List<Loan>> getAllLoans(){
        return ResponseEntity.ok().body(loanService.getAllLoans());
    }

    @GetMapping("/loans/{id}")
    public ResponseEntity<List<Loan>> getLoanByCustomerId(@PathVariable int id){
        return ResponseEntity.ok().body(loanService.getAllLoansByCustomerId(id));
    }

    

}

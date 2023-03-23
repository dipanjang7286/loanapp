package com.loanapp.loanapp.service;

import java.util.List;

import com.loanapp.loanapp.model.Loan;

public interface LoanService {
    List<Loan> getAllLoans();
    List<Loan> getAllLoansByCustomerId(int CustomerId);
    
}

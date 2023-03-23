package com.loanapp.loanapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanapp.loanapp.model.Loan;
import com.loanapp.loanapp.repo.LoanRepository;
@Service
@Transactional
public class LoanServiceImpl implements LoanService {
    @Autowired
    private LoanRepository loanRepository;

    @Override
    public List<Loan> getAllLoans() {
        return this.loanRepository.findAll();
        // throw new UnsupportedOperationException("Unimplemented method 'getAllLoans'");
    }

    @Override
    public List<Loan> getAllLoansByCustomerId(int CustomerId) {
        return this.loanRepository.searchByCustomerId(CustomerId);
        // throw new UnsupportedOperationException("Unimplemented method 'getAllLoansByCustomerId'");
    }
    
}

package com.loanapp.loanapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loanapp.loanapp.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer> {
    List<Loan> searchByCustomerId(int customerId);
}

package com.example.MoocJavaWeb.SimpleBank;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByIban(String iban);
}
package com.example.MoocJavaWeb.SimpleBank;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {

    Client findByName(String name);
}

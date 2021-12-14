package com.example.MoocJavaWeb.SimpleBank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client extends AbstractPersistable<Long> {

    private String name;
    @OneToMany(mappedBy = "client")
    private List<Account> accounts = new ArrayList<>();
}

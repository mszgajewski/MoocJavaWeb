package com.example.MoocJavaWeb.Airport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Aircraft extends AbstractPersistable<Long> {

    private String name;
    @ManyToOne
    private Airport airport;
}

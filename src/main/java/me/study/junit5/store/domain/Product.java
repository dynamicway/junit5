package me.study.junit5.store.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "STORE_ID")
    private Store store;
}

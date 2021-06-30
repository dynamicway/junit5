package me.study.junit5.store.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "store")
    private List<Product> productList;
}

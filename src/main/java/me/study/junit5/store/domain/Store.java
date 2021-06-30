package me.study.junit5.store.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "store")
    private List<Product> productList;
}

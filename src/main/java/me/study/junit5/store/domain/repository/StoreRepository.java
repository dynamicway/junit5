package me.study.junit5.store.domain.repository;

import me.study.junit5.store.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}

package me.study.junit5.store.service.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductDto {

    private Long id;
    private StoreDto store;
}

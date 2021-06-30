package me.study.junit5.store.service.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;


@Builder
@Getter
public class StoreDto {
    private Long id;
    private List<ProductDto> productDtoList;
}

package me.study.junit5.store.service;

import lombok.RequiredArgsConstructor;
import me.study.junit5.store.domain.repository.StoreRepository;
import me.study.junit5.store.service.dto.ProductDto;
import me.study.junit5.store.service.dto.StoreDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StoreService {

    private final StoreRepository repository;

    public List<StoreDto> selectStoreDtoList(StoreDto storeDto) {
        return repository.findAll().stream()
                .map(s -> StoreDto.builder()
                        .id(s.getId())
                        .productDtoList(s.getProductList().stream()
                                .map(p -> ProductDto.builder()
                                        .id(p.getId())
                                        .store(StoreDto.builder()
                                                .id(p.getStore().getId())
                                                .build())
                                        .build())
                                .collect(Collectors.toList()))
                        .build())
                .collect(Collectors.toList());
    }
}

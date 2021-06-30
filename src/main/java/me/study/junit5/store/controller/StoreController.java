package me.study.junit5.store.controller;

import lombok.RequiredArgsConstructor;
import me.study.junit5.store.controller.request.SelectStoreRequest;
import me.study.junit5.store.controller.response.StoreResponse;
import me.study.junit5.store.service.StoreService;
import me.study.junit5.store.service.dto.StoreDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService service;


    @GetMapping
    public List<StoreResponse> selectStoreList(@RequestBody SelectStoreRequest request) {
        return service.selectStoreDtoList(StoreDto.builder().build()).stream()
                .map(s -> StoreResponse.builder()
                        .id(s.getId())
                        .build())
                .collect(Collectors.toList());
    }
}

package me.study.junit5.store.service;

import me.study.junit5.store.domain.Store;
import me.study.junit5.store.domain.repository.StoreRepository;
import me.study.junit5.store.service.dto.StoreDto;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StoreServiceTest {


    @Test
    void mockito_test(
            @Mock
                    StoreRepository repository
    ) {
        StoreService service = new StoreService(repository);


        assertNotNull(service);
    }

    @Test
    void mock_stubbing(
            @Mock StoreRepository repository
    ) {
        StoreService service = new StoreService(repository);

        Store store = Store.builder().id(1L).build();

        List<Store> storeList = new ArrayList<>();

        storeList.add(store);
        when(repository.findAll()).thenReturn(storeList);

        assertEquals(store.getId(), service.selectStoreDtoList(StoreDto.builder().build()).get(0).getId());
    }
}
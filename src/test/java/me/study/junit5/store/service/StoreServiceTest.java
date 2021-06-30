package me.study.junit5.store.service;

import me.study.junit5.store.domain.repository.StoreRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

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
}
package me.study.junit5.store.controller.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Builder;

@Builder
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StoreResponse {
    private final Long id;
}

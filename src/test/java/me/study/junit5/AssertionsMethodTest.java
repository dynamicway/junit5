package me.study.junit5;

import me.study.junit5.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsMethodTest {

    @Test
    @DisplayName("Assert Equals")
    void assert_equals() {
        // given
        User user1 = User.builder()
                .id(1L)
                .username("user1")
                .password("pass1")
                .build();

        // when
        String username = user1.getUsername();

        // then
        assertEquals(user1.getUsername(), username);
    }
}

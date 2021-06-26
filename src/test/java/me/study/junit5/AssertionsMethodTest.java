package me.study.junit5;

import me.study.junit5.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsMethodTest {

    @Test
    @DisplayName("Assert equals")
    void assert_equals() {
        // given
        User user = User.builder()
                .id(1L)
                .username("user")
                .password("pass1")
                .build();

        // when
        String username = user.getUsername();

        // then
        assertEquals(user.getUsername(), username);
    }

    @Test
    @DisplayName("Assert not null")
    void assert_not_null() {
        // given
        User user = User.builder()
                .username("user")
                .build();

        // when
        String username = user.getUsername();

        // then
        assertNotNull(username);
    }

    @Test
    @DisplayName("Assert true")
    void assert_true() {
        // given
        User user = User.builder()
                .username("user")
                .build();

        User sameUser = User.builder()
                .username(user.getUsername())
                .build();
        // when
        boolean result = user.equals(sameUser);

        // then
        assertTrue(result);

    }
}

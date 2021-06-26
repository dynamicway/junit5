package me.study.junit5;

import me.study.junit5.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

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

    @Test
    @DisplayName("Assert all")
    void assert_all() {
        // given
        User user = User.builder()
                .id(1L)
                .username("user")
                .password("password")
                .build();

        // when
        Long id = user.getId();
        String username = user.getUsername();
        String password = user.getPassword();

        // then
        assertAll(
                () -> assertEquals(user.getId(), id),
                () -> assertEquals(user.getUsername(), username),
                () -> assertEquals(user.getPassword(), password)
        );
    }

    @Test
    @DisplayName("Assert throws")
    void assert_throws() {
        // given
        User user = User.builder()
                .username("user")
                .build();

        // when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, user::getException);

        // then
        assertEquals("Get Exception", exception.getMessage());

    }

    @Test
    @DisplayName("Assert timeout")
    void assert_timeout() {
        // given
        User user = User.builder().build();

        // when


        // then
        assertTimeout(Duration.ofMillis(300), user::sleep);
    }

    @Test
    @DisplayName("Assert message")
    void assert_message() {
        // given
        User user = User.builder()
                .username("user")
                .build();

        // when
        String username = null;

        // then
        assertEquals(user.getUsername(), username, "user name is null");
    }

    @Test
    @DisplayName("Assert message with lambda")
    void assert_message_lambda() {
        // given
        User user = User.builder()
                .username("user")
                .build();

        // when
        String username = null;

        // then
        assertEquals(user.getUsername(), username, () -> "user name is null");
    }
}

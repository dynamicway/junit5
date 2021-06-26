package me.study.junit5;

import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DefaultAnnotationTest {

    @Test
    @DisplayName("\uD83D\uDE31")
    void default_annotation_test() {
        System.out.println("Display name with emoji");
    }

    @Test
    void display_name_generation_replace_underscores() {
        System.out.println("Display name generation");
    }

    @Test
    @Disabled
    void disabled_test() {
        System.out.println("Disabled test");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }
}
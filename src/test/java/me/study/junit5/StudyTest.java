package me.study.junit5;

import org.junit.jupiter.api.*;


class StudyTest {

    @Test
    @DisplayName("\uD83D\uDE31")
    void create_new_study() {
        Study study = new Study();
        Assertions.assertNotNull(study);
    }

    @Test
    void create_new_study_again() {
        System.out.println("create1");
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
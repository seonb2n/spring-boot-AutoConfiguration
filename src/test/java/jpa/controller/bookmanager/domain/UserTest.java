package jpa.controller.bookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("steve@gamail.com");
        user.setName("Adam");

        User user1 = new User("Jack", "jack2@naver.com");

        System.out.println(">>> +" + user.toString());
    }
}
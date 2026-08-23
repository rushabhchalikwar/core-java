package com.rushabh.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .name("Rushabh")
                .email("rushabhchaikwar@gmail.com")
                .build();
    }
}

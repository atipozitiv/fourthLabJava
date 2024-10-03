package org.example;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Visitor {
    String name;
    String surname;
    String phone;
    boolean subscribed;
    ArrayList<Book> favoriteBooks;
}
package org.example;


import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader fileReader = new FileReader(Paths.get("books.json").toAbsolutePath().toFile());
        System.out.println(fileReader);
    }
}
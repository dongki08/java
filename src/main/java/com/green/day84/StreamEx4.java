package com.green.day84;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"), new File("Ex2.bak")
                , new File("Ex2.java"), new File("Ex2")
                , new File("Ex2.txt")
        };
        Stream<File> fileStream = Stream.of(fileArr);
        Stream<String> strStream = fileStream.map(item -> item.getName());
        strStream.forEach(System.out::println);

        Stream.of(fileArr).map(File::getName)
                .filter(item -> item.indexOf(".") != -1)
                .map(item -> item.substring(item.indexOf('.') + 1))
                .map(item -> item.toUpperCase())//대문자변경
                .distinct()
                .forEach(System.out::println);
        ;
    }
}

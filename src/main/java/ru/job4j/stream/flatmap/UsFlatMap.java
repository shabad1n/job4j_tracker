package ru.job4j.stream.flatmap;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsFlatMap {

   public static List<Integer> flatmap(Integer[][] matrix) {
       return Stream.of(matrix)
               .flatMap(Arrays::stream)
               .collect(Collectors.toList());
    }
}
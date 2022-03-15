package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Вывод без Stream API");

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();

        for (int x : intList) {
            if (x <= 0) {
                continue;
            }
            if (x % 2 != 0) {
                continue;
            }
            result.add(x);
        }
        Collections.sort(result);
        System.out.println(result);

        System.out.println();
        System.out.println("Вывод с помощью Stream API");
        StreamMain streamMain = new StreamMain();
        streamMain.main();
    }
}

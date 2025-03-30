package com.k1ts.helper;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DataGenerator {

    private static final List<Character> characters = new ArrayList<>();

    static  {
        for (char i = 'a'; i <= 'z'; i++) {
            characters.add(i);
        }

        for (char i = 'A'; i <= 'Z'; i++) {
            characters.add(i);
        }

        for (char i = '0'; i <= '9'; i++) {
            characters.add(i);
        }
    }

    public static String generateEmail() {
        return (generateRandomString(3, 5) + "@" +
                generateRandomString(3, 5) + "." +
                generateRandomString(3, 5))
                .toLowerCase();
    }

    public static String generateRandomString(int length) {
        return generateRandomString(length, length);
    }

    public static String generateRandomString(int min, int max) {
        StringBuilder resultBuilder = new StringBuilder();
        Random random = new Random();

        int length = min + random.nextInt(max - min + 1);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.size());
            resultBuilder.append(characters.get(index));
        }

        return resultBuilder.toString();
    }

    public static String generateRandomValidEmail() {
        return (generateRandomString(3, 5) + "@" +
                generateRandomString(3, 5) + "." +
                generateRandomString(3, 5)).toLowerCase();
    }

    public static int generateRandomNumber(int min, int max) {
        return min + new Random().nextInt(max - min + 1);
    }


    public static long generateRandomNumber(long min, long max) {
        return min + new Random().nextLong(max - min + 1);
    }

    public static double generateRandomNumber(double min, double max) {
        return min + new Random().nextDouble(max - min + 1);
    }

    public static int generateRandomNumberExceptOf(int min, int max, int[] exclusions) {
        List<Integer> exclusionList = Arrays.stream(exclusions).boxed().toList();

        Random random = new Random();

        int value = min + random.nextInt(max - min + 1);

        while (exclusionList.contains(value)) {
            value = min + random.nextInt(max - min + 1);
        }

        return value;
    }

    public static int generateRandomNumber(int[] values) {
        return values[new Random().nextInt(values.length)];
    }
}

package hu.webler.recap;

import java.util.Arrays;

public class ArrayExemple {

    public static void main(String[] args) {
        int [] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i <numbers.length; i++) {
            if (i % 2 == 0) {
                numbers[i] += i;
            }

        }
    }
}

package hu.webler.recap;

import java.util.Scanner;

public class ArrayExemple02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        System.out.println("Kezdő szám");
        int end = scanner.nextInt();
        System.out.println("Végszám");

        int lenght = 0;
        int[] numbers = new int[lenght];



    }
    private static int countNumber(int start, int end) {
        int counter = 0;
        for (int i = start; i < end; i++) {
          if (i % 2 ==0) {
              counter++;
          }
        }return counter;
    }
}

package day3;

import day3.util.StringUntil;

import java.io.*;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) throws IOException {

        File file = new File("input.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            Scanner scanner = new Scanner(bufferedReader);

            int sum = 0;

            while (scanner.hasNext()) {
                String next = scanner.nextLine();
                int inputLength = next.length();
                int middle = inputLength / 2;

                String leftSide = next.substring(0, middle);
                String rightSide = next.substring(middle, inputLength);

                char commonChar = StringUntil.findCommonChar(leftSide, rightSide);

                if (Character.isUpperCase(commonChar)) {
                    int priority = (int) commonChar - 38;
                    sum += priority;
                } else {
                    int priority = (int) commonChar - 96;
                    sum += priority;
                }
            }
            System.out.println(sum);
        }
    }
}
package day1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Day1Part2 {
    public static void main(String[] args) {
        int sum = 0;

        File file = new File("input.txt");
        int[] numbers = {0, 0, 0};

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            Scanner scanner = new Scanner(bufferedReader);

            while (scanner.hasNext()) {
                String next = scanner.nextLine();
                if (!next.equals("\n") && !next.isEmpty()) {
                    sum += Integer.parseInt(next);
                } else {
                    Arrays.sort(numbers);

                    if (sum > 60000) {
                        System.out.println("sum " + sum);
                    }
                    for (int i = 0; i < numbers.length; i++) {
                        if (sum > numbers[i]) {
                            numbers[i] = sum;
                            break;
                        }
                    }
                    sum = 0;
                }
            }

            int total = 0;
            for (int i : numbers) {
                total += i;
            }
            System.out.println(total);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package day1;

import java.io.*;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) throws IOException {

        int max = 0;
        int sum = 0;

        File file = new File("input.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            Scanner scanner = new Scanner(bufferedReader);

            while (scanner.hasNext()) {
                String next = scanner.nextLine();
                if (!next.equals("\n") && !next.isEmpty()) {
                    sum += Integer.parseInt(next);
                } else {
                    if (max < sum) {
                        max = sum;
                    }
                    sum = 0;
                }
            }
            System.out.println(max);
        }
    }
}
package day2;

import day2.untilgeneral.IResult;
import day2.untilgeneral.MapUtils;
import day2.untilgeneral.Shape;
import day2.utilsDay2Part2.Condition;
import day2.utilsDay2Part2.ReverseResult;

import java.io.*;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {

        int points = 0;

        File file = new File("input.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            Scanner scanner = new Scanner(bufferedReader);

            while (scanner.hasNext()) {
                String next = scanner.nextLine();

                char[] moveColumn = next.toCharArray();
                Shape opponent = MapUtils.mapToShape(moveColumn[0]);
                Condition mappedCondition = MapUtils.mapToCondition(moveColumn[2]);
                IResult reverseResult = new ReverseResult(opponent, mappedCondition);
                points += reverseResult.calculatePoints();
            }
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(points);
    }
}

package day2;

import day2.untilgeneral.IResult;
import day2.untilgeneral.MapUtils;
import day2.utilsDay2Part1.MoveResult;
import day2.untilgeneral.Shape;

import java.io.*;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {

        int result = 0;

        File file = new File("input.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            Scanner scanner = new Scanner(bufferedReader);

            while (scanner.hasNext()) {
                String next = scanner.nextLine();

                char[] moveColumn = next.toCharArray();

                Shape opponent = MapUtils.mapToShape(moveColumn[0]);
                Shape me = MapUtils.mapToShape(moveColumn[2]);
                IResult moveResult = new MoveResult(opponent, me);
                result += moveResult.calculatePoints();
            }
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);
    }
}

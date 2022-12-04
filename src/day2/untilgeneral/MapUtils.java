package day2.untilgeneral;

import day2.utilsDay2Part2.Condition;

public class MapUtils {

    public static Shape mapToShape(char character) throws IllegalAccessException {
        switch (character) {
            case 'A', 'X' -> {
                return Shape.Rock;
            }
            case 'B', 'Y' -> {
                return Shape.Paper;
            }
            case 'C', 'Z' -> {
                return Shape.Scissors;
            }
            default -> {
                throw new IllegalAccessException("Character doesn´t map to shape");
            }
        }
    }

    public static Condition mapToCondition(char shapeCaracter) {
        switch (shapeCaracter) {
            case 'X' -> {
                return Condition.LOSE;
            }
            case 'Y' -> {
                return Condition.DRAW;
            }
            case 'Z' -> {
                return Condition.WIN;
            }
            default -> {
                throw new IllegalArgumentException("Shape character doesn´t map to condition");
            }
        }
    }
}

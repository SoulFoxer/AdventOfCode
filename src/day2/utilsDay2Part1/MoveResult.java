package day2.utilsDay2Part1;

import day2.untilgeneral.IResult;
import day2.untilgeneral.Shape;

public class MoveResult implements IResult {
    private final Shape opponent;
    private final Shape me;

    public MoveResult(Shape shape1, Shape shape2) {
        this.opponent = shape1;
        this.me = shape2;
    }

    public int calculatePoints() {
        switch (opponent) {
            case Rock -> {
                if (me == Shape.Rock) {
                    return 4;
                } else if (me == Shape.Paper) {
                    return 8;
                } else if (me == Shape.Scissors) {
                    return 3;
                }
            }
            case Paper -> {
                if (me == Shape.Rock) {
                    return 1;
                } else if (me == Shape.Paper) {
                    return 5;
                } else if (me == Shape.Scissors) {
                    return 9;
                }
            }
            case Scissors -> {
                if (me == Shape.Rock) {
                    return 7;
                } else if (me == Shape.Paper) {
                    return 2;
                } else if (me == Shape.Scissors) {
                    return 6;
                }
            }
        }
        return 0;
    }
}

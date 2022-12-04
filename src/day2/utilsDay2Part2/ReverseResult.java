package day2.utilsDay2Part2;

import day2.untilgeneral.IResult;
import day2.untilgeneral.Shape;

public class ReverseResult implements IResult {
    private final Shape opponent;
    private final Condition condition;

    public ReverseResult(Shape opponent, Condition condition) {
        this.opponent = opponent;
        this.condition = condition;
    }

    @Override
    public int calculatePoints() {
        switch (opponent) {
            case Rock -> {
                if (condition == Condition.DRAW) {
                    return 4;
                } else if (condition == Condition.LOSE) {
                    return 3;
                } else if (condition == Condition.WIN) {
                    return 8;
                }
            }
            case Paper -> {
                if (condition == Condition.DRAW) {
                    return 5;
                } else if (condition == Condition.LOSE) {
                    return 1;
                } else if (condition == Condition.WIN) {
                    return 9;
                }
            }
            case Scissors -> {
                if (condition == Condition.DRAW) {
                    return 6;
                } else if (condition == Condition.LOSE) {
                    return 2;
                } else if (condition == Condition.WIN) {
                    return 7;
                }
            }
        }
        throw new IllegalStateException("Cant map shape");
    }
}

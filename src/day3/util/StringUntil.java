package day3.util;

public class StringUntil {

    public static char findCommonChar(String leftSide, String rightSide) {
        char found = 0;
        for (int i = 0; i < leftSide.length(); i++) {
            for (int j = 0; j < rightSide.length(); j++) {
                if (leftSide.charAt(i) == rightSide.charAt(j)) {
                    found = leftSide.charAt(i);
                    break;
                }
            }
        }
        return found;
    }
}

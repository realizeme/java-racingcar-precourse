package util;

public class RandomNumber {
    public static int MIN = 0;
    public static int MAX = 9;

    private int number;

    public RandomNumber(int number){
        this.number = number;
    }

    public static RandomNumber random() {
        RandomNumber number = new RandomNumber(1);
        if (number.isLessEqualThan(MIN) || number.isGreaterEqualThan(MAX)) {
            throw new IllegalArgumentException("잘못된 범위의 숫자 입니다");
        }
        return number;
    }

    boolean isLessEqualThan(int inputNum) {
        if (number <= inputNum){
            return true;
        }
        return false;
    }

    boolean isGreaterEqualThan(int inputNum) {
        if (number >= inputNum){
            return true;
        }
        return false;
    }
}

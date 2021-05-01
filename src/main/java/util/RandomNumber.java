package util;

public class RandomNumber {
    public static int MIN = 0;
    public static int MAX = 9;

    private int number;

    public RandomNumber(int number){
        this.number = number;
    }

    private static int mathRandom(){
        double dValue = Math.random();
        return (int)(dValue * 10);
    }

    public static RandomNumber random() {
        RandomNumber number = new RandomNumber(mathRandom());
        if (number.isLessThan(MIN) || number.isGreaterThan(MAX)) {
            throw new IllegalArgumentException("잘못된 범위의 숫자 입니다");
        }
        return number;
    }

    public boolean isLessThan(int inputNum) {
        if (number < inputNum){
            return true;
        }
        return false;
    }

    public boolean isGreaterThan(int inputNum) {
        if (number > inputNum){
            return true;
        }
        return false;
    }
}

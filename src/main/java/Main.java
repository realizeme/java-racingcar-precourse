import game.RacingGame;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        List<String> racerList = inputRacer();
        Integer trialCount = inputTrialCount();
        RacingGame game = new RacingGame(racerList, trialCount);
        while(!game.isOver()){
            game.play();
            game.printAllCars();
        }
        game.displayWinners();
    }

    private static List<String> inputRacer(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String racers = scanner.nextLine();
        return Arrays.asList(racers.split(","));
    }

    private static Integer inputTrialCount(){
        System.out.println("시도할 회수는 몇회인가요?");
        String count = scanner.nextLine();
        return Integer.valueOf(count);
    }


}

package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    ArrayList<Car> cars = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        cars.add(new Car("pobi"));
        cars.add(new Car("crong"));
        cars.add(new Car("honux"));
    }

    @Test
    @DisplayName("게임 1회 진행 종료")
    public void 게임_1회_진행후_종료(){
        RacingGame game = new RacingGame(cars, 1);
        game.play();
        assertThat(game.isOver()).isTrue();
    }

    @Test
    @DisplayName("게임 2회 진행후 종료")
    public void 게임_2회_진행후_종료(){
        RacingGame game = new RacingGame(cars, 2);
        game.play();
        game.play();
        assertThat(game.isOver()).isTrue();
    }

}

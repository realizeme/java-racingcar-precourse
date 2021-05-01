package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test
    @DisplayName("게임 1회 진행 종료")
    public void 게임_1회_진행후_종료(){
        RacingGame game = new RacingGame(Arrays.asList("cars", "crong"), 1);
        game.play();
        assertThat(game.isOver()).isTrue();
    }

    @Test
    @DisplayName("게임 2회 진행후 종료")
    public void 게임_2회_진행후_종료(){
        RacingGame game = new RacingGame(Arrays.asList("cars", "crong"), 2);
        game.play();
        game.play();
        assertThat(game.isOver()).isTrue();
    }
}

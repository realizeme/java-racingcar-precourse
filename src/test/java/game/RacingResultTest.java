package game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingResultTest {

    @Test
    @DisplayName("레이싱 결과 변환")
    public void 레이싱_결과_변환(){
        Car car = new Car("pobi", 2);
        RacingResult result = RacingResult.of(car);

        assertThat(result.getName()).isEqualTo(car.getName());
        assertThat(result.getPosition()).isEqualTo(car.getPosition());
    }
}

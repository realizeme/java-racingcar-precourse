package util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.RandomNumber;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberTest {

    @Test
    @DisplayName("1과 9 사이 숫자 생성 - 생성자")
    public void 입려된_값의_범위가_1_9_사이인지_검증(){
        RandomNumber number = new RandomNumber(9);
        assertThat(number.isLessEqualThan(9)).isTrue();
        assertThat(number.isGreaterEqualThan(0)).isTrue();
    }

    @Test
    @DisplayName("1과 9 사이 숫자 생성자 - 팩토리")
    public void 팩토리_생성된_값의_범위가_1_9_사이인지_검증(){
        RandomNumber number = RandomNumber.random();
        assertThat(number.isLessEqualThan(9)).isTrue();
        assertThat(number.isGreaterEqualThan(0)).isTrue();
    }
}
package lotto.domain.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class ManualNumberDtoTest {

    @DisplayName("숫자가 아닌 값이 들어오면 IllegalArgumentException Throw")
    @ParameterizedTest
    @ValueSource(strings = {"1,2,3,a,5,6", "1,2,,, ,4"})
    void parseStringSplits(String wrongNumbers) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new ManualNumberDto(wrongNumbers))
                .withMessage("숫자를 입력해 주세요. - " + wrongNumbers);
    }
}
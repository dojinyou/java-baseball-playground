package study;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    /**
     * 요구사항 1-1 : "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
     * 요구사항 1-2 : "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
     */
    @Test
    @DisplayName("String.split method return values")
    void split() {
        String[] result1 = "1,2".split(",");
        assertThat(result1).contains("1","2");
        String[] result2 = "1".split(",");
        assertThat(result2).containsExactly("1"); // 배열에 대한 확인은 Type 선언으로 된건가?
    }

    /**
     * 요구사항 2-1 : "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
     */

    @Test
    @DisplayName("String.substring method return values")
    void substring() {
        String result = "(1,2)".substring(1,4);
        assertThat(result).isEqualTo("1,2");
    }

    /**
     * 요구사항 3-1 : "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
     * 요구사항 3-2 : String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
     * 요구사항 3-3 : JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
     */

    @Test
    @DisplayName("String.charAt method")
    void charAt() {
        assertThatThrownBy(()->{"abc".charAt(3);}).isInstanceOf(IndexOutOfBoundsException.class);
    }
}

package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현

    /**
     * 요구사항 1-1 : Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.
     */
    @Test
    @DisplayName("Set.size method return values")
    void size() {
        // 4개의 원소를 추가하였지만, 중복 제거를 통해 총 3개의 원소가 저장된다.
        // 이에 맞게 길이값이 4가 아닌 3이 나오는 것을 확인.
        assertThat(numbers.size()).isNotEqualTo(4).isEqualTo(3);
    }

    /**
     * 요구사항 2-1 : Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다.
     * 요구사항 2-2 : 구현하고 보니 다음과 같이 중복 코드가 계속해서 발생한다.
     * 요구사항 2-3 : JUnit의 ParameterizedTest를 활용해 중복 코드를 제거해 본다.
     * 요구사항 3-1 : method 결과 값이 true와 false가 혼합된 케이스를 한번에 구현한다.
     */
    @DisplayName("Set.cotains method return values")
    @ParameterizedTest
    @CsvSource({"1,true","2,true","3,true","4,false","5,false"})
    void contains(int element, boolean expect) {
        // version 2
        // assertThat(numbers.contains(element)).isTrue();

        // version 3
        assertEquals(numbers.contains(element), expect);
    }
}

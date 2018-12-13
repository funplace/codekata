package me.korkorna.kataexamples.kata02;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class KarateChapTest {

    @Test
    public void notfound_when_empty_array() {
        int[] input = {};
        int actualValue = KarateChap.chap(3, input);
        assertThat(actualValue).isEqualTo(-1);
    }

    @Test
    public void notfound_when_no_exist_same_number() {
        int[] input = {1};
        int actualValue = KarateChap.chap(3, input);
        assertThat(actualValue).isEqualTo(-1);
    }

    @Test
    public void find_zero_pos_when_one_array() {
        int[] input = {1};
        int actualValue = KarateChap.chap(1, input);
        assertThat(actualValue).isEqualTo(0);
    }
    
    // #


    @Test
    public void find_zero_pos_when_three_array() {
        int[] input = {1, 3, 5};
        int actualValue = KarateChap.chap(1, input);
        assertThat(actualValue).isEqualTo(0);
    }

    @Test
    public void find_zero_pos_when_three_array2() {
        int[] input = {1, 3, 5};
        int actualValue = KarateChap.chap(3, input);
        assertThat(actualValue).isEqualTo(1);
    }

    @Test
    public void find_zero_pos_when_three_array3() {
        int[] input = {1, 3, 5};
        int actualValue = KarateChap.chap(5, input);
        assertThat(actualValue).isEqualTo(2);
    }

    @Test
    public void find_zero_pos_when_three_array4() {
        int[] input = {1, 3, 5};
        int actualValue = KarateChap.chap(0, input);
        assertThat(actualValue).isEqualTo(-1);
    }


    @Test
    public void find_zero_pos_when_three_array5() {
        int[] input = {1, 3, 5};
        int actualValue = KarateChap.chap(2, input);
        assertThat(actualValue).isEqualTo(-1);
    }

    @Test
    public void find_zero_pos_when_three_array6() {
        int[] input = {1, 3, 5};
        int actualValue = KarateChap.chap(4, input);
        assertThat(actualValue).isEqualTo(-1);
    }

    @Test
    public void find_zero_pos_when_three_array7() {
        int[] input = {1, 3, 5};
        int actualValue = KarateChap.chap(6, input);
        assertThat(actualValue).isEqualTo(-1);
    }


    // ##

    @Test
    public void find_zero_pos_when_four_array() {
        int[] input = {1, 3, 5, 7};
        int actualValue = KarateChap.chap(1, input);
        assertThat(actualValue).isEqualTo(0);
    }

    @Test
    public void find_zero_pos_when_four_array2() {
        int[] input = {1, 3, 5, 7};
        int actualValue = KarateChap.chap(3, input);
        assertThat(actualValue).isEqualTo(1);
    }
    @Test
    public void find_zero_pos_when_four_array3() {
        int[] input = {1, 3, 5, 7};
        int actualValue = KarateChap.chap(5, input);
        assertThat(actualValue).isEqualTo(2);
    }
    @Test
    public void find_zero_pos_when_four_array4() {
        int[] input = {1, 3, 5, 7};
        int actualValue = KarateChap.chap(7, input);
        assertThat(actualValue).isEqualTo(3);
    }
    @Test
    public void find_zero_pos_when_four_array5() {
        int[] input = {1, 3, 5, 7};
        int actualValue = KarateChap.chap(0, input);
        assertThat(actualValue).isEqualTo(-1);
    }

    @Test
    public void find_zero_pos_when_four_array6() {
        int[] input = {1, 3, 5, 7};
        int actualValue = KarateChap.chap(0, input);
        assertThat(actualValue).isEqualTo(-1);
    }
    @Test
    public void find_zero_pos_when_four_array7() {
        int[] input = {1, 3, 5, 7};
        int actualValue = KarateChap.chap(2, input);
        assertThat(actualValue).isEqualTo(-1);
    }
    @Test
    public void find_zero_pos_when_four_array8() {
        int[] input = {1, 3, 5, 7};
        int actualValue = KarateChap.chap(4, input);
        assertThat(actualValue).isEqualTo(-1);
    }
    @Test
    public void find_zero_pos_when_four_array9() {
        int[] input = {1, 3, 5, 7};
        int actualValue = KarateChap.chap(6, input);
        assertThat(actualValue).isEqualTo(-1);
    }
    @Test
    public void find_zero_pos_when_four_array10() {
        int[] input = {1, 3, 5, 7};
        int actualValue = KarateChap.chap(8, input);
        assertThat(actualValue).isEqualTo(-1);
    }
}
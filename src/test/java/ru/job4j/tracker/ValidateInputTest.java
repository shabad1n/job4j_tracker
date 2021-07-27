package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void ValidatInputFirst() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"One", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void ValidatInputSecond() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void ValidatInputThird() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int[] selected = new int[3];
        for (int i = 0; i < selected.length; i++) {
            selected[i] = input.askInt("Enter menu:");
        }
        assertArrayEquals(selected, new int[]{1, 2, 3});
    }

    @Test
    public void ValidatInputFourth() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-3));
    }
}
package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void validatInputFirst() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"One", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void validatInputSecond() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void validatInputThird() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected, is(1));
        selected = input.askInt("Enter menu");
        assertThat(selected, is(2));
        selected = input.askInt("Enter menu");
        assertThat(selected, is(3));
    }

    @Test
    public void validatInputFourth() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-3));
    }
}
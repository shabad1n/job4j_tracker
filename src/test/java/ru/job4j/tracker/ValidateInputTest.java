package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void ValidatInputSecond() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"One", "-1", "0"}
        );
        ValidateInput input = new ValidateInput(out, in);
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new ExitProgramAction(out)
        };
        new StartUI(out).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Exit Program" + ln
                        + "Please enter validate data again." + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu:" + ln
                        + "0. Exit Program" + ln
                )
        );
    }
}
package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SumInRangeTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FuncInRange.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenFunctionLinear() {
        List<Double> result = FuncInRange.diapason(3, 5, x -> x);
        List<Double> expected = Arrays.asList(3D, 4D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenFunctionQuadrat() {
        List<Double> result = FuncInRange.diapason(3, 5, x -> x * x);
        List<Double> expected = Arrays.asList(9D, 16D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenFunctionExponent() {
        List<Double> result = FuncInRange.diapason(3, 5, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(8D, 16D);
        assertThat(result, is(expected));
    }

}
package ru.job4j.stream.flatmap;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;

public class UsFlatMapTest {

    @Test
    public void convertArrayToList() {
        Integer[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        List<Integer> result = UsFlatMap.flatmap(array);
        List<Integer> expected =  List.of(1, 2, 3, 4, 5, 6);
        Assert.assertThat(result, is(expected));
    }
}
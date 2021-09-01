package ru.job4j.sort;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Comparator;

public class JobTest {
    @Test
    public void whenJobByNameAsc() {
        Comparator<Job> cmpJobByName = new JobSortByNameAsc();
        int rsl = cmpJobByName.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobByNameDesc() {
        Comparator<Job> cmpJobByName = new JobSortByNameDesc();
        int rsl = cmpJobByName.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenJobByPriorityAsc() {
        Comparator<Job> cmpJobByPriority = new JobSortByPriorityAsc();
        int rsl = cmpJobByPriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobByPriorityDesc() {
        Comparator<Job> cmpJobByPriority = new JobSortByPriorityDesc();
        int rsl = cmpJobByPriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenJobByNameAscAndPrioriteDesc() {
        Comparator<Job> cmpJobByNameAndPriority = new JobSortByNameAsc().thenComparing(new JobSortByPriorityDesc());
        int rsl = cmpJobByNameAndPriority.compare(
                new Job("Fix", 1),
                new Job("Fix", 2)
        );
        assertThat(rsl, greaterThan(0));
    }
}
package ru.job4j.sort;

import java.util.Comparator;

public class JobSortByNameAsc implements Comparator<Job> {
    @Override
    public int compare(Job ferst, Job second) {
        return ferst.getName().compareTo(second.getName());
    }
}

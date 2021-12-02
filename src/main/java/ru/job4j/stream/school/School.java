package ru.job4j.stream.school;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }

    public Map<String, Student> convertListToMap(List<Student> list) {
        return list.stream()
                .collect(Collectors.toMap(Student::getSurname, student -> student,
                        (st1, st2) -> st1.getScore() >= st2.getScore() ? st1 : st2));
    }

}

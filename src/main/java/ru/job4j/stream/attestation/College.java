package ru.job4j.stream.attestation;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
       return students.keySet()
               .stream()
                .filter(student -> student.getAccount().equals(account))
                .findFirst();
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> s = findByAccount(account);
        Optional<Subject> rsl = Optional.empty();
        if (s.isPresent()) {
            rsl = students.get(s.get())
                    .stream()
                    .filter(subject -> subject.getName().equals(name))
                    .findFirst();
        }
        return rsl;
    }
}
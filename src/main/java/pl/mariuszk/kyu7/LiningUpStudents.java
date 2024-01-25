package pl.mariuszk.kyu7;

import java.util.Arrays;
import java.util.Comparator;

public class LiningUpStudents {

    public static String[] lineUpStudents(String students) {
        return Arrays.stream(students.split(" "))
                .sorted(Comparator.comparing(String::length).reversed().thenComparing(Comparator.reverseOrder()))
                .toArray(String[]::new);
    }
}

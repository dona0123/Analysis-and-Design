package ch10;

import java.util.Comparator;

public class ComparatorDesending implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // 내림차순이 되도록 구현
        return s2.compareTo(s1);

    }

}

package ch10;

import java.util.Comparator;

public class ComparatorAscending implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // 오름차순이 되도록 구현
        return s1.compareTo(s2);
    }

}

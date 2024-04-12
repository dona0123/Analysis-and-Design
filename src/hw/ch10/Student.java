package ch10;

// 비교 가능한 클래스가 되려면, Comparable 인터페이스를 구현해야 함
public class Student implements Comparable<Student> {

    // 속성 추가 
    String name; 
    String id; 
    int height; 

    // 생성자 추가 
    public Student() {

    }

    @Override
    public int compareTo(Student s) {
        // 키 기준으로 비교하도록 구현

    }
}

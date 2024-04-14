package ch10;

// 비교 가능한 클래스가 되려면, Comparable 인터페이스를 구현해야 함
public class Student implements Comparable<Student> {

    // 속성 추가
    String name;
    String id;
    int height;

    // 생성자 추가
    public Student(String name, String id, int height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    @Override
    // 키 기준으로 비교하도록 구현
    public int compareTo(Student s) {
        if (this.height > s.height) { // 현재 student의 키가 더 크면, 양수 리턴
            return 1;
        } else if (this.height < s.height) { // 인자로 들어온 student의 키가 더 크면, 음수 리턴
            return -1;
        } else { // 키가 같으면 0 리턴
            return 0;
        }
    }

    @Override
    // 학생들의 이름과 키 출력
    public String toString() {
        return "(이름: " + name + ", 학번: " + id + ", 키: " + height + ")";
    }
}

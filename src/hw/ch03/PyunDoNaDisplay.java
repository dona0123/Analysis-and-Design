package ch03;

public class PyunDoNaDisplay extends AbstractDisplay {

    // 멤버 선언
    String name;
    String studentId;
    int grade;

    // 생성자 작성
    public PyunDoNaDisplay(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    // 각 메소드 수정
    @Override
    public void open() {
        System.out.println("==================================");
        System.out.println("덕성여대 컴퓨터공학과");
    }

    @Override
    public void print() {
        System.out.println("학번 " + this.studentId + " / " + this.grade + "학년" + " / " + this.name);
    }

    @Override
    public void close() {
        System.out.println("템플릿메소드 숙제입니다.");
        System.out.println("==================================");
    }

}

package ch10;

import java.util.*;

class Main {
    public static void main(String[] args) {
        // Student 객체 5개 만들기 
        Student s1 = new Student("최승훈", "1", 190);
        Student s2 = new Student("편도나", "2", 180);
        Student s3 = new Student("권나래", "3", 170);
        Student s4 = new Student("남시윤", "4", 160);
        Student s5 = new Student("장현지", "5", 150);

        // Student 리스트로 변환 
        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);

        // 사전순으로 작은 순서
        // Comparator 인터페이스: compare 함수 1개만 선언되어 있음 
        // => Functional interface 라고 함 
        // Functional interface가 들어갈 자리에 람다 함수를 넣을 수 있다 (함수가 1개니까)


        System.out.println("<<20200551, 편도나>>");
        System.out.println("<<오름차순 정렬 결과>>");
        list.sort(new ComparatorAscending()); 
        System.out.println(list);

        // 사전식 순으로 큰 순서
        System.out.println("<<내림차순 정렬 결과>>");
        list.sort(new ComparatorDesending());
        System.out.println(list);
    }
}

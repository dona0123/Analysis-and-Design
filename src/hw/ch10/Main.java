package hw.ch10;

import java.util.*;

class Main {
    public static void main(String[] args) {
        // Student 객체 5개 만들기 

        // Student 리스트로 변환 
        List<Student> list = Arrays.asList("D", "B", "C", "E", "A");

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

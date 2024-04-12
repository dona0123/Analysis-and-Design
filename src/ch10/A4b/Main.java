package ch10.A4b;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서
        // Comparator 인터페이스: compare 함수 1개만 선언되어 있음 
        // => Functional interface 라고 함 
        // Functional interface가 들어갈 자리에 람다 함수를 넣을 수 있다 (함수가 1개니까)
        list.sort((a, b) -> a.compareTo(b)); // 람다 함수 => compare 함수임
        System.out.println(list);

        // 사전식 순으로 큰 순서
        list.sort((a, b) -> b.compareTo(a));
        System.out.println(list);
    }
}

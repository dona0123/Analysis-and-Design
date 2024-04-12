package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A"); // 원소를 리스트로 만듬

        // 사전순으로 작은 순서 (오름차순)
        // list.sort(): comparator의 compare를 호출해서 양수가 리턴되면 서로 위치를 바꿈 
        list.sort(new Comparator<String>() { // 익명의 내부 클래스 이용
            public int compare(String a, String b) {
                // 두 문자열의 크기를 비교해야 함
                return a.compareTo(b); // a 문자열이 b보다 크면 양수, 작으면 음수, 같으면 0이 리턴
            }
        }); // Comparator<String>의 compare()를 구현해야 함
        System.out.println(list);

        // 사전순으로 큰 순서 (내림차순)
        list.sort(new Comparator<String>() { // 익명의 내부 클래스 이용
            public int compare(String a, String b) {
                // 두 문자열의 크기를 비교해야 함
                // b가 더 크면 양수가 리턴됨 => a, b의 위치를 바꿈 => b가 앞으로 오게 됨 => 큰 게 앞으로 옴 => 내림차순 
                return b.compareTo(a); // a 문자열이 b보다 크면 양수, 작으면 음수, 같으면 0이 리턴
            }
        });
        System.out.println(list);
    }
}

package ch05.A2a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {

    // HashMap: Key와 value => ("ALPHA", "Triple("ALPHA") 객체), ... 
    private static Map<String,Triple> map = new HashMap<>();

    static { // 밑에 두 개는 static으로 선언됨 (클래스 로드 시 실행)
        String[] names = { "ALPHA", "BETA", "GAMMA" };
        Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
        // stream: 배열에 있는 걸 하나씩 꺼내옴
        // forEach: 배열에 있는 걸 하나씩 처리함
    }

    private String name;

    private Triple(String name) {
        System.out.println("The instance " + name + " is created.");
    }

    public static Triple getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

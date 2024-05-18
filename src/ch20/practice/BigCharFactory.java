package ch20.practice;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    // 이미 만든 BigChar 인스턴스를 관리 
    private Map<String,BigChar> pool = new HashMap<>(); // (key, value) 저장
    // Singleton 패턴 
    private static BigCharFactory singleton = new BigCharFactory();

    // 생성자 
    private BigCharFactory() {
    }

    // 유일한 인스턴스를 얻는다
    public static BigCharFactory getInstance() {
        return singleton;
    }

    // BigChar 인스턴스 생성(공유)
    public synchronized BigChar getBigChar(char charname) { // '1'
        // 이미 똑같은 BigChar가 생성되어 있는지 pool을 찾아봄 
        BigChar bc = pool.get(String.valueOf(charname)); // '1' -> "1"

        // 이전에 생성된 BigChar가 없다면 
        if (bc == null) {
            // 여기서 BigChar 인스턴스를 생성 (새로 만든다)
            bc = new BigChar(charname);
            // pool에 저장 
            pool.put(String.valueOf(charname), bc);
        }
        return bc;
    }
}

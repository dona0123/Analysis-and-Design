package ch07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<20200551, 편도나>>\n\n");

        // XMLBuilder 이용해서 문서 만들기
        XMLBuilder xb1 = new XMLBuilder();
        Director d1 = new Director(xb1);
        d1.construct();
        String result1 = xb1.geXMLResult(); // 빌더가 만든 최종 결과물을 얻어감
        System.out.println(result1);
    }
}
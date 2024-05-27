package ch07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        // TextBuilder를 이용해서 문서 만들기 
        TextBuilder tb1 = new TextBuilder();
        Director d1 = new Director(tb1);
        d1.construct();
        String result1 = tb1.getTextResult(); // 빌더가 만든 최종 결과물을 얻어감 
        System.out.println(result1);

        // HTMLBuilder를 이용해서 문서 만들기 
        HTMLBuilder hb1 = new HTMLBuilder(); 
        Director d2 = new Director(hb1);
        d2.construct();
        System.out.println(hb1.getHTMLResult() + " is created successfully");
}
} 
package ch20.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    // 문자의 이름 
    private char charname;
    // 큰 문자를 표현하는 문자열('#' '.' '\n'으로 이루어진 열)
    // 파일을 읽어서 가지고 있음 (메모리 로드)
    private String fontdata;

    // 생성자 
    public BigChar(char charname) { // '1'
        this.charname = charname;
        try {
            String filename = "big" + charname + ".txt"; // "big1.txt"
            StringBuilder sb = new StringBuilder();

            // Path.of(filename) -> 경로 객체 생성 
            // String 리스트 한줄씩 line에 저장 
            for (String line: Files.readAllLines(Path.of(filename))) {
                sb.append(line);
                sb.append("\n");
            }

            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    // 큰 문자를 표시한다
    public void print() {
        System.out.print(fontdata);
    }
}

package ch15.practice.pagemaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {

    // private 생성자 
    private Database() {

    }

    // 데이터베이스 이름에서 Properties를 얻는다 
    public static Properties getProperties(String dbname) // throws IOException { -> 메소드 호출한 쪽에 예외 처리를 맡김 
    {
        String filename = dbname + ".txt";

        // 키-값 쌍으로 구성된 속성 파일을 읽고 쓰는 데 사용되는 유틸리티 클래스
        Properties prop = new Properties();

        try {
            // 파일을 읽어서 Properties에 저장
            prop.load(new FileReader(filename));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        return prop;
    }
}

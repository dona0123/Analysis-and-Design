package ch15.practice.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            // 프로퍼티 파일로부터 사용자 이름 얻음
            Properties mailprop = Database.getProperties("maildata");

            // 키에 해당하는 값 반환
            String username = mailprop.getProperty(mailaddr);

            // 웰컴 페이지의 내용을 완성
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));

            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailaddr, username);
            writer.paragraph("by " + username);

            writer.close();

            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename) {
        try {
            // 프로퍼티 파일로부터 이메일 주소와 사용자 이름을 얻어오기
            Properties mailprop = Database.getProperties("maildata");


            // 메일 링크를 작성하기 
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));

            writer.title(filename);

            // 중복된 요소를 허용하지 않는 컬렉션
            Set<String> mailAddresses = mailprop.stringPropertyNames(); // 속성 파일에 저장된 모든 키를 Set<String> 형태로 반환

            for (String mailAddress : mailAddresses) {
                // 메일 주소 하나당 하나의 링크 생성 (이메일 주소, 사용자 이름)
                writer.mailto(mailAddress, mailprop.getProperty(mailAddress));
            }

            writer.close();

            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

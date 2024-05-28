package ch15.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import javax.xml.crypto.Data;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            // 프로퍼티 파일로부터 사용자 이름 얻음
            Properties mailprop = Database.getProperties("maildata");
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

            Set<String> mailAddresses = mailprop.stringPropertyNames();

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

    // 링크 페이지를 만드는 메소드
    public static void makeUrlPage(String filename) {
        try {
            // 프로퍼티 파일로부터 링크 주소 가져오기
            Properties urlProp = Database.getProperties("urldata");

            // URL 링크를 작성하기
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));

            // 타이틀 작성하기
            writer.title("url page", "편도나의 URL Page");

            // 집합으로 뽑아내기
            Set<String> urlSet = urlProp.stringPropertyNames();

            // 집합에 있는 링크 하나씩 작성하기
            for (String url : urlSet) {
                writer.link(urlProp.getProperty(url), url);
            }

            // 닫기
            writer.close();

            System.out.println(filename + " is created.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

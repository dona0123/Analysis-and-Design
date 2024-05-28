package ch15.practice;

import java.io.FileWriter;
import java.io.IOException;

import ch15.practice.pagemaker.HtmlWriter;
import ch15.practice.pagemaker.PageMaker;



public class Main {
    public static void main(String[] args) throws IOException {
        // HtmlWriter를 직접 이용 
        HtmlWriter writer = new HtmlWriter(new FileWriter("welcome2.html"));
        writer.title("Welcome2");
        writer.mailto("ehsk0123@naver.com", "pdn");
        writer.close();

        // 파사드 이용 
        PageMaker.makeWelcomePage("ehsk0123@naver.com", "welcome3.html");

        PageMaker.makeLinkPage("links.html");
    }
}

package ch02.A2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // 어뎁터 생성 
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("newfile.txt");
            f.setValue("name", "dona");
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

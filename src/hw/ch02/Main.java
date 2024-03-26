package ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("학번: 20200551, 이름: 편도나" + "\n");
        FileIO myFileIo = new FileProperties();

        try { // 내 이름 파일 만들기

            // file.txt에서 값을 읽어오기 
            myFileIo.readFromFile("file.txt");

            // 키와 값을 설정하기 
            myFileIo.setValue("Year", "2024");
            myFileIo.setValue("bornYear", "2002");
            myFileIo.setValue("StudendtId", "20200551");
            myFileIo.setValue("name", "Pyun Dona");
            myFileIo.setValue("Location", "Seoul");

            // pyundona.txt 파일을 생성하고 설정한 값을 적기 
            myFileIo.writeToFile("pyundona.txt");

            // 콘솔 메세지 출력하기 
            System.out.println("pyundona.txt is created.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

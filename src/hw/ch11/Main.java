package ch11;

public class Main {
    public static void main(String[] args) {
        // 디렉터리 객체 생성
        Directory mydocuments = new Directory("MyDocuments", "20240401", "DoNaPyun");
        Directory mydata = new Directory("MyData", "20240401", "DoNaPyun");
        Directory mypictures = new Directory("MyPictures", "20240401", "DoNaPyun");

        // MyDocuments 추가
        mydocuments.add(new File("편도나0.doc", "20240501", 1000, "DoNaPyun"));
        mydocuments.add(mydata);

        // MyData 추가
        mydata.add(new File("편도나1.doc", "20240501", 2000, "DoNaPyun"));
        mydata.add(new File("편도나2.java", "20240501", 3000, "DoNaPyun"));
        mydata.add(mypictures);

        // MyPictures 추가
        mypictures.add(new File("편도나3.gif", "20240601", 4000, "DoNaPyun"));
        mypictures.add(new File("편도나4.jpg", "20240601", 5000, "DoNaPyun"));
        mypictures.add(new File("편도나5.png", "20240601", 6000, "DoNaPyun"));

        // 출력하기 
        System.out.println("<<20200551, 편도나>>");
        mydocuments.printList();


    }
}

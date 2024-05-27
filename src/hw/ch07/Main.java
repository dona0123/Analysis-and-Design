package ch07;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<20200551, 편도나>>\n\n");

        // XMLBuilder 이용하기 
        XMLBuilder xb1 = new XMLBuilder();
        Director d1 = new Director(xb1);
        d1.construct();
        String result1 = xb1.geXMLResult(); // 빌더가 만든 최종 결과물을 얻어감
        System.out.println(result1);
    }
}
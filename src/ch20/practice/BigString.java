package ch20.practice;

public class BigString {
    // '큰 문자'의 배열
    private BigChar[] bigchars; // 배열 선언 
    // private Color[] colors; -> 컬러 정보는 BigString 클래스에 

    // 생성자 
    public BigString(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();

        bigchars = new BigChar[string.length()]; // 배열 생성 

        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 표시
    public void print() {
        for (BigChar bc: bigchars) {
            bc.print();
        }
    }
}

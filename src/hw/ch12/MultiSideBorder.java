package ch12;

public class MultiSideBorder extends Border {

    private char borderChar; // 장식 문자
    private int num; // 상하 장식 문자 수

    // 내용물이 될 Display와 장식 문자를 지정
    public MultiSideBorder(Display display, char ch, int num) {
        super(display);
        this.borderChar = ch;
        this.num = num;
    }

    @Override
    public int getColumns() {
        // 문자 수는 왼오 num*2만큼 더한 값
        return display.getColumns() + num * 2;
    }

    @Override
    public int getRows() {
        // 행수는 내용물의 행수와 같다
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // 지정 행의 내용은 내용물의 지정 행 양쪽에 장식 문자를 붙인 것
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.num; i++) {
            result.append(borderChar);
        }
        return result + display.getRowText(row) + result;
    }

}

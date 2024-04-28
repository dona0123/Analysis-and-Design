package ch12;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    // 표시 문자열 저장 장소
    private List<String> body = new ArrayList<>();
    // 표시 문자열 최대 문자 수 
    private int columns = 0;

    // 문자열 추가 
    public void add(String msg) {
        body.add(msg);
        updateColumns(msg); // 최대 문자 수 갱신
        updatePadding(); // 더 짧은 문자열 빈칸 채우기 
    }

    // 최대 문자 수 갱신
    private void updateColumns(String msg) {
        int length = calculateLength(msg);
        if (columns < length) {
            columns = length;
        }
    }

    // 문자열의 길이 계산 (한글 문자는 2칸으로 계산)
    private int calculateLength(String msg) {
        int length = 0;
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            // 한글 문자일 경우 2칸으로 계산
            if (Character.isLetter(c) && Character.UnicodeBlock.of(c) == Character.UnicodeBlock.HANGUL_SYLLABLES) {
                length += 2;
            } else {
                length += 1;
            }
        }
        return length;
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return body.get(row);
    }

    // 더 짧은 문자열 빈칸 채우기 
    // 표시 문자열 오른쪽 끝에 채울 공백을 필요에 따라 늘린다
    private void updatePadding() {
        for (int row = 0; row < body.size(); row++) {
            String line = body.get(row); // 문자열 하나 얻음 
            int padding = columns - calculateLength(line); // 제일 긴 문자열 길이와 비교 
            if (padding > 0) { // 현재 문자열이 더 짧으면 
                body.set(row, line + spaces(padding));
            }
        }
    }

    // count 수만큼의 공백을 만든다 
    private String spaces(int count) {
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < count; i++) {
            spaces.append(' ');
        }
        return spaces.toString();
    }
}

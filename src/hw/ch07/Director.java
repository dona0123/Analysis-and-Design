package ch07;

public class Director {
    // 지시할 Builder
    private Builder builder;

    // 생성자 (구체적인 Builder)
    public Director(Builder builder) {
        // 의존할(사용할) 객체를 외부에서 주입하는 게 좋음 -> 의존성 주입 (Dependency Injection, DI)
        this.builder = builder;
    }

    // 문서를 만드는 메소드
    public void construct() {
        // 제목 
        builder.makeTitle("Greeting");
        // 문자열
        builder.makeString("일반적인 인사");
        // 항목 
        builder.makeItems(new String[]{
            "How are you?",
            "Hello.",
            "Hi.",
            "안녕하세요"
        });

        // 문자열
        builder.makeString("시간대별 인사");
        // 항목 
        builder.makeItems(new String[]{
            "Good morning.",
            "Good afternoon.",
            "Good evening.",
            "좋은 아침"
        });

        // 닫기 
        builder.close();
    }
}

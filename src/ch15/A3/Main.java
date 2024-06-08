package ch15.A3;

public class Main {
    public static void main(String[] args) {
        String title = "Welcome!";
        String message = "Hello, world!";
        String html = """
        <!DOCTYPE html>
        <html>
            <head>
                <title>%s</title>
            </head>
            <body>
                <h1 style="text-align: center">%s</h1>
            </body>
        </html>
        """.formatted(title, message); // 순서 맞춰 넣어짐 
        

        System.out.print(html);


        // name 변수 여러 줄에 적용하기 
        String name = "pdn"; 

        String x = 
        """
        duksung
        women's 
        univ.
        My name is %s
        """.formatted(name); 

        System.out.print(x);
        
    }
}

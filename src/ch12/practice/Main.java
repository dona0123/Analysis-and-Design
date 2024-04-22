package ch12.practice;

public class Main {
    public static void main(String[] args) {
        Display sd1 = new StringDisplay("Hello"); 
        sd1.show();

        Display sb1 = new SideBorder(sd1, '*');
        sb1.show();

        Display sb2 = new SideBorder(sb1, '+'); 
        sb2.show();

        Display fb1 = new FullBorder(sb2);  
        fb1.show();

        Display fb2 = new FullBorder(fb1); 
        fb2.show();
    }
}

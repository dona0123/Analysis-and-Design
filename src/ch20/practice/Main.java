package ch20.practice;

public class Main {
    public static void main(String[] args) {
        // 1. BigChar를 직접 생성 
        BigChar bc1 = new BigChar('2'); 
        bc1.print();

        // 2. BigCharFactory를 통해 생성 
        BigCharFactory f1 = BigCharFactory.getInstance(); 
        BigChar bc2 = f1.getBigChar('1');
        bc2.print(); 

        BigChar bc3 = f1.getBigChar('1'); 
        bc3.print();

        // 두 객체의 주소는 같다 
        System.out.println(bc2);
        System.out.println(bc3);


        // 3. 명령행 인자로 전달받기 
        // 명령행 인자 검사 
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        } else if(args.length == 1) {
            BigString bs = new BigString(args[0]); 
            bs.print();
        }
    }
}

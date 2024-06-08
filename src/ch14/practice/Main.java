package ch14.practice;

public class Main {
    public static void main(String[] args) {
        Trouble t1 = new Trouble(77); 
        System.out.println(t1.getNumber()); 
        System.out.println(t1);

        // 서포터 생성 
        Support noSupport1 = new NoSupport("no"); 
        Support oddSupport1 = new OddSupport("odd"); 
        Support limitSupport1 = new LimitSupport("limit", 100); 
        Support specialSupport1 = new SpecialSupport("special", 55);

        // 사슬 형성 
        noSupport1.setNext(oddSupport1).setNext(specialSupport1).setNext(limitSupport1); 

        for(int i=0; i<200; i++){
            noSupport1.support(new Trouble(i));
        }
    }
}

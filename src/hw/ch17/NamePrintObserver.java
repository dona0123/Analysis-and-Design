package ch17;

// 관찰자 
public class NamePrintObserver implements Observer {

    // 관찰 대상자로부터 얻은 숫자만큼 이름 출력 
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("NamePrintObserver:");
        for (int i = 0; i < generator.getNumber(); i++) {
            System.out.print("편도나 "); 
        }
        System.out.println("\n");
    }
    
}

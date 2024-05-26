package ch22.drawer;

import ch22.command.Command;
import java.awt.Color;

// 붓의 색깔을 변경하는 커멘드 클래스 
public class ColorCommand implements Command {
    // 그리기 대상 
    protected Drawable drawable;
    // 그리기 색 
    private Color color;

    // 생성자 
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }

    // 실행 
    @Override
    public void execute() {
        // 실제 붓의 색깔을 변경함 
        drawable.setColor(color);
    }
}

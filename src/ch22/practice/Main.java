package ch22.practice;

import ch22.Sample.command.*;
import ch22.Sample.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    // 버튼 생성 
    private JButton clearButton = new JButton("clear");

    public static void main(String[] args) {
        new Main("command pattern sample");
        
    }

    // 생성자 
    public Main(String title) {
        super(title); 

        // 버튼 배치 (가로)
        Box buttBox = new Box(BoxLayout.X_AXIS);
        buttBox.add(clearButton); 

        // 메인 배치 (세로)
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttBox);

        // Pane에 부착 
        getContentPane().add(mainBox);

        this.setSize(500,500); 

        // pack(); // 사이즈 조절 
        setVisible(true);

    }
}

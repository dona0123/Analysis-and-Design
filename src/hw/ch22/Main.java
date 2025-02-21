package ch22;

import ch22.command.*;
import ch22.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements MouseMotionListener, WindowListener {
    // 그리기 이력
    private MacroCommand history = new MacroCommand();
    // 그리는 영역
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 삭제 버튼
    private JButton clearButton = new JButton("clear");
    // 빨간 버튼
    private JButton redButton = new JButton("red");
    // 초록 버튼
    private JButton greenButton = new JButton("green");
    // 파란 버튼
    private JButton blueButton = new JButton("blue");
    // 실행 취소 버튼(undo)
    private JButton undoButton = new JButton("undo");
    // 다시 실행 버튼(redo)
    private JButton redoButton = new JButton("redo");

    // 생성자
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.init();
            canvas.repaint();
        });
        redButton.addActionListener(e -> {
            // ColorCommand 객체 생성해서 히스토리에 추가 
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);

            // ColorCommand 실행 (붓의 색깔 변경)
            cmd.execute();
        });
        greenButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);
            cmd.execute();
        });
        blueButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.blue);
            history.append(cmd);
            cmd.execute();
        });
        undoButton.addActionListener(e -> {
            history.undo(); // 히스토리에서 맨 위 커맨드 객체를 제거 
            canvas.repaint(); // 다시 그림 
        });
        redoButton.addActionListener(e->{
            history.redo();
            canvas.repaint();
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        buttonBox.add(undoButton);
        buttonBox.add(redoButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    // MouseMotionListener용
    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener용
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    public static void main(String[] args) {
        new Main("편도나: Command Pattern Sample");
    }
}

package ch22.practice;

import ch22.practice.command.*;
import ch22.practice.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener{
public class Main extends JFrame implements MouseMotionListener, WindowListener {
    // 버튼 생성
    private JButton clearButton = new JButton("clear");
    // 그리기 이력
    private MacroCommand history = new MacroCommand();
    // 도화지 생성
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    public static void main(String[] args) {
        new Main("편도나: command pattern sample");

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
        mainBox.add(canvas);

        // Pane에 부착
        getContentPane().add(mainBox);

        // this.setSize(500, 500);


        // 리스너 등록
        // 1. 어댑터 이용 
        // canvas.addMouseMotionListener(this);
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                // DrawCommand 객체 생성하여 history에 추가
                // 인자: (도화지, 이벤트가 생성된 위치)
                Command cmd = new DrawCommand(canvas, e.getPoint());

                // DrawCommand를 모으기
                history.append(cmd);

                // 그리기 (명령어 객체를 실행)
                cmd.execute();
            }
        });

        // 2. 람다 함수
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint();
        });

        // 3. 함수 연결 
        this.addWindowListener(this);


        pack(); // 사이즈 조절
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    // // 도화지 지우기
    // // history의 객체들 삭제
    // history.clear();
    // // 도화지 다시 그리기
    // // 화면을 지우고 paint() 호출
    // canvas.repaint();
    // }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // System.out.println(e.getX() + " " + e.getY());
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        // x버튼이 눌렸을 때
        System.out.println("종료됩니다.");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
        // - 버튼이 눌렸을 때
    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        // 포커스 받을 때
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // 포커스 안 받을 때
    }
}

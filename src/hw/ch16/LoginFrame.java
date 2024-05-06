package ch16;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueCheckbox checkMember;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueTextField textNumber;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    // Colleague를 생성하고 배치한 후에 표시한다
    public LoginFrame(String title) {
        super(title);

        // 배경색을 설정한다
        setBackground(Color.lightGray);

        // 레이아웃 매니저를 사용해 5×3 그리드를 만든다
        setLayout(new GridLayout(5, 3));

        // Colleague를 생성한다
        createColleagues();

        // 배치한다
        add(checkGuest);
        add(checkLogin);
        add(checkMember);
        add(new Label("Username:"));
        add(textUser);
        add(new Label(""));
        add(new Label("Password:"));
        add(textPass);
        add(new Label(""));
        add(new Label("주민등록번호:"));
        add(textNumber);
        add(new Label(""));
        add(buttonOk);
        add(buttonCancel);

        // 활성/비활성 초기 설정을 한다
        colleagueChanged();

        // textNumber에 KeyListener 추가
        // 주민번호 입력 조건
        textNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) { // 숫자 이외의 문자를 입력하면
                    // 경고창 띄우기
                    JOptionPane.showMessageDialog(null, "숫자를 입력하세요.", "경고", JOptionPane.WARNING_MESSAGE);

                    // 입력한 문자 삭제
                    String text = textNumber.getText();
                    int caretPosition = textNumber.getCaretPosition();
                    if (caretPosition > 0) {
                        text = text.substring(0, caretPosition);
                        textNumber.setText(text);
                        textNumber.setCaretPosition(caretPosition); // 삭제된 문자 이전 위치로 캐럿 이동
                    }
                    e.consume(); // 입력한 문자 소비하여 삭제
                }
            }
        });

        // 표시한다
        pack();
        setVisible(true);
    }

    // Colleague를 생성한다
    @Override
    public void createColleagues() {
        // CheckBox
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        checkMember = new ColleagueCheckbox("Member", g, false);

        // TextField
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        textNumber = new ColleagueTextField("", 10);

        // Button
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // Mediator를 설정한다
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        checkMember.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        textNumber.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // Listener 설정
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        checkMember.addItemListener(checkMember);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        textNumber.addTextListener(textNumber);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    // Colleage의 상태가 바뀌면 호출된다
    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) { // Guest 체크박스가 선택되었다면
            // 게스트 로그인
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            textNumber.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        } else if (checkMember.getState()) { // Member 체크박스가 선택되었다면
            textUser.setColleagueEnabled(true);
            memberChanged();
        } else { // 사용자 로그인
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    // Member 체크박스가 선택되었다면
    // 각 Colleage의 활성/비활성을 판정한다
    private void memberChanged() {
        if (textUser.getText().length() > 0) { // 사용자 이름이 입력되었다면
            {
                textPass.setColleagueEnabled(true);
            }
            if (textPass.getText().length() > 0) { // 비밀번호가 입력되었다면
                textNumber.setColleagueEnabled(true);
            }
            if (textNumber.getText().length() >= 13) { // 주민번호 13자리를 입력했다면
                buttonOk.setColleagueEnabled(true);
            }
        } else { // 사용자 이름과 패스워드가 비워져 있으면
            textPass.setColleagueEnabled(false);
            textNumber.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }

    }

    // textUser 또는 textPass의 변경이 있다
    // 각 Colleage의 활성/비활성을 판정한다
    private void userpassChanged() {
        if (textUser.getText().length() >= 4) { // 사용자 이름이 4개 이상 입력되었다면
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() >= 4) { // 비밀번호가 4개 이상 입력되었다면
                buttonOk.setColleagueEnabled(true);
            } else { // 비밀번호가 비워져 있다면
                buttonOk.setColleagueEnabled(false);
            }
        } else { // 사용자 이름이 비워져 있으면
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0); // 정상 종료
    }
}

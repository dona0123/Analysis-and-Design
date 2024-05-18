package ch22.practice.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command {
    // 명령의 배열 
    // 양쪽 끝의 원소를 추가/삭제 가능 
    private Deque<Command> commands = new ArrayDeque<>();

    // 실행 
    @Override
    public void execute() {
        for (Command cmd: commands) {
            cmd.execute();
        }
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) { // 무한 루프 방지 
            // 인자 오류 
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) { // 비어있지 않다면  
            commands.pop();
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
    }
}

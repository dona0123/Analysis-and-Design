package ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();
    // 삭제했던 명령어들을 보관
    private Deque<Command> commandsForRedo = new ArrayDeque<>();

    // 실행 
    @Override
    public void execute() {
        // 역순 반복자 얻기 
        Iterator<Command> iterator = commands.descendingIterator(); 
        while (iterator.hasNext()) {
            Command cmd = iterator.next();
            cmd.execute();
        }
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            commandsForRedo.push(commands.pop()); 
        }
    }

    // 삭제된 명령어 복구 
    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            commands.push(commandsForRedo.pop());
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
    }
}

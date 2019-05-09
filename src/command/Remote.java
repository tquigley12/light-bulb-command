package command;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    private Command buttonA;
    private Command buttonB;
    private Command buttonC;
    private Command buttonD;

    private List<Command> commands = new ArrayList<>();

    public void setButtonA(Command buttonA) {
        this.buttonA = buttonA;
    }

    public void setButtonB(Command buttonB) {
        this.buttonB = buttonB;
    }

    public void setButtonC(Command buttonC) {
        this.buttonC = buttonC;
    }

    public void setButtonD(Command buttonD) {
        this.buttonD = buttonD;
    }

    public void buttonAPressed() {
        buttonA.execute();
        commands.add(buttonA);
    }

    public void buttonBPressed() {
        buttonB.execute();
        commands.add(buttonB);
    }

    public void buttonCPressed() {
        buttonC.execute();
        commands.add(buttonC);
    }

    public void buttonDPressed() {
        buttonD.execute();
        commands.add(buttonD);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.remove(commands.size() - 1).undo();
        }
    }

}

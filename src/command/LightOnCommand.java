package command;

public class LightOnCommand implements Command {

    private SmartLightBulb light;

    public LightOnCommand(SmartLightBulb light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}

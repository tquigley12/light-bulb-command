package command;

public class LightOffCommand implements Command {

    private SmartLightBulb light;

    public LightOffCommand(SmartLightBulb light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}

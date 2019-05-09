package command;

public class ChangeColorCommand implements Command {

    private SmartLightBulb light;
    private String ledColor;
    private String previousColor;

    public ChangeColorCommand(SmartLightBulb light, String ledColor) {
        this.light = light;
        this.ledColor = ledColor;
    }

    @Override
    public void execute() {
        // In order to undo this change, we need to store the previous state
        previousColor = light.getColor();
        light.setColor(ledColor);
    }

    @Override
    public void undo() {
        light.setColor(previousColor);
    }
}

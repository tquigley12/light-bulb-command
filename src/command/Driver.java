package command;

public class Driver {

    public static void main(String[] args) {
        SmartLightBulb light = new SmartLightBulb();

        Command on = new LightOnCommand(light);
        Command off = new LightOffCommand(light);
        // Null object pattern
        Command none = new NoCommand();
        Command brighten = new BrightenLightCommand(light);
        Command color = new ChangeColorCommand(light, "Blue");

        Command dinner = new RomanticDinnerMacro(
                new Command[]{
                    new LightOnCommand(light),
                    new DimLightCommand(light),
                    new ChangeColorCommand(light, "Red")
                });

        Remote remote = new Remote();
        remote.setButtonA(dinner);
        remote.setButtonB(off);
        remote.setButtonC(color);
        remote.setButtonD(brighten);

        remote.buttonAPressed();
        remote.buttonCPressed();

        for (int i = 0; i < 4; i++) {
            remote.buttonDPressed();
        }

        remote.buttonBPressed();

        System.out.println("Begin undoing...");

        for (int i = 0; i < 10; i++) {
            remote.undo();
        }
    }
}

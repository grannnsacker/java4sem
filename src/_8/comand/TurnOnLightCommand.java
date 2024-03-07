package _8.comand;

public class TurnOnLightCommand implements Command{

    private final Light theLight;

    public TurnOnLightCommand(Light light){
        this.theLight=light;
    }
    @Override
    public void execute() {
        theLight.turnOn();
    }
}

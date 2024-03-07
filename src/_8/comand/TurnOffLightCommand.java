package _8.comand;

public class TurnOffLightCommand implements Command{

    private final Light theLight;

    public TurnOffLightCommand(Light light){
        this.theLight=light;
    }

    @Override
    public void execute(){
        theLight.turnOff();
    }

}

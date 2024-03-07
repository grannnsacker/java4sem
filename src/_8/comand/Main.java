package _8.comand;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();

        Command switchUp = new TurnOnLightCommand(light);
        Command switchDown = new TurnOffLightCommand(light);

        Switcher switcher = new Switcher(switchUp, switchDown);

        switcher.flipUp();
        switcher.flipDown();
    }
}

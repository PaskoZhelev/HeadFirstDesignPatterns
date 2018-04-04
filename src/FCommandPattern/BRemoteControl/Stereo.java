package FCommandPattern.BRemoteControl;

public class Stereo {

    public void on(){
        System.out.println("Stereo: Turned on");
    }

    public void off(){
        System.out.println("Stereo: Turned off");
    }

    public void setCD(){
        System.out.println("Stereo: CD set");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo: Volume set to " + volume);
    }
}

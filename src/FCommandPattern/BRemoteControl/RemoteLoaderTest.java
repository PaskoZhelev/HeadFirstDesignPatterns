package FCommandPattern.BRemoteControl;

public class RemoteLoaderTest {



    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Stereo stereo = new Stereo();

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, stereoOnWithCDCommand, stereoOffWithCDCommand);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }
}

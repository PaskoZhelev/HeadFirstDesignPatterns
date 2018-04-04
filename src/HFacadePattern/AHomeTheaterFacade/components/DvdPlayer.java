package HFacadePattern.AHomeTheaterFacade.components;

public class DvdPlayer {

    public void on(){
        System.out.println("[Dvd Player]: On");
    }

    public void play(String movie){
        System.out.println("[Dvd Player]: Movie - " + movie);
    }

    public void off(){
        System.out.println("[Dvd Player]: Off");
    }
}

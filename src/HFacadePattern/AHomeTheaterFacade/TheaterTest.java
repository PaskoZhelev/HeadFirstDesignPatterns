package HFacadePattern.AHomeTheaterFacade;

import HFacadePattern.AHomeTheaterFacade.components.DvdPlayer;
import HFacadePattern.AHomeTheaterFacade.components.PopcornPopper;
import HFacadePattern.AHomeTheaterFacade.components.Projector;
import HFacadePattern.AHomeTheaterFacade.components.Screen;

public class TheaterTest {

    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer,
                popcornPopper, projector, screen);

        homeTheaterFacade.watchMovie("Gladiator");
        System.out.println();
        
        homeTheaterFacade.endMovie();
    }

}

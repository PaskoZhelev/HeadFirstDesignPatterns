package HFacadePattern.AHomeTheaterFacade;

import HFacadePattern.AHomeTheaterFacade.components.DvdPlayer;
import HFacadePattern.AHomeTheaterFacade.components.PopcornPopper;
import HFacadePattern.AHomeTheaterFacade.components.Projector;
import HFacadePattern.AHomeTheaterFacade.components.Screen;

public class HomeTheaterFacade {
    DvdPlayer dvdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, PopcornPopper popcornPopper, Projector projector, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        popcornPopper.on();
        popcornPopper.pop();
        projector.on();
        projector.wideScreenMode();
        screen.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        popcornPopper.off();
        projector.off();
        screen.off();
        dvdPlayer.off();
    }
}

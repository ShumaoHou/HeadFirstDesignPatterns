package facade;

/**
 * 家庭影院外观
 * @author Shumao
 * @date 2019/3/2 10:05
 */
public class HomeTheaterFacade {
    DvdPlayer mDvdPlayer;
    Screen mScreen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Screen screen) {
        mDvdPlayer = dvdPlayer;
        mScreen = screen;
    }

    public void watchMovie() {
        mScreen.down();
        mDvdPlayer.on();
    }

    public void endMovie() {
        mScreen.up();
        mDvdPlayer.off();
    }
}

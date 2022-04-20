package com.BookMyShow;

import java.util.HashMap;
import java.util.List;

public class Theater {
    String TheaterName;
    List<Screen> screens;
    int amountCollected;

    public Theater(String theaterName, List<Screen> screens, int amountCollected) {
        TheaterName = theaterName;
        this.screens = screens;
        this.amountCollected = amountCollected;
    }

    public Theater() {

    }

    public String getTheaterName() {
        return TheaterName;
    }

    public void setTheaterName(String theaterName) {
        TheaterName = theaterName;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public int getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(int amountCollected) {
        this.amountCollected = amountCollected;
    }
}

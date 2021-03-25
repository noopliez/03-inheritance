package ohm.softa.a03;

import java.util.logging.Logger;

public abstract class State {

    public Logger logger;

    private int time = 0;
    private final int duration;

    State(int duration) {
        this.duration = duration;
    }

    public int getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }

    State tick(Cat c) {
        return null;
    }

    abstract State successor(Cat cat);
}

package ohm.softa.a03;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public abstract class State {

    public Logger logger = LogManager.getLogger();
    ;

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
        time += 1;

        return successor(c);
    }

    abstract State successor(Cat cat);
}

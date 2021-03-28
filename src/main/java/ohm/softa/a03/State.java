package ohm.softa.a03;

import org.apache.logging.log4j.Logger;

public abstract class State {
    protected Logger logger;
    private int time;
    private final int duration;

    public State(int duration) {
        this.duration = duration;
    }

    final State tick(Cat cat) {
        return null;
    }

    abstract State successor(Cat cat);

    public int getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }
}

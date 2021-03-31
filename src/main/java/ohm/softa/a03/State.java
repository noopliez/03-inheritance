package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    protected static Logger logger = LogManager.getLogger();

    private int time = 0;
    private final int duration;

    public State(int duration) {
        this.duration = duration;
    }

    final State tick(Cat cat) {

        logger.info("tick()");
        time = time + 1;

        return (time < duration) ? this : this.successor(cat);
    }

    abstract State successor(Cat cat);

    public int getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }
}

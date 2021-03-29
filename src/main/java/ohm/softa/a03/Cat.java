package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat {

    private static final Logger logger = LogManager.getLogger();

    private State currentState;

    private final int sleep, awake, digest;

    private final String name;

    public Cat(String name, int sleep, int awake, int digest) {
        this.name = name;
        this.sleep = sleep;
        this.awake = awake;
        this.digest = digest;

        currentState = new SleepingState(sleep);
    }


    public void feed() {
        if (!isHungry())
            throw new IllegalStateException("Can't stuff a cat...");

        logger.info("You feed the cat...");

        /*
        TODO
        state = new DigestingState();
        */
    }

    /*
    TODO
    public void tick() {  state = state.duration ?????  }
    */

    public int getSleep() {

        return sleep;
    }

    public int getDigest() {

        return digest;
    }

    public int getAwake() {

        return awake;
    }

    public String getName() {

        return name;
    }

    public boolean isAsleep() {

        return currentState instanceof SleepingState;
    }

    public boolean isPlayful() {

        return currentState instanceof PlayfulState;
    }

    public boolean isHungry() {

        return currentState instanceof HungryState;
    }

    public boolean isDigesting() {

        return currentState instanceof DigestingState;
    }

    public boolean isDead() {

        return currentState instanceof DeathState;
    }
}

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
    public void tick() {    }
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
        return true;
    }

    public boolean isPlayful() {
        return true;
    }

    public boolean isHungry() {
        return true;
    }

    public boolean isDigesting() {
        return true;
    }

    public boolean isDead() {
        return true;
    }
}

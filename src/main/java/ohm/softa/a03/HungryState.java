package ohm.softa.a03;

public class HungryState extends State {

    HungryState(int duration) {
        super(duration);
    }

    public State feed(Cat cat) {
        logger.info("Lecker futtern ...");
        return new DigestingState(cat.getDigest());
    }

    @Override
    public State successor(Cat cat) {
        logger.info("I've been starving for a too long time...");
        return new DeathState();
    }
}

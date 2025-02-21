package ohm.softa.a03;

public class HungryState extends State {

    public HungryState(int duration) {
        super(duration);
    }

    State feed(Cat cat) {
        logger.info("You feed the cat...");

        return new DigestingState(cat.getDigest());
    }

    @Override
    State successor(Cat cat) {
        logger.info("I've starved for a too long time...good bye...");

        return new DeathState(-1);
    }
}

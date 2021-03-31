package ohm.softa.a03;

public class DigestingState extends State {

    private final int remainingAwake;

    public DigestingState(int duration, int remainingAwake) {
        super(duration);

        this.remainingAwake = remainingAwake;
    }

    @Override
    State successor(Cat cat) {
        logger.info("Getting in a playful mood!");

        return new PlayfulState(remainingAwake - getTime());
    }
}

package ohm.softa.a03;

public class SleepingState extends State {

    SleepingState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        logger.info("Zeit zu futtern");

        return new HungryState(cat.getAwake());
    }
}

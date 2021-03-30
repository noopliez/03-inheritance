package ohm.softa.a03;

public class HungryState extends State {

    public HungryState(int duration) {
        super(duration);
    }

    State feedCat(Cat cat) {
        return null;
    }

    @Override
    State successor(Cat cat) {
        return null;
    }
}

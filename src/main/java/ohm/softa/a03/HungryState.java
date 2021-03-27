package ohm.softa.a03;

public class HungryState extends State{

    HungryState(int duration){
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        logger.info("I've been starving for a too long time...");
        return new DeathState();
    }
}

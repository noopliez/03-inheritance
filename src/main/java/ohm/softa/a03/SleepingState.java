package ohm.softa.a03;

public class SleepingState extends State{

    SleepingState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        logger.info("Yoan... getting hungry!");
        //Was gibt der successor zurück??? Na logo nen neuen Zustand
        return null;
    }
}

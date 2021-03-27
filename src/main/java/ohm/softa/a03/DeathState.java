package ohm.softa.a03;

public class DeathState extends State {

    DeathState(){
        super (0);
    }

    @Override
    State successor(Cat cat) {
        logger.info("My time is over :(");
        return this;
    }
}

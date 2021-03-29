package ohm.softa.a03;

public class DigestingState extends State{

    DigestingState(int duration){
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        logger.info("Zu viel gefuttert ...");

        return new PlayfulState(cat.getDigest());
    }
}

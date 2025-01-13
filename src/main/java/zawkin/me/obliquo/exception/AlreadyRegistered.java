package zawkin.me.obliquo.exception;

public class AlreadyRegistered extends RuntimeException {
    public AlreadyRegistered(String message) {
        super(message);
    }
}

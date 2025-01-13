package zawkin.me.obliquo.exception;

public class UsernameOrPasswordWrong extends RuntimeException {
    public UsernameOrPasswordWrong(String message) {
        super(message);
    }
}

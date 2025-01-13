package zawkin.me.obliquo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AlreadyRegistered.class)
    public ResponseEntity<String> handleAlreadyRegistered(Exception e){
       return new ResponseEntity<>(e.getMessage(), HttpStatus.FOUND);
    }
}

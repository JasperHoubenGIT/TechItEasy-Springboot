package techItEasy.techItEasy.Exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class RecordNotFoundException {

    @ControllerAdvice
    public class ExceptionController {
        @ExceptionHandler(value = RecordNotFoundException.class)
        public ResponseEntity<Object> exception(RecordNotFoundException exception) {
            return new ResponseEntity<>(exception.getClass(), HttpStatus.NOT_FOUND);
        }
    }

}

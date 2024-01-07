package com.example.projet11.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ActeurExceptionController {
    @ExceptionHandler(value = ActeurNotfoundException.class)
    public ResponseEntity<Object> exception(ActeurNotfoundException exception){
        return  new ResponseEntity<>("Acteur not found", HttpStatus.NOT_FOUND);
    }
}

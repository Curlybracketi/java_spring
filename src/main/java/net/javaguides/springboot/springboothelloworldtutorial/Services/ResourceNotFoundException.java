package net.javaguides.springboot.springboothelloworldtutorial.Services;

import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ResourceNotFoundException extends Throwable {
    public ResourceNotFoundException(Strings)
    @ResponseStatus
    public class ResourceNotFoundException<L> extends RuntimeException {

        private static final long serialVersionUID = 1 L;

        public ResourceNotFoundException(String message) {
            super(message);
        }

        public ResourceNotFoundException(String message, Throwable throwable) {
            super(message, throwable);
        }
    }
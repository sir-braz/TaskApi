package com.backend.api.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class BackendException extends ResponseStatusException {
    public BackendException(String message) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }
}

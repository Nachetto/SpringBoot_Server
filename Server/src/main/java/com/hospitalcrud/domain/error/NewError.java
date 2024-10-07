package com.hospitalcrud.domain.error;

import java.io.IOError;

public class NewError extends IOError {
    public NewError(String message) {
        super(message);
    }
}

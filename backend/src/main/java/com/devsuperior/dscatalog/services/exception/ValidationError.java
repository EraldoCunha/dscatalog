package com.devsuperior.dscatalog.services.exception;

import com.devsuperior.dscatalog.resources.exceptions.StandardError;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    @Serial
    private static final long serialVersionUID = 1L;

    private List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message){
        errors.add(new FieldMessage(fieldName, message));
    }
}

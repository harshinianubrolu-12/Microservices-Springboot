package com.eazybytes.accounts.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("Resource %s not found for field %s and value %s", resourceName, fieldName, fieldValue));
    }

}

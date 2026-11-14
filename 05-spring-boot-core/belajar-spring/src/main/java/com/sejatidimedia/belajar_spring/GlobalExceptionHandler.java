package com.sejatidimedia.belajar_spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

// 1. @RestControllerAdvice menangkap semua error di seluruh controller aplikasi
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 2. Tangkap khusus IllegalArgumentException yang dilempar oleh ProdukService
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handleNotFound(IllegalArgumentException ex) {

        // Kembalikan response JSON rapi dengan HTTP Status 404 Not Found
        Map<String, Object> body = Map.of(
                "status", 404,
                "error", "Not Found",
                "message", ex.getMessage());

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}
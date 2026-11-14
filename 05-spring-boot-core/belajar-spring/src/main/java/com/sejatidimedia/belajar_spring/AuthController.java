package com.sejatidimedia.belajar_spring;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Tag(name = "Autentikasi", description = "Endpoint untuk Login dan Mendapatkan Token JWT")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public record LoginRequest(String username, String password) {
    }

    @Operation(summary = "Login untuk mendapatkan Token JWT")
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginRequest request) {
        // Simulasi validasi kredensial (di masa depan dicek ke tabel user)
        if ("admin".equals(request.username()) && "rahasia123".equals(request.password())) {

            // Generate token sakti!
            String token = jwtUtil.generateToken(request.username(), "ADMIN");

            return Map.of(
                    "status", "success",
                    "message", "Login Berhasil!",
                    "token", token,
                    "type", "Bearer");
        }

        throw new IllegalArgumentException("Username atau password salah!");
    }
}
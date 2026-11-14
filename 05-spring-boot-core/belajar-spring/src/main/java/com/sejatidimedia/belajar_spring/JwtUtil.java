package com.sejatidimedia.belajar_spring;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
public class JwtUtil {

    // Kunci Rahasia Server (Wajib minimal 256-bit / 32 karakter untuk algoritma
    // HS256)
    // Di aplikasi produksi, kunci ini disimpan di environment variable (bukan
    // hardcoded)
    private static final String SECRET_STRING = "RahasiaKunciSuperAmanSpringSecurityBackend2026";
    private static final SecretKey SECRET_KEY = Keys.hmacShaKeyFor(SECRET_STRING.getBytes(StandardCharsets.UTF_8));

    // Masa berlaku token: 24 Jam (dalam milidetik)
    private static final long EXPIRATION_TIME = 1000 * 60 * 60 * 24;

    // 1. GENERATE TOKEN: Membuat tiket JWT untuk user yang berhasil login
    public String generateToken(String username, String role) {
        return Jwts.builder()
                .subject(username) // Siapa pemiliknya
                .claim("role", role) // Informasi tambahan (Role)
                .issuedAt(new Date()) // Tanggal dibuat
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) // Tanggal kedaluwarsa
                .signWith(SECRET_KEY) // Tanda tangani dengan kunci rahasia server
                .compact();
    }

    // 2. EXTRACT USERNAME: Membaca nama user dari dalam token
    public String extractUsername(String token) {
        return getClaims(token).getSubject();
    }

    // 3. VALIDATE TOKEN: Memeriksa apakah token sah dan belum kedaluwarsa
    public boolean validateToken(String token) {
        try {
            return !isTokenExpired(token);
        } catch (Exception e) {
            return false; // Token rusak, dimanipulasi, atau tanda tangan tidak cocok
        }
    }

    private boolean isTokenExpired(String token) {
        return getClaims(token).getExpiration().before(new Date());
    }

    private Claims getClaims(String token) {
        return Jwts.parser()
                .verifyWith(SECRET_KEY)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}
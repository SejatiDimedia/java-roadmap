package com.sejatidimedia.belajar_spring;

import org.springframework.stereotype.Service;
// Anotasi @Service memberitahu Spring Boot:
// "Tolong daftarkan class ini sebagai Spring Bean di IoC Container!"

@Service
public class ProfilService {
    public HelloController.ProfilUser ambilDataProfil() {
        return new HelloController.ProfilUser(1L, "Timur Dian Radha Sejati", "Fullstack / Backend Developer");
    }

    public String generateSapaan(String nama) {
        if ("admin".equalsIgnoreCase(nama)) {
            return "Selamat datang, Yang Mulia Administrator! 👑";
        }
        return "Halo " + nama + ", senang bertemu denganmu di Spring Boot!";
    }
}

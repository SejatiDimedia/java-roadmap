package com.sejatidimedia.belajar_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    public record ProfilUser(Long id, String nama, String role) {
    }

    // 1. Deklarasikan dependency ke Service
    private final ProfilService profilService;

    // 2. CONSTRUCTOR INJECTION: Spring Boot otomatis mencari ProfilService dan
    // menyuntikkannya ke sini!
    public HelloController(ProfilService profilService) {
        this.profilService = profilService;
    }

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Halo! Ini adalah REST API pertamaku dengan Spring Boot 🚀";
    }

    // 3. Controller mendelegasikan tugas ke Service
    @GetMapping("/api/profil")
    public ProfilUser getProfil() {
        return profilService.ambilDataProfil();
    }

    @GetMapping("/api/sapa")
    public Map<String, String> sapaNama(@RequestParam(defaultValue = "Kawan") String nama) {
        return Map.of(
                "status", "success",
                "pesan", profilService.generateSapaan(nama));
    }
}
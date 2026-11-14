package com.sejatidimedia.belajar_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final JwtFilter jwtFilter;

    public SecurityConfig(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // 1. Nonaktifkan CSRF karena REST API kita Stateless
            .csrf(csrf -> csrf.disable())

            // 2. Pastikan Spring Security tidak membuat session di server (Stateless)
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))

            // 3. Aturan Izin Akses Tiap URL:
            .authorizeHttpRequests(auth -> auth
                // A. Endpoint Publik (Bebas diakses tanpa login):
                .requestMatchers("/api/auth/**", "/swagger-ui/**", "/v3/api-docs/**", "/swagger-ui.html").permitAll()
                
                // B. Endpoint GET (Bebas membaca produk dan demo):
                .requestMatchers(HttpMethod.GET, "/api/produk/**", "/api/hello", "/api/profil", "/api/sapa").permitAll()

                // C. Endpoint Lain (POST/DELETE produk) WAJIB LOGIN bawa Token JWT:
                .anyRequest().authenticated()
            )

            // 4. Pasang satpam JwtFilter
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

package com.sejatidimedia.belajar_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BelajarSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringApplication.class, args);
	}

	// Bean ini akan otomatis dijalankan oleh Spring Boot SEKALI saja saat server
	// pertama kali menyala:
	@Bean
	public CommandLineRunner initData(ProdukRepository produkRepository) {
		return args -> {
			System.out.println("🌱 Mengisi data awal ke Database...");

			produkRepository.save(new Produk("Laptop ASUS ROG", 22500000.0, 5));
			produkRepository.save(new Produk("Mouse Logitech Wireless", 350000.0, 20));
			produkRepository.save(new Produk("Keyboard Mechanical RGB", 750000.0, 12));

			System.out.println("✅ Data awal berhasil tersimpan di Database!");
		};
	}
}
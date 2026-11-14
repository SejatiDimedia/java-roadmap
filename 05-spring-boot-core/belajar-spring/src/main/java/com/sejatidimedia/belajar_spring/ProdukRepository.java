package com.sejatidimedia.belajar_spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Cukup buat INTERFACE! Spring Data JPA otomatis membuatkan seluruh fungsi CRUD:
// save(), findAll(), findById(), deleteById() tanpa kita tulis satu pun!
@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {
}
package com.sejatidimedia.belajar_spring;

import jakarta.persistence.*;

// 1. @Entity memberitahu Hibernate untuk membuatkan tabel "produk" di database!
@Entity
@Table(name = "produk")
public class Produk {

    // 2. @Id dan @GeneratedValue = Primary Key Auto-Increment (1, 2, 3...)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nama;

    private Double harga;
    private Integer stok;

    // Constructor Kosong (Wajib ada untuk JPA/Hibernate)
    public Produk() {
    }

    // Constructor Praktis
    public Produk(String nama, Double harga, Integer stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // --- GETTER & SETTER ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
}
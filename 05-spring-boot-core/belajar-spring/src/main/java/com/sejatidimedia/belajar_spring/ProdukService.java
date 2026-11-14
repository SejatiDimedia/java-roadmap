package com.sejatidimedia.belajar_spring;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdukService {

    // 1. Inject Repository via Constructor
    private final ProdukRepository produkRepository;

    public ProdukService(ProdukRepository produkRepository) {
        this.produkRepository = produkRepository;
    }

    // 2. CREATE / UPDATE (Simpan ke Database)
    public Produk simpanProduk(Produk produk) {
        if (produk.getHarga() <= 0) {
            throw new IllegalArgumentException("Harga tidak boleh nol atau minus!");
        }
        // Method sakti bawaan JPA: .save() otomatis melakukan SQL INSERT!
        return produkRepository.save(produk);
    }

    // 3. READ (Ambil Semua Data)
    public List<Produk> ambilSemuaProduk() {
        // Method sakti bawaan JPA: .findAll() otomatis melakukan SQL SELECT * FROM
        // produk!
        return produkRepository.findAll();
    }

    // 4. READ (Ambil berdasarkan ID)
    public Produk ambilProdukById(Long id) {
        return produkRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Produk dengan ID " + id + " tidak ditemukan!"));
    }

    // 5. DELETE (Hapus Data)
    public void hapusProduk(Long id) {
        produkRepository.deleteById(id);
    }
}
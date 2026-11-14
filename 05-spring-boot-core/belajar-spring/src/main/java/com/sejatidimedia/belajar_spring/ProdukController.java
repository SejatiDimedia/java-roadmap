package com.sejatidimedia.belajar_spring;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@Tag(name = "Katalog Produk", description = "Manajemen data produk toko online (CRUD)")
@RestController
@RequestMapping("/api/produk")
public class ProdukController {

    private final ProdukService produkService;

    public ProdukController(ProdukService produkService) {
        this.produkService = produkService;
    }

    @Operation(summary = "Ambil semua daftar produk", description = "Mengembalikan seluruh produk yang tersimpan di database")
    @GetMapping
    public List<Produk> getAllProduk() {
        return produkService.ambilSemuaProduk();
    }

    @Operation(summary = "Ambil produk berdasarkan ID", description = "Mengembalikan 404 jika produk tidak ditemukan")
    @GetMapping("/{id}")
    public Produk getProdukById(@PathVariable Long id) {
        return produkService.ambilProdukById(id);
    }

    @Operation(summary = "Tambah produk baru ke database")
    @PostMapping
    public Produk createProduk(@RequestBody Produk produk) {
        return produkService.simpanProduk(produk);
    }

    @Operation(summary = "Hapus produk berdasarkan ID")
    @DeleteMapping("/{id}")
    public Map<String, String> deleteProduk(@PathVariable Long id) {
        produkService.hapusProduk(id);
        return Map.of("status", "success", "message", "Produk berhasil dihapus!");
    }
}
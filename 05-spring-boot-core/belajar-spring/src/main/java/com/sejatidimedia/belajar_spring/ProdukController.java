package com.sejatidimedia.belajar_spring;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/produk") // Semua endpoint di class ini diawali dengan /api/produk
public class ProdukController {

    private final ProdukService produkService;

    public ProdukController(ProdukService produkService) {
        this.produkService = produkService;
    }

    // GET /api/produk -> Mengambil semua produk
    @GetMapping
    public List<Produk> getAllProduk() {
        return produkService.ambilSemuaProduk();
    }

    // GET /api/produk/{id} -> Mengambil produk berdasarkan ID
    @GetMapping("/{id}")
    public Produk getProdukById(@PathVariable Long id) {
        return produkService.ambilProdukById(id);
    }

    // POST /api/produk -> Membuat produk baru (menerima JSON payload dari request
    // body)
    @PostMapping
    public Produk createProduk(@RequestBody Produk produk) {
        return produkService.simpanProduk(produk);
    }

    // DELETE /api/produk/{id} -> Menghapus produk
    @DeleteMapping("/{id}")
    public Map<String, String> deleteProduk(@PathVariable Long id) {
        produkService.hapusProduk(id);
        return Map.of("status", "success", "message", "Produk berhasil dihapus!");
    }
}
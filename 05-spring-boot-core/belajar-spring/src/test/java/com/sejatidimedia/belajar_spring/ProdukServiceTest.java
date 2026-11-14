package com.sejatidimedia.belajar_spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// 1. Mengaktifkan Mockito di JUnit 5
@ExtendWith(MockitoExtension.class)
public class ProdukServiceTest {

    // 2. Buat Repository tiruan (Mock)
    @Mock
    private ProdukRepository produkRepository;

    // 3. Suntikkan Repository tiruan ke dalam Service asli
    @InjectMocks
    private ProdukService produkService;

    // --- TEST CASE 1: Uji Sukses Simpan Produk ---
    @Test
    public void testSimpanProduk_Sukses() {
        // GIVEN: Siapkan data uji coba
        Produk produkInput = new Produk("Monitor Gaming", 3500000.0, 10);
        Produk produkHasilSimpan = new Produk("Monitor Gaming", 3500000.0, 10);
        produkHasilSimpan.setId(1L);

        // Atur sandiwara: jika save() dipanggil, kembalikan produkHasilSimpan
        when(produkRepository.save(produkInput)).thenReturn(produkHasilSimpan);

        // WHEN: Jalankan method yang ingin diuji
        Produk hasil = produkService.simpanProduk(produkInput);

        // THEN: Pastikan hasilnya sesuai harapan (Assertions)
        assertNotNull(hasil.getId()); // ID tidak boleh null
        assertEquals("Monitor Gaming", hasil.getNama()); // Nama harus sama
        assertEquals(3500000.0, hasil.getHarga());

        // Pastikan repository.save() benar-benar dipanggil tepat 1 kali
        verify(produkRepository, times(1)).save(produkInput);
    }

    // --- TEST CASE 2: Uji Validasi Harga Tidak Boleh Minus ---
    @Test
    public void testSimpanProduk_GagalKarenaHargaMinus() {
        // GIVEN: Produk dengan harga minus
        Produk produkRusak = new Produk("Barang Ilegal", -5000.0, 10);

        // WHEN & THEN: Pastikan method melempar IllegalArgumentException!
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            produkService.simpanProduk(produkRusak);
        });

        // Pastikan pesan errornya sesuai
        assertEquals("Harga tidak boleh nol atau minus!", exception.getMessage());

        // Pastikan repository.save() SAMA SEKALI TIDAK PERNAH DIPANGGIL (karena sudah
        // dicegat validasi)
        verify(produkRepository, never()).save(any());
    }
}
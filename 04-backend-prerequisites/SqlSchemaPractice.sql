-- 1. Tabel kategori (id PK, nama_kategori)
CREATE TABLE kategori (
    id INT PRIMARY KEY,
    nama_kategori VARCHAR(50)
);

-- 2. Tabel produk (id PK, kategori_id FK, nama_produk, harga)
CREATE TABLE produk (
    id INT PRIMARY KEY,
    kategori_id INT,
    nama_produk VARCHAR(100),
    harga DECIMAL(10, 2),
    FOREIGN KEY (kategori_id) REFERENCES kategori(id)
);

-- 3. Insert 1 data ke kategori
INSERT INTO kategori (id, nama_kategori) VALUES (1, 'Buku');


-- 4. Insert 1 data ke produk
INSERT INTO produk (id, kategori_id, nama_produk, harga) VALUES (1, 1, 'Buku Sejarah', 50000.0);


-- 5. Query SELECT dengan INNER JOIN untuk menampilkan nama_produk dan nama_kategori
SELECT produk.nama_produk, kategori.nama_kategori FROM produk INNER JOIN kategori ON produk.kategori_id = kategori.id;
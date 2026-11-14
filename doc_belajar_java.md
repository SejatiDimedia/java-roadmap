# Kumpulan Prompt Belajar Java Backend + Spring Boot dengan AI

Dokumen ini berisi prompt siap pakai untuk belajar Java dan Spring Boot dibantu AI (Claude, ChatGPT, dll.). Bagian yang ditandai `[ ]` tinggal kamu isi.

---

## Daftar Isi

1. [Roadmap Singkat](#roadmap-singkat)
2. [Prinsip Belajar dengan AI](#prinsip-belajar-dengan-ai)
3. [Alur Belajar 7 Langkah](#alur-belajar-7-langkah)
4. [Prompt 0: Pembuka](#prompt-0-pembuka)
5. [Prompt 1: Peta Konsep](#prompt-1-peta-konsep)
6. [Prompt 2: Contoh Kecil](#prompt-2-contoh-kecil)
7. [Prompt 3: Minta Latihan](#prompt-3-minta-latihan)
8. [Prompt 4: Hint Bertahap](#prompt-4-hint-bertahap)
9. [Prompt 5: Review Kode](#prompt-5-review-kode)
10. [Prompt 6: Debugging Error](#prompt-6-debugging-error)
11. [Prompt 7: Jelaskan Balik (Feynman)](#prompt-7-jelaskan-balik-teknik-feynman)
12. [Prompt 8: Kuis dan Ujian](#prompt-8-kuis-dan-ujian)
13. [Prompt 9: Spaced Repetition](#prompt-9-spaced-repetition)
14. [Prompt 10: Kritik Rencana Proyek](#prompt-10-kritik-rencana-proyek)
15. [Prompt 11: Pendamping Proyek](#prompt-11-pendamping-proyek)
16. [Prompt 12: Delegasi Boilerplate](#prompt-12-delegasi-boilerplate)
17. [Prompt 13: Penutup Sesi](#prompt-13-penutup-sesi)
18. [Prompt 14: Review Mingguan](#prompt-14-review-mingguan)
19. [Prompt 15: Tes Diagnostik Awal](#prompt-15-tes-diagnostik-awal)
20. [Strategi GitHub](#strategi-github)
21. [Prompt 16: Setup Repo](#prompt-16-setup-repo)
22. [Prompt 17: Review Commit](#prompt-17-review-commit)
23. [Prompt 18: Buat README](#prompt-18-buat-readme)
24. [Prompt 19: Review PR Sendiri](#prompt-19-review-pr-sendiri)
25. [Prompt 20: Audit Portofolio GitHub](#prompt-20-audit-portofolio-github)
26. [Prompt 21: Bantuan Error Git](#prompt-21-bantuan-error-git)
27. [Cheat Sheet Penggunaan](#cheat-sheet-penggunaan)
28. [Tips Tambahan](#tips-tambahan)

---

## Roadmap Singkat

| Tahap | Topik | Estimasi |
|---|---|---|
| 1 | Dasar Java: sintaks, tipe data, kontrol alur, method, array, String | 4-6 minggu |
| 2 | OOP: class, object, encapsulation, inheritance, polymorphism, abstract class, interface, enum | 3-4 minggu |
| 3 | Java lanjutan: Collections, Generics, Exception, Lambda, Stream API, Optional, record, Maven/Gradle | 4 minggu |
| 4 | Pendukung backend: Git/GitHub, HTTP & REST, SQL, dasar JDBC, Postman | 3-4 minggu |
| 5 | Spring Boot inti: IoC/DI, Controller-Service-Repository, REST API, Spring Data JPA, validation, exception handling, DTO | 6-8 minggu |
| 6 | Keamanan & kualitas: Spring Security + JWT, JUnit 5, Mockito, Swagger/OpenAPI, Flyway | 4-5 minggu |
| 7 | Profesional: Docker, Redis, Kafka/RabbitMQ, CI/CD, microservices, deployment | bertahap |

**Proyek portofolio:**
- Setelah tahap 3: aplikasi konsol (manajemen perpustakaan)
- Setelah tahap 5: REST API Todo List dengan database
- Setelah tahap 6: REST API Toko Online/Blog dengan JWT, test, dan Swagger
- Tahap 7: proyek sebelumnya di-Docker-kan dan di-deploy

---

## Prinsip Belajar dengan AI

Hasil belajar terbaik muncul ketika **kamu berusaha dulu, baru dibantu AI**, bukan sebaliknya.

- **Active recall**: mengingat dan menghasilkan sendiri jauh lebih efektif daripada membaca.
- **Productive struggle**: bingung 10-20 menit saat mencoba sendiri membentuk pemahaman. Kalau AI langsung menjawab, proses ini hilang.
- **Illusion of competence**: membaca kode dari AI terasa mudah, tapi saat menghadapi layar kosong kamu blank. Ini jebakan terbesar.

**Aturan emas:** jangan biarkan AI menulis kode yang belum bisa kamu tulis dan jelaskan sendiri.

**Pembagian waktu ideal:** sekitar 70% kamu mengetik dan berpikir sendiri, 30% berinteraksi dengan AI.

**Peran AI berubah sesuai tahap:**

| Tahap | Peran AI | Porsi AI menulis kode |
|---|---|---|
| Java dasar & OOP | Guru + pemeriksa | Hampir nol |
| Java lanjutan, SQL | Mentor + reviewer | Sangat kecil |
| Spring Boot | Pendamping, boleh generate boilerplate setelah kamu paham | Sedang |
| Proyek nyata | Rekan kerja: debugging, desain, review | Lebih besar, tapi kamu tetap bisa menjelaskan setiap baris |

---

## Alur Belajar 7 Langkah

1. **Peta dulu (AI, 5-10 menit):** gambaran besar topik, belum ada kode.
2. **Contoh kecil (AI + kamu):** ketik ulang sendiri, jangan copy-paste. Ubah nilai, sengaja bikin error.
3. **Coba sendiri dulu (kamu):** kerjakan latihan tanpa AI, walau hasilnya jelek.
4. **Bantuan bertahap (AI):** minta hint 1, hint 2, solusi hanya sebagai pilihan terakhir.
5. **Review kode (AI):** cari bug, praktik buruk, dan cara yang lebih idiomatik.
6. **Jelaskan balik (kamu):** jelaskan dengan kata-katamu, minta AI mencari celahnya.
7. **Ulangi nanti (spaced repetition):** besok dan minggu depan, kerjakan ulang tanpa catatan.

---

## Prompt 0: Pembuka

Gunakan **sekali di awal chat**, atau simpan sebagai instruksi **Project**.

```text
Kamu adalah mentor Java Backend + Spring Boot untuk saya, seorang pemula. Gunakan Bahasa Indonesia, istilah teknis tetap bahasa Inggris dengan penjelasan singkat saat pertama muncul. Gunakan Java dan Spring Boot versi modern (LTS terbaru).

Prinsip yang WAJIB kamu pegang:
1. Tujuan saya memahami dan bisa menulis kode sendiri, bukan sekadar menyelesaikan tugas.
2. Jangan langsung memberi solusi penuh untuk latihan. Beri hint bertahap kecuali saya bilang "kasih solusi".
3. Jangan menulis kode yang belum pernah saya tulis sendiri, kecuali saya minta secara eksplisit.
4. Kalau saya salah, jelaskan KENAPA salah, bukan hanya versi benarnya.
5. Kalau kamu tidak yakin atau ada beberapa pendekatan, sebutkan trade-off-nya. Jangan mengarang.
6. Kalau saya terlihat hanya ingin cepat selesai tanpa paham, ingatkan saya.
7. Jika pertanyaan saya ambigu, ajukan maksimal 1 pertanyaan klarifikasi.
8. Fokus hanya pada Java backend (tanpa frontend, Android, atau topik non-Java).
9. Semua latihan dan proyek saya simpan di GitHub. Di akhir tiap latihan atau fitur, ingatkan saya untuk commit dan push, dan bantu saya menulis pesan commit yang baik (format Conventional Commits).

Profil saya: pemula Java, pengalaman programming [isi: tidak ada / sedikit di ___], waktu belajar [__ jam/hari, __ hari/minggu], target [mis. siap kerja sebagai Junior Java Backend Developer dalam __ bulan]. OS: [Windows/Mac/Linux], IDE: IntelliJ IDEA Community, JDK LTS terbaru.
Posisi saya sekarang: [mis. Tahap 2, topik inheritance].

Balas "siap" lalu tunggu instruksi saya.
```

---

## Prompt 1: Peta Konsep

Gunakan **sebelum belajar topik baru**.

```text
Saya akan belajar topik: [nama topik].
Berikan PETA KONSEP tanpa kode panjang, dengan struktur:
1. Apa itu dan masalah apa yang diselesaikannya
2. Analogi dunia nyata yang mudah dibayangkan
3. Kapan dipakai dan kapan TIDAK dipakai
4. Istilah-istilah kunci (maksimal 7) dengan definisi 1 kalimat
5. Keterkaitan dengan topik yang sudah saya pelajari: [topik sebelumnya]
6. Urutan sub-topik yang sebaiknya saya pelajari
Maksimal 300 kata. Di akhir, tanyakan 2 pertanyaan untuk mengecek pemahaman awal saya.
```

---

## Prompt 2: Contoh Kecil

```text
Untuk topik [topik], beri SATU contoh kode minimal (maksimal 20 baris) yang bisa saya jalankan.
- Beri komentar pada bagian penting
- Jelaskan alur eksekusinya baris per baris
- Lalu beri 3 eksperimen yang bisa saya lakukan sendiri (mengubah nilai, sengaja membuat error, dll.) beserta pertanyaan "menurutmu apa yang terjadi?" TANPA jawabannya dulu.
Saya akan mengetik ulang kode ini sendiri dan mencoba eksperimennya, lalu melaporkan hasilnya.
```

---

## Prompt 3: Minta Latihan

```text
Buatkan 3 latihan untuk topik [topik]:
- Mudah: 1 soal
- Sedang: 1 soal
- Tantangan: 1 soal yang menggabungkan topik sebelumnya
Setiap soal berisi: deskripsi, contoh input/output, dan kriteria selesai. JANGAN beri solusi maupun hint dulu. Saya akan mengerjakan sendiri dulu minimal 20 menit.
```

---

## Prompt 4: Hint Bertahap

Gunakan **saat buntu**. Mulai dari level 1.

**Level 1 (arah berpikir):**

```text
Saya buntu di latihan ini: [tempel soal].
Ini yang sudah saya coba: [jelaskan atau tempel kode].
Bagian yang membingungkan: [jelaskan].

Beri HINT LEVEL 1 saja: sebuah pertanyaan pemandu atau arah berpikir, tanpa kode. Saya akan minta level berikutnya jika masih buntu.
```

**Level 2 (konsep relevan):**

```text
Hint level 2: beri petunjuk lebih spesifik (konsep atau method yang relevan), tetap tanpa solusi penuh.
```

**Level 3 (kerangka solusi):**

```text
Hint level 3: tunjukkan kerangka solusi (pseudocode atau struktur class), tanpa isi lengkap.
```

**Level 4 (solusi penuh, pilihan terakhir):**

```text
Saya sudah mencoba [__ menit] dan menyerah. Beri solusi lengkap beserta penjelasan KENAPA ini cara yang baik dan apa kesalahan pola pikir saya. Lalu beri 1 soal serupa untuk saya kerjakan ulang tanpa melihat solusi.
```

---

## Prompt 5: Review Kode

Gunakan **setelah selesai menulis sesuatu**.

```text
Tolong review kode saya seperti senior developer mereview junior.
Konteks: [tujuan kode ini]
Kode:
[tempel kode]

Format review:
1. Apakah berjalan sesuai tujuan? (bug atau edge case yang terlewat)
2. Kesalahan konsep (jika ada) beserta penjelasannya
3. Praktik buruk atau code smell (penamaan, duplikasi, struktur)
4. Bagian yang sudah bagus (supaya saya tahu apa yang dipertahankan)
5. Maksimal 3 perbaikan prioritas. Jelaskan alasannya, tapi JANGAN tulis ulang seluruh kode. Beri petunjuk dan biarkan saya yang memperbaiki.
Setelah saya perbaiki, saya akan kirim ulang untuk review kedua.
```

---

## Prompt 6: Debugging Error

```text
Saya mendapat error. Jangan langsung beri perbaikan, ajari saya cara membacanya.

Error / stack trace:
[tempel lengkap]

Kode terkait:
[tempel kode]

Yang ingin saya lakukan: [tujuan]

Lakukan ini berurutan:
1. Tunjukkan baris stack trace mana yang paling penting dan kenapa
2. Jelaskan arti pesan error dalam bahasa sederhana
3. Beri 2-3 kemungkinan penyebab, urut dari yang paling mungkin
4. Beri cara memverifikasi tiap kemungkinan (print, debugger, cek config)
5. Baru setelah saya melapor hasilnya, bantu ke perbaikan
```

> Kebiasaan baik: baca error sendiri minimal 5 menit sebelum bertanya ke AI.

---

## Prompt 7: Jelaskan Balik (Teknik Feynman)

Gunakan **setelah selesai satu topik**.

```text
Saya akan menjelaskan konsep [topik] dengan kata-kata saya sendiri, seolah mengajar pemula.
Penjelasan saya:
[tulis penjelasanmu]

Tugasmu:
1. Beri tahu bagian yang benar
2. Tunjuk bagian yang keliru, kurang tepat, atau terlewat
3. Ajukan 2 pertanyaan "bagaimana kalau..." untuk menguji kedalaman pemahaman saya
4. Beri nilai 1-10 dan alasannya
Jangan menjelaskan ulang seluruh konsep, fokus pada celah di penjelasan saya.
```

---

## Prompt 8: Kuis dan Ujian

**Kuis harian:**

```text
Buat kuis [5] soal tentang [topik / tahap]. Campur: pilihan ganda, tebak output kode, dan temukan bug di potongan kode.
Aturan:
- Tampilkan SATU soal per pesan, tunggu jawaban saya
- Setelah saya jawab, beri umpan balik dan penjelasan, lalu lanjut ke soal berikutnya
- Di akhir, beri skor dan daftar konsep yang masih lemah
- Naikkan kesulitan jika saya benar terus, turunkan jika sering salah
```

**Ujian akhir tahap:**

```text
Buat ujian akhir Tahap [__]: [10] soal teori + 2 soal coding kecil yang mencakup semua topik tahap ini: [daftar topik]. Nilai dengan standar lulus 80%. Jika belum lulus, buat rencana remedial untuk bagian yang lemah.
```

---

## Prompt 9: Spaced Repetition

Gunakan **harian atau mingguan**.

```text
Ini daftar konsep yang saya pelajari 1-2 minggu terakhir: [daftar].
Konsep yang saya rasa lemah: [daftar].
Buat sesi review 15 menit: 5 pertanyaan singkat tanpa melihat catatan, prioritaskan konsep lemah. Tampilkan satu per satu. Di akhir, perbarui daftar "konsep lemah" saya.
```

---

## Prompt 10: Kritik Rencana Proyek

Gunakan **sebelum mulai mengerjakan proyek**.

```text
Saya akan membuat proyek: [deskripsi].
Rencana saya:
- Fitur: [daftar]
- Tabel database: [daftar kasar]
- Endpoint: [daftar kasar]
- Urutan pengerjaan: [daftar]

Jangan buat rencana baru. Kritik rencana saya:
1. Apa yang terlalu besar untuk level saya? (potong jadi MVP)
2. Apa yang terlewat? (validasi, error handling, relasi tabel)
3. Risiko atau kesalahan desain yang umum
4. Urutan pengerjaan yang lebih aman
Lalu ajukan 3 pertanyaan yang harus saya jawab sebelum mulai ngoding.
```

---

## Prompt 11: Pendamping Proyek

```text
Saya sedang mengerjakan proyek [nama], fitur: [nama fitur].
Pecah fitur ini menjadi checklist langkah kecil (tiap langkah maksimal 30 menit) dalam urutan Entity/Repository/Service/Controller yang tepat. Untuk tiap langkah, tulis apa yang harus tercapai, BUKAN kodenya. Saya akan mengerjakan satu per satu dan melapor.
```

---

## Prompt 12: Delegasi Boilerplate

Gunakan **hanya setelah kamu pernah menulisnya manual dan paham cara kerjanya**.

```text
Saya sudah pernah menulis [mis. entity JPA dan repository] secara manual dan paham cara kerjanya. Sekarang tolong generate boilerplate untuk [mis. 5 entity berikut: ...] agar hemat waktu.
Setelah itu, beri 3 pertanyaan tentang kode yang kamu generate untuk memastikan saya benar-benar memahaminya. Jangan lanjut sebelum saya bisa menjawab.
```

---

## Prompt 13: Penutup Sesi

```text
Akhiri sesi belajar hari ini:
1. Ringkas apa yang sudah saya pelajari (maksimal 5 poin)
2. Daftar konsep yang masih lemah
3. Satu tugas kecil untuk dikerjakan besok (maksimal 30 menit)
4. Saran topik sesi berikutnya
5. Buat "ringkasan progres" singkat yang bisa saya tempel di awal chat baru supaya kamu langsung tahu posisi saya
```

**Prompt lanjutan di chat baru:**

```text
Lanjut belajar [topik]. Ini ringkasan progres terakhirku:
[tempel ringkasan progres]
```

---

## Prompt 14: Review Mingguan

```text
Ini catatan belajar saya minggu ini: [tempel ringkasan, jam belajar, kendala].
Buat review mingguan: yang sudah dikuasai, yang masih lemah, apakah saya on track terhadap target [target saya], dan rencana minggu depan yang realistis. Jujur saja, termasuk kalau saya terlalu lambat atau terlalu terburu-buru.
```

---

## Prompt 15: Tes Diagnostik Awal

Gunakan **di awal belajar** untuk menentukan titik mulai.

```text
Berikan tes diagnostik 5-8 pertanyaan untuk mengukur kemampuan saya di Java dan konsep backend. Tampilkan satu per satu, dari dasar (variabel, perulangan) sampai konsep menengah (OOP, SQL dasar, HTTP). Jika saya salah di dua soal berturut-turut, hentikan tes dan tentukan titik mulai.

Setelah selesai:
1. Tentukan level saya dan di tahap mana saya sebaiknya mulai
2. Buat rencana belajar mingguan untuk 4 minggu pertama sesuai waktu saya ([__ jam/hari, __ hari/minggu])
3. Mulai sesi pertama dengan format: tujuan sesi, penjelasan konsep, contoh kode, kesalahan umum pemula, latihan, kuis singkat, ringkasan
```

---

## Strategi GitHub

Semua proses belajar di-push ke GitHub. Tujuannya ada dua: **jejak konsistensi belajar** dan **portofolio** yang bisa dilihat recruiter.

### Prinsip Utama

1. **Mulai Git di minggu pertama, bukan menunggu Tahap 4.** Pelajari dulu 8 perintah dasar saja: `init`, `clone`, `status`, `add`, `commit`, `push`, `pull`, `log`. Branch, merge, PR, dan rebase dipelajari mendalam di Tahap 4.
2. **Dua jenis repo**: satu repo *jurnal belajar* untuk latihan harian, dan satu repo terpisah *per proyek portofolio*.
3. **Commit kecil dan sering.** Satu latihan atau satu fitur kecil = satu commit.
4. **Kamu yang commit, bukan AI.** Hanya commit kode yang bisa kamu jelaskan sendiri.
5. **Jangan pernah commit secret** (password database, JWT secret, API key).

### Struktur Repo

**Repo 1: `java-learning-journal`** (latihan harian, satu repo untuk semua tahap)

```text
java-learning-journal/
├── README.md                  # tujuan, progres, daftar tahap (checklist)
├── 01-java-dasar/
│   ├── 01-variabel-tipe-data/
│   ├── 02-percabangan/
│   └── ...
├── 02-oop/
├── 03-java-lanjutan/
├── 04-pendukung-backend/
├── 05-spring-boot-inti/       # latihan kecil, bukan proyek besar
├── 06-keamanan-kualitas/
├── notes/                     # ringkasan dengan kata sendiri per topik
│   ├── weak-concepts.md       # daftar konsep lemah
│   └── weekly-review.md       # log review mingguan
└── .gitignore
```

**Repo 2 dst: satu repo per proyek portofolio**

| Repo | Muncul setelah | Isi |
|---|---|---|
| `library-console-app` | Tahap 3 | Aplikasi konsol manajemen perpustakaan |
| `todo-api` | Tahap 5 | REST API Todo List + database |
| `online-shop-api` (atau `blog-api`) | Tahap 6 | REST API + JWT + test + Swagger |
| (proyek yang sama, dikembangkan) | Tahap 7 | + Docker, CI/CD, deployment |

### Konvensi Pesan Commit (Conventional Commits)

Format: `tipe: deskripsi singkat dalam bentuk perintah`

| Tipe | Dipakai untuk | Contoh |
|---|---|---|
| `feat` | Fitur baru | `feat: add create todo endpoint` |
| `fix` | Perbaikan bug | `fix: handle null name in user service` |
| `docs` | Dokumentasi/catatan | `docs: add notes on interface vs abstract class` |
| `test` | Menambah/memperbaiki test | `test: add unit tests for TodoService` |
| `refactor` | Merapikan tanpa ubah perilaku | `refactor: extract validation into method` |
| `chore` | Config, dependency, build | `chore: add h2 dependency` |
| `exercise` | Latihan belajar (repo jurnal) | `exercise: solve stream filter transactions` |

Aturan: huruf kecil, maksimal ±72 karakter, tulis apa yang berubah, bukan "update" atau "fix bug" yang kabur. Hindari commit `wip` atau `asdf` di repo portofolio.

### Alur Harian (±5 menit di akhir sesi)

```bash
git status                       # cek apa yang berubah
git add .                        # atau add file tertentu
git commit -m "exercise: solve polymorphism shape area"
git push                         # kirim ke GitHub
```

Lalu tambahkan 3-5 kalimat ringkasan di `notes/` dan commit sebagai `docs: add notes on <topik>`. Targetnya **commit minimal 4-5 hari per minggu**, bukan sekadar mengejar warna kotak hijau, tapi membangun ritme belajar.

### Strategi Branch

| Tahap | Cara kerja |
|---|---|
| Tahap 1-3 (repo jurnal) | Langsung commit ke `main`. Cukup sederhana. |
| Tahap 4 (belajar Git) | Latihan branch, merge, dan konflik di repo percobaan terpisah. |
| Tahap 5+ (repo proyek) | **GitHub Flow**: `main` selalu bisa jalan. Setiap fitur dikerjakan di branch (`feature/create-todo`), lalu buka **Pull Request ke repo sendiri**, review (boleh dibantu AI), lalu merge (squash). |

Penamaan branch: `feature/nama-fitur`, `fix/nama-bug`, `docs/nama-topik`.

### Issues dan Project Board (untuk proyek portofolio)

- Ubah checklist dari Prompt 11 menjadi **GitHub Issues** (satu fitur kecil = satu issue).
- Pakai **GitHub Projects** (board `To do / In progress / Done`) untuk melihat progres.
- Hubungkan PR dengan issue lewat kata kunci `Closes #3` di deskripsi PR.
- Ini menunjukkan kamu terbiasa dengan alur kerja tim, nilai tambah besar bagi recruiter.

### Milestone Git per Tahap

| Tahap | Skill Git yang dikuasai | Output di GitHub |
|---|---|---|
| Minggu 1 | 8 perintah dasar, push pertama | Repo `java-learning-journal` + README |
| Tahap 1-2 | Commit rutin, `.gitignore` | Latihan terorganisir per folder |
| Tahap 3 | Mulai bikin repo proyek | `library-console-app` + README lengkap |
| Tahap 4 | Branch, merge, PR, resolve conflict, rebase dasar | Repo percobaan + PR pertama ke diri sendiri |
| Tahap 5 | GitHub Flow, Issues, Conventional Commits konsisten | `todo-api` dengan riwayat commit rapi |
| Tahap 6 | CI dasar (GitHub Actions), tag/release | `online-shop-api` + badge build + Swagger docs |
| Tahap 7 | Release v1.0.0, dokumentasi deploy | Proyek ter-Docker-kan + link demo (jika ada) |

### Tag dan Release

Tandai milestone dengan tag semantik: `v0.1.0` (MVP jalan), `v0.2.0` (+ JWT), `v1.0.0` (siap dilihat orang).

```bash
git tag -a v0.1.0 -m "MVP: CRUD todo berjalan"
git push origin v0.1.0
```

### `.gitignore` dan Keamanan

Minimal harus mengabaikan:

```text
# Build
target/
build/
*.class

# IDE
.idea/
*.iml
.vscode/

# OS
.DS_Store

# Secret / konfigurasi lokal
.env
application-local.properties
application-secret.properties
```

Praktik wajib:
- Taruh password dan secret di **environment variable** atau file lokal yang di-ignore.
- Sediakan `application-example.properties` berisi placeholder (`DB_PASSWORD=ganti_ini`) agar orang lain bisa menjalankan proyekmu.
- Kalau terlanjur commit secret: **ganti secret tersebut (rotate) segera**, karena menghapus commit saja tidak cukup, riwayatnya tetap ada.

### Template README Proyek

```markdown
# Nama Proyek

Deskripsi 1-2 kalimat: proyek ini apa dan masalah apa yang diselesaikan.

## Fitur
- ...

## Tech Stack
Java 21, Spring Boot 3.x, PostgreSQL, Maven, JUnit 5, Docker

## Cara Menjalankan
1. Clone repo
2. Salin `application-example.properties` menjadi `application-local.properties` dan isi
3. `./mvnw spring-boot:run`

## Dokumentasi API
Swagger UI: http://localhost:8080/swagger-ui.html
Tabel endpoint singkat.

## Desain Database
Diagram ERD (gambar atau Mermaid).

## Testing
`./mvnw test`

## Yang Saya Pelajari
Catatan singkat tantangan dan keputusan desain.
```

Bagian **"Yang Saya Pelajari"** penting: ia menunjukkan proses berpikirmu, bukan hanya hasil akhir.

### CI Dasar (mulai Tahap 6)

Tambahkan GitHub Actions agar test otomatis jalan di setiap push. Lalu pasang badge build di README.

```yaml
# .github/workflows/ci.yml
name: CI
on: [push, pull_request]
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-java@v4
        with:
          distribution: temurin
          java-version: '21'
      - run: ./mvnw test
```

### Aturan AI + Git

- **Jangan commit kode AI yang belum kamu pahami.** Uji dengan Prompt 12 atau Prompt 7 sebelum commit.
- Untuk boilerplate hasil generate AI, tulis di pesan commit atau catatan bahwa itu *AI-assisted*, lalu tunjukkan bagian yang kamu modifikasi sendiri. Transparansi dihargai dan kamu tetap harus bisa menjelaskan setiap baris saat wawancara.
- Minta AI mereview commit message dan PR (Prompt 17 dan 19), tapi **kamu yang mengetik perintah Git** agar terbiasa.

### Checklist Portofolio GitHub

- [ ] Profil GitHub: foto, bio, link, README profil
- [ ] 3+ repo proyek dengan README lengkap
- [ ] Pinned repository: 3-4 proyek terbaik
- [ ] Riwayat commit rapi dan konsisten (bukan satu commit raksasa)
- [ ] Tidak ada secret di riwayat commit
- [ ] Setiap proyek bisa dijalankan mengikuti README
- [ ] Ada test dan CI minimal di proyek utama
- [ ] Topik/tag repo diisi (`java`, `spring-boot`, `rest-api`)

---

## Prompt 16: Setup Repo

```text
Saya baru mulai Git dan GitHub. Pandu saya setup repo `java-learning-journal` langkah demi langkah, SATU langkah per pesan, tunggu saya melapor sebelum lanjut:
1. Install dan konfigurasi Git (nama, email)
2. Buat repo di GitHub dan hubungkan dengan folder lokal
3. Buat struktur folder per tahap, .gitignore untuk Java/IntelliJ/Maven, dan README awal
4. Commit dan push pertama

Saya memakai OS [Windows/Mac/Linux]. Setelah selesai, jelaskan apa fungsi tiap perintah yang tadi kita pakai dan beri 3 pertanyaan kuis. Jangan menjalankan atau menulis semuanya sekaligus.
```

---

## Prompt 17: Review Commit

```text
Review pesan commit saya berdasarkan Conventional Commits.
Perubahan yang saya buat: [jelaskan atau tempel hasil `git diff --stat`]
Pesan commit saya: "[pesan]"

Beri tahu: apakah tipe dan deskripsinya tepat, apakah commit ini terlalu besar dan sebaiknya dipecah, dan beri 1 versi perbaikan. Jelaskan alasannya supaya saya bisa menulis sendiri lain kali.
```

---

## Prompt 18: Buat README

```text
Bantu saya menulis README untuk proyek [nama].
Info proyek: [deskripsi, fitur, tech stack, cara menjalankan, daftar endpoint].

Gunakan struktur: deskripsi, fitur, tech stack, cara menjalankan, dokumentasi API, desain database, testing, dan "Yang Saya Pelajari". Tulis draf awal, lalu tandai bagian yang masih kurang info dan ajukan maksimal 3 pertanyaan untuk melengkapinya. Pastikan instruksi menjalankan benar-benar bisa diikuti orang yang baru clone repo.
```

---

## Prompt 19: Review PR Sendiri

```text
Saya membuat Pull Request ke repo sendiri untuk latihan alur kerja tim.
Judul PR: [judul]
Deskripsi: [deskripsi]
Perubahan kode: [tempel diff atau kode utama]

Berperanlah sebagai reviewer senior:
1. Beri komentar seperti di code review sungguhan (bug, naming, struktur, test yang kurang)
2. Tandai mana yang wajib diperbaiki dan mana yang saran
3. Nilai kualitas judul dan deskripsi PR saya
Jangan tulis ulang kodenya, biarkan saya yang memperbaiki lalu saya kirim ulang.
```

---

## Prompt 20: Audit Portofolio GitHub

Gunakan **tiap akhir tahap** atau sebelum melamar kerja.

```text
Audit portofolio GitHub saya seperti recruiter teknis yang memeriksa kandidat Junior Java Backend Developer.
Profil: [link atau deskripsi profil]
Repo: [daftar repo + deskripsi singkat tiap repo]
Contoh riwayat commit: [tempel `git log --oneline` dari 1-2 repo]
Contoh README: [tempel atau ringkas]

Berikan:
1. Kesan pertama dalam 30 detik
2. Kelemahan paling serius (README, riwayat commit, struktur, keamanan, test)
3. 5 perbaikan prioritas yang bisa dikerjakan dalam 1 minggu
4. Skor 1-10 untuk: README, kualitas commit, struktur kode, kelengkapan fitur, kesiapan dilihat recruiter
Jujur dan spesifik, jangan hanya memuji.
```

---

## Prompt 21: Bantuan Error Git

```text
Saya mengalami masalah Git. Jangan langsung beri perintah perbaikan, ajari saya memahaminya.

Perintah yang saya jalankan: [perintah]
Pesan error / output: [tempel lengkap]
Hasil `git status`: [tempel]

Lakukan berurutan:
1. Jelaskan arti pesan error dalam bahasa sederhana
2. Jelaskan kondisi repo saya sekarang (apa yang terjadi)
3. Beri opsi perbaikan beserta risikonya, tandai perintah yang berpotensi menghapus pekerjaan saya
4. Sebelum saya menjalankan perintah berisiko, ingatkan saya untuk backup (misalnya buat branch cadangan)
```

---

## Cheat Sheet Penggunaan

| Situasi | Prompt |
|---|---|
| Pertama kali mulai | 0, lalu 15 |
| Mulai topik baru | 1, lalu 2 |
| Waktunya latihan | 3, lalu 4 jika buntu |
| Selesai ngoding sesuatu | 5 |
| Ada error | 6 |
| Selesai satu topik | 7, lalu 8 |
| Awal minggu atau hari | 9 |
| Mau mulai proyek | 10, lalu 11 |
| Sudah paham, mau hemat waktu | 12 |
| Akhir sesi | 13 |
| Akhir minggu | 14 |
| Minggu pertama, setup GitHub | 16 |
| Mau commit | 17 |
| Proyek selesai, butuh README | 18 |
| Latihan alur PR | 19 |
| Akhir tahap / mau melamar kerja | 20 |
| Ada error Git | 21 |

---

## Tips Tambahan

- **Ketik sendiri kodenya.** Jangan copy-paste dari AI, terutama di tahap 1-3.
- **Tanya "kenapa", bukan hanya "bagaimana".** Contoh: "Kenapa pakai interface di sini, bukan class langsung?"
- **Verifikasi dengan menjalankan kode.** AI bisa salah atau memakai cara usang.
- **Satu topik per chat** agar konteks tidak terlalu panjang. Gunakan Prompt 13 untuk membawa progres ke chat baru.
- **Catat "konsep lemah"** di satu file sederhana dan uji berkala dengan Prompt 9.
- **Commit dan push ke GitHub** setiap selesai latihan atau fitur, ikuti bagian [Strategi GitHub](#strategi-github).
- **Tulis ringkasan 3-5 kalimat** dengan kata sendiri di akhir tiap sesi.
- **Simpan dokumen ini** di Notion, Notes, atau Google Docs agar mudah disalin. Kalau memakai fitur Project di Claude, masukkan Prompt 0 sebagai instruksi project.

**Sumber belajar pendukung:** dokumentasi resmi (spring.io, dev.java), Java Programming MOOC dari University of Helsinki (gratis), dan channel YouTube Programmer Zaman Now (bahasa Indonesia).
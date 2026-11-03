# Kopi dan Nyemil ☕🍪

Aplikasi mobile **Kopi dan Nyemil** adalah aplikasi pemesanan kopi dan makanan ringan (cemilan) yang dikembangkan untuk Tugas Pemrograman Mobile. Aplikasi ini mengimplementasikan seluruh tampilan dan alur dari wireframe yang diberikan secara lengkap, modern, dan interaktif menggunakan Android SDK dan Material 3.

---

## 📱 Daftar Halaman & Fitur (Sesuai Wireframe)

1. **Splash / Welcome (`SplashActivity`)**: Halaman sambutan awal dengan logo aplikasi dan tombol "Start now".
2. **Sign Up (`SignUpActivity`)**: Halaman pilihan bagi pengguna untuk mendaftar baru atau masuk (`Register` & `Login`).
3. **Login User (`LoginActivity`)**: Halaman masuk dengan input `username` dan `password`.
4. **Register (`RegisterActivity`)**: Halaman pendaftaran akun baru dengan input `nama lengkap`, `username`, dan `password`.
5. **Home (`HomeActivity`)**: Halaman utama yang menampilkan sapaan "Halo [Nama]," serta daftar makanan & minuman (minimal 5 item) lengkap dengan deskripsi dan harga, dilengkapi navigasi bawah (*bottom navigation*).
6. **Profile (`ProfileActivity`)**: Halaman profil pengguna untuk melihat dan mengubah nama (*profile setting*) serta tombol simpan.
7. **Alamat Pengiriman / Order (`OrderActivity`)**: Halaman pengisian alamat pengiriman pesanan (`Nama Lengkap`, `Alamat`, dan `Patokan atau detail lengkap`) serta tombol "Order dan Kirim".
8. **Konfirmasi Pesanan (`ConfirmationActivity`)**: Halaman konfirmasi sukses pemesanan dengan ikon centang hijau, pesan terima kasih, dan tombol "Oke" kembali ke Home.

---

## 🛠️ Teknologi yang Digunakan

- **Bahasa**: Kotlin
- **UI Framework**: Android XML Layouts with **Material 3 Components** (`com.google.android.material`)
- **Arsitektur & State**: Activity-based navigation dengan Singleton `UserSession` untuk manajemen state data statis (dummy data).
- **Komponen**: RecyclerView, CardView, TextInputLayout, TextInputEditText, MaterialButton.

---

## 🚀 Cara Menjalankan Aplikasi

1. Clone repository ini atau buka folder project di **Android Studio**.
2. Pastikan **JDK 11** atau versi lebih baru telah terkonfigurasi.
3. Lakukan **Gradle Sync** jika diperlukan.
4. Jalankan aplikasi pada emulator Android (API 24+) atau perangkat fisik menggunakan tombol **Run (▶)** di Android Studio.

---

## 📸 Screenshot Tampilan Antarmuka

*(Screenshot simulasi alur aplikasi dari Splash hingga Konfirmasi Pesanan tersedia pada dokumentasi repository)*

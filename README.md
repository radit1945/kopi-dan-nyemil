# Kopi dan Nyemil ☕🍪 (Materi 7: ViewModel & LiveData)

Aplikasi mobile **Kopi dan Nyemil** adalah aplikasi pemesanan kopi dan makanan ringan (cemilan) yang dikembangkan untuk Tugas Pemrograman Mobile. Pada pembaruan terbaru, aplikasi ini telah mengimplementasikan **ViewModel** dan **LiveData** untuk manajemen status UI katalog makanan dan profil pengguna yang tahan terhadap perubahan konfigurasi (rotasi layar).

---

## 📱 Daftar Halaman & Fitur (Sesuai Wireframe)

1. **Splash / Welcome (`SplashActivity`)**: Halaman sambutan awal dengan logo aplikasi dan tombol "Start now".
2. **Sign Up (`SignUpActivity`)**: Halaman pilihan bagi pengguna untuk mendaftar baru atau masuk (`Register` & `Login`).
3. **Login User (`LoginActivity`)**: Halaman masuk dengan input `username` dan `password`.
4. **Register (`RegisterActivity`)**: Halaman pendaftaran akun baru dengan input `nama lengkap`, `username`, dan `password`.
5. **Home (`HomeActivity`)**: Halaman utama yang menampilkan sapaan "Halo [Nama]," serta daftar makanan & minuman (minimal 5 item) yang dikelola melalui **ViewModel & LiveData**, dilengkapi navigasi bawah (*bottom navigation*).
6. **Profile (`ProfileActivity`)**: Halaman profil pengguna untuk melihat dan mengubah nama (*profile setting*) menggunakan LiveData observation serta tombol simpan.
7. **Alamat Pengiriman / Order (`OrderActivity`)**: Halaman pengisian alamat pengiriman pesanan (`Nama Lengkap`, `Alamat`, dan `Patokan atau detail lengkap`) serta tombol "Order dan Kirim".
8. **Konfirmasi Pesanan (`ConfirmationActivity`)**: Halaman konfirmasi sukses pemesanan dengan ikon centang hijau, pesan terima kasih, dan tombol "Oke" kembali ke Home.

---

## 🛠️ Teknologi & Arsitektur yang Digunakan

- **Bahasa**: Kotlin
- **UI Framework**: Android XML Layouts with **Material 3 Components** (`com.google.android.material`)
- **Materi 7 - Architecture Components**:
  - **ViewModel (`KopiViewModel`)**: Menyediakan dan mempertahankan status data (katalog makanan & nama pengguna) lintas perubahan konfigurasi (rotasi layar).
  - **LiveData (`MutableLiveData` & `Observer`)**: Observable berbasis siklus proses (*lifecycle-aware*) yang memperbarui UI secara otomatis saat data berubah.

---

## 🚀 Cara Menjalankan Aplikasi

1. Clone repository ini atau buka folder project di **Android Studio**.
2. Pastikan **JDK 11** atau versi lebih baru telah terkonfigurasi.
3. Lakukan **Gradle Sync** untuk mengunduh dependencies (termasuk `lifecycle-viewmodel-ktx` dan `lifecycle-livedata-ktx`).
4. Jalankan aplikasi pada emulator Android (API 24+) atau perangkat fisik menggunakan tombol **Run (▶)** di Android Studio.

---

## 📸 Screenshot Tampilan Antarmuka

*(Screenshot simulasi alur aplikasi dari Splash hingga Konfirmasi Pesanan dengan dukungan ViewModel & LiveData tersedia pada repository)*

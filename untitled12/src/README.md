# Mekanik Service Management System

# Deskripsi Proyek
Mekanik Service Management System adalah program berbasis Java yang dirancang untuk membantu bengkel dalam mengelola data mekanik, pesanan servis, dan pelanggan. Program ini mempermudah pencatatan dan pengelolaan informasi penting, seperti tarif per jam mekanik, estimasi biaya servis, dan detail pelanggan.

Program ini dapat membantu bengkel dalam:

- Menyimpan dan mencetak informasi pelanggan, pesanan, dan mekanik.
- Menghitung dan menerapkan bonus tarif per jam untuk mekanik.
- Memperbarui spesialisasi mekanik sesuai kebutuhan.
- Memperbarui estimasi biaya servis sesuai permintaan pelanggan.
# Fitur Program
Menyimpan dan Mencetak Detail Mekanik:

- Program dapat menyimpan data mekanik 
seperti ID, nama, tarif per jam, dan spesialisasi.
- Fitur ini memungkinkan pencetakan informasi mekanik untuk memudahkan manajemen data.

Menerapkan Bonus pada Tarif Mekanik:
- Tarif per jam mekanik dapat diperbarui dengan bonus sebesar 5%.
- Program menghitung bonus secara otomatis dan menambahkan ke tarif per jam saat ini.

Memperbarui Spesialisasi Mekanik:
- Fitur ini memungkinkan perubahan spesialisasi mekanik.
-Pengguna dapat mengubah spesialisasi untuk menyesuaikan dengan keahlian mekanik yang dibutuhkan.

Mengelola Data Pesanan Servis:
- Program dapat menyimpan data pesanan servis seperti jenis servis, tanggal servis, dan estimasi biaya.
- Fitur ini juga mencatat mekanik yang bertanggung jawab atas pesanan servis tersebut.

Memperbarui Estimasi Biaya Servis:
- Program memungkinkan pengguna untuk memperbarui estimasi biaya servis sesuai dengan kebutuhan atau permintaan pelanggan.

Menyimpan dan Mencetak Informasi Pelanggan:
- Menyimpan data pelanggan seperti nama dan nomor telepon.
- Menampilkan detail lengkap pelanggan, termasuk pesanan servis dan informasi mekanik terkait.

Dengan fitur-fitur ini, program dapat membantu dalam manajemen data pelanggan, mekanik, dan pesanan servis di bengkel.

# Informasi Penting
Tingkat Bonus: Bonus sebesar 5% secara tetap diterapkan pada tarif per jam mekanik.

Detail Refactoring:
- Metode untuk menghitung bonus dipisahkan menjadi calculateBonus demi modularitas.
- Refactoring variabel dilakukan untuk meningkatkan keterbacaan di dalam applyBonus.

Contoh Output:
- Menampilkan detail awal pelanggan, layanan, dan mekanik.
- Menunjukkan tarif per jam baru setelah penerapan bonus.
- Memperbarui spesialisasi mekanik dan perubahan biaya layanan.
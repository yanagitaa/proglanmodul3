public class Main {
    // Pindahkan method Main.main ke dalam kelas baru bernama Main menggunaka teknik refactoring
    //Mengganti nama MainApp menjadi Main.main untuk membuat nama kelas lebih sederhana
    static class main {
    public static void main(String[] args) {
        Mekanik mekanik = new Mekanik("Alice Smith", 101, 30.0, "Spesialis Mesin");
        PesananServis pesanan = new PesananServis("Overhaul Mesin", "2024-11-15", mekanik, 500.0);
        Pelanggan pelanggan = new Pelanggan("Bob Johnson", "555-1234", pesanan);

        pelanggan.printCustomerDetails();
        mekanik.applyBonus();
        mekanik.updateSpesialisasi("Spesialis Transmisi");
        pesanan.updateEstimasiBiaya(600.0);
    }
}
}

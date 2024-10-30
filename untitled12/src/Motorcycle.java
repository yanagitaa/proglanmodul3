class Mekanik {
    //membuat method setter
    private String nama;
    private int id;
    private double tarifPerJam;
    private String spesialisasi;
    private static final double BONUS_RATE = 0.05;

    /**
     *
     * @param nama untuk memasukan nama
     * @param id untuk memasukan id
     * @param tarifPerJam untuk mengetahui tarif jam
     * @param spesialisasi untuk mengetahui spesialisasi servis
     */
    public Mekanik(String nama, int id, double tarifPerJam, String spesialisasi) {
        this.nama = nama;
        this.id = id;
        this.tarifPerJam = tarifPerJam;
        this.spesialisasi = spesialisasi;
    }

    public void printDetails() {
        System.out.println("ID Mekanik: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Tarif Per Jam: " + tarifPerJam);
        System.out.println("Spesialisasi: " + spesialisasi);
    }
    //Ekstrak logika perhitungan bonus ke dalam method terpisah dalam kelas Mekanik
    //refactoring Inline Varible pada variable bonus
    public void applyBonus() {
        tarifPerJam += calculateBonus();
        System.out.println("Bonus diterapkan! Tarif per jam baru: " + tarifPerJam);
    }

    private double calculateBonus() {
        double bonus = tarifPerJam * BONUS_RATE;
        return bonus;
    }

    public void updateSpesialisasi(String spesialisasiBaru) {
        spesialisasi = spesialisasiBaru;
        System.out.println("Spesialisasi diperbarui menjadi: " + spesialisasi);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTarifPerJam(double tarifPerJam) {
        this.tarifPerJam = tarifPerJam;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }
}

class PesananServis {
    public String jenisServis;
    public String tanggalServis;
    public Mekanik mekanikPenanggungJawab;
    public double estimasiBiaya;

    public PesananServis(String jenisServis, String tanggalServis, Mekanik mekanikPenanggungJawab, double estimasiBiaya) {
        this.jenisServis = jenisServis;
        this.tanggalServis = tanggalServis;
        this.mekanikPenanggungJawab = mekanikPenanggungJawab;
        this.estimasiBiaya = estimasiBiaya;
    }

    public void printOrderDetails() {
        System.out.println("Jenis Servis: " + jenisServis);
        System.out.println("Tanggal Servis: " + tanggalServis);
        System.out.println("Estimasi Biaya: " + estimasiBiaya);
        mekanikPenanggungJawab.printDetails();
    }

    public void updateEstimasiBiaya(double biayaBaru) {
        estimasiBiaya = biayaBaru;
        System.out.println("Estimasi biaya diperbarui menjadi: " + estimasiBiaya);
    }
}

class Pelanggan {
    public String namaPelanggan;
    public String teleponPelanggan;
    public PesananServis pesananServis;

    public Pelanggan(String namaPelanggan, String teleponPelanggan, PesananServis pesananServis) {
        this.namaPelanggan = namaPelanggan;
        this.teleponPelanggan = teleponPelanggan;
        this.pesananServis = pesananServis;
    }

    public void printCustomerDetails() {
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Telepon Pelanggan: " + teleponPelanggan);
        pesananServis.printOrderDetails();
    }
}

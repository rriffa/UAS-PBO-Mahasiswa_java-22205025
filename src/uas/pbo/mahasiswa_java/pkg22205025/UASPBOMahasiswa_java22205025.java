/**
 *
 * @author User
 * Nama : Ma'rifatu Khirzah
 * Nim : 22205025
 * Jurusan : Teknik Informatika
 */


package uas.pbo.mahasiswa_java.pkg22205025;

public class UASPBOMahasiswa_java22205025 {
    private String nama;
    private int umur;

    public UASPBOMahasiswa_java22205025(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class MahasiswaBaru extends UASPBOMahasiswa_java22205025 {
    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM: " + nim);
    }
}

class MahasiswaLama extends UASPBOMahasiswa_java22205025 {
    private int angkatan;

    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }
}

class MahasiswaJava {
    public static void main(String[] args) {
        MahasiswaBaru baru = new MahasiswaBaru("Khirzah", 19, 22205025);
        baru.displayInfo();

        MahasiswaLama lama = new MahasiswaLama("Elsa", 20, 2023);
        lama.displayInfo();
    }
}

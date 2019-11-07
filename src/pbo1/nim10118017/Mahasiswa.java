package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menentukan index dan keterangan dari perhitungan nilai akhir.
 * 
 */
public class Mahasiswa {
    //Atribut class
    private final String nim;
    private final String nama;
    private double nilaiQuiz;
    private double nilaiUts;
    private double nilaiUas;
    private double[] bobot = new double[3];

    //Konstruktor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    //Method-method
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiQuiz() {
        return nilaiQuiz;
    }

    public void setNilaiQuiz(double nilaiQuiz) {
        this.nilaiQuiz = nilaiQuiz;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public double[] getBobot() {
        return bobot;
    }

    public void setBobot(double[] bobot) {
        this.bobot = bobot;
    }

    public double hitungNilaiAkhir() {
        //Method ini menghasilkan nilai akhir.
        return (nilaiQuiz * (bobot[0] / 100)) + (nilaiUts * (bobot[1] / 100)) + (nilaiUas * (bobot[2] / 100));
    }
    
    public char tentukanIndex() {
        //Method ini menghasilkan index dari perhitungan nilai akhir
        double nilaiAkhir = hitungNilaiAkhir();
        if ((nilaiAkhir >= 80) && (nilaiAkhir <= 100))
            return 'A';
        else if ((nilaiAkhir >= 68) && (nilaiAkhir < 80))
            return 'B';
        else if ((nilaiAkhir >= 56) && (nilaiAkhir < 68))
            return 'C';
        else if ((nilaiAkhir >= 45) && (nilaiAkhir < 56))
            return 'D';
        else if ((nilaiAkhir >= 0) && (nilaiAkhir < 45))
            return 'E';
        else {
            System.out.println("Kesalahan dalam rentang nilai");
            return 'X';
        }
    }
    
    public String tentukanKeterangan() {
        //Method ini menghasilkan keterangan dari index yang dihasilkan dari perhitungan nilai akhir.
        char index = tentukanIndex();
        switch (index) {
            case 'A' : return "Sangat Baik";
            case 'B' : return "Baik";
            case 'C' : return "Cukup";
            case 'D' : return "Kurang";
            case 'E' : return "Sangat Kurang";
            default : return "Tidak diketahui";
        }
    }
}

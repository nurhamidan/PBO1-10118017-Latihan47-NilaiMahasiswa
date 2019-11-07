package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class main untuk class Mahasiswa.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mahasiswa 1
        Mahasiswa mahasiswa1 = new Mahasiswa("1011", "Upin");
        //Mahasiswa 3
        Mahasiswa mahasiswa3 = new Mahasiswa("1013", "Apin");
        //Mahasiswa 2
        Mahasiswa mahasiswa2 = new Mahasiswa("1012", "Ipin");
        
        mahasiswa1.setNilaiQuiz(75);
        mahasiswa1.setNilaiUts(45);
        mahasiswa1.setNilaiUas(34);
        mahasiswa1.setBobot(new double[]{20, 30, 50});
        System.out.println("Nama\t\t: " + mahasiswa1.getNama());
        System.out.println("NIM\t\t: " + mahasiswa1.getNim());
        System.out.println("Nilai Quiz\t= " + mahasiswa1.getNilaiQuiz());
        System.out.println("Nilai UTS\t= " + mahasiswa1.getNilaiUts());
        System.out.println("Nilai UAS\t= " + mahasiswa1.getNilaiUas());
        System.out.println("Nilai Akhir\t= " + mahasiswa1.hitungNilaiAkhir());
        System.out.println("Index\t\t= " + mahasiswa1.tentukanIndex());
        System.out.println("Keterangan\t= " + mahasiswa1.tentukanKeterangan());
        System.out.println();
        
        mahasiswa2.setNilaiQuiz(60);
        mahasiswa2.setNilaiUts(80);
        mahasiswa2.setNilaiUas(75);
        mahasiswa2.setBobot(mahasiswa1.getBobot());
        System.out.println("Nama\t\t: " + mahasiswa2.getNama());
        System.out.println("NIM\t\t: " + mahasiswa2.getNim());
        System.out.println("Nilai Quiz\t= " + mahasiswa2.getNilaiQuiz());
        System.out.println("Nilai UTS\t= " + mahasiswa2.getNilaiUts());
        System.out.println("Nilai UAS\t= " + mahasiswa2.getNilaiUas());
        System.out.println("Nilai Akhir\t= " + mahasiswa2.hitungNilaiAkhir());
        System.out.println("Index\t\t= " + mahasiswa2.tentukanIndex());
        System.out.println("Keterangan\t= " + mahasiswa2.tentukanKeterangan());
        System.out.println();
        
        mahasiswa3.setNilaiQuiz(30);
        mahasiswa3.setNilaiUts(80);
        mahasiswa3.setNilaiUas(40);
        mahasiswa3.setBobot(mahasiswa1.getBobot());
        System.out.println("Nama\t\t: " + mahasiswa3.getNama());
        System.out.println("NIM\t\t: " + mahasiswa3.getNim());
        System.out.println("Nilai Quiz\t= " + mahasiswa3.getNilaiQuiz());
        System.out.println("Nilai UTS\t= " + mahasiswa3.getNilaiUts());
        System.out.println("Nilai UAS\t= " + mahasiswa3.getNilaiUas());
        System.out.println("Nilai Akhir\t= " + mahasiswa3.hitungNilaiAkhir());
        System.out.println("Index\t\t= " + mahasiswa3.tentukanIndex());
        System.out.println("Keterangan\t= " + mahasiswa3.tentukanKeterangan());
        System.out.println();
    }
    
}

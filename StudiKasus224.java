import java.util.Scanner;

public class StudiKasus224 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPendanaanPKM;

        System.out.println("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();

        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();

        System.out.println("Jumlah dokumen : ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.println("Peringkat juara : ");
            peringkatJuara = sc.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;

                System.out.println("Status : Dokumen tidak lengkap (kurang "
                        + kurang + " dokumen). Dana penghargaan tidak diberikan.");

            } else {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Memenuhi ketentuan. "
                            + "Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Tidak memenuhi ketentuan peringkat. "
                            + "Dana penghargaan tidak diberikan.");
                }
            }

        }
    }
}
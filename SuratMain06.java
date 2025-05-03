import java.util.Scanner;
public class SuratMain06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackSurat06 stackSurat = new StackSurat06();
        int pilihan;
        
        do {
            System.out.println("\n===== SISTEM PENGELOLAAN SURAT IZIN MAHASISWA =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    terimaSuratIzin(scanner, stackSurat);
                    break;
                case 2:
                    prosesSuratIzin(stackSurat);
                    break;
                case 3:
                    lihatSuratIzinTerakhir(stackSurat);
                    break;
                case 4:
                    cariSurat(scanner, stackSurat);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
        scanner.close();
    }
    private static void terimaSuratIzin(Scanner scanner, StackSurat06 stackSurat) {
        System.out.println("\n----- TERIMA SURAT IZIN -----");
        System.out.print("ID Surat: ");
        String idSurat = scanner.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.print("Kelas: ");
        String kelas = scanner.nextLine();
        char jenisIzin;

        do {
            System.out.print("Jenis Izin (S: Sakit, I: Izin keperluan lain): ");
            jenisIzin = scanner.nextLine().toUpperCase().charAt(0);
            if (jenisIzin != 'S' && jenisIzin != 'I') {
                System.out.println("Jenis izin tidak valid. Masukkan 'S' atau 'I'.");
            }
        } while (jenisIzin != 'S' && jenisIzin != 'I');
        
        System.out.print("Durasi izin (hari): ");
        int durasi = scanner.nextInt();
        scanner.nextLine();  
        Surat06 newSurat = new Surat06(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
        stackSurat.push(newSurat);
    }
    private static void prosesSuratIzin(StackSurat06 stackSurat) {
        System.out.println("\n----- PROSES SURAT IZIN -----");
        Surat06 processedSurat = stackSurat.pop();
        if (processedSurat != null) {
            System.out.println("Surat izin berikut telah diproses:");
            processedSurat.lihatInfo();
        }
    }
    private static void lihatSuratIzinTerakhir(StackSurat06 stackSurat) {
        System.out.println("\n----- LIHAT SURAT IZIN TERAKHIR -----");
        Surat06 topSurat = stackSurat.peek();
        if (topSurat != null) {
            System.out.println("Surat izin terakhir adalah:");
            topSurat.lihatInfo();
        }
    }
    private static void cariSurat(Scanner scanner, StackSurat06 stackSurat) {
        System.out.println("\n----- CARI SURAT -----");
        System.out.print("Masukkan nama mahasiswa: ");
        String searchName = scanner.nextLine();
        boolean ketemu = stackSurat.search(searchName);
        if (!ketemu) {
            System.out.println("Tidak ada surat izin untuk mahasiswa " + searchName);
        }
    }
}
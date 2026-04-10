import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tugas, uts, uas;
        float realisasi, kehadiran;

        System.out.print("Input Realisasi: ");
        realisasi = input.nextFloat();

        System.out.print("Input Kehadiran: ");
        kehadiran = input.nextFloat();

        System.out.print("Nilai Tugas: ");
        tugas = input.nextInt();

        System.out.print("Nilai UTS: ");
        uts = input.nextInt();

        System.out.print("Nilai UAS: ");
        uas = input.nextInt();

        float bKehadiran, bTugas, bUts, bUas, total;

        // Perhitungan
        bKehadiran = (kehadiran / realisasi) * 10;
        bTugas = tugas * 0.2f;
        bUts = uts * 0.3f;
        bUas = uas * 0.4f;

        total = bKehadiran + bTugas + bUts + bUas;

        // Output (rapi + pindah baris)
        System.out.println("\n=== HASIL ===");
        System.out.println("Kehadiran: " + kehadiran + " dari " + realisasi);
        System.out.println("Nilai Tugas: " + tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("Total Nilai: " + total);

        input.close();
    }
}
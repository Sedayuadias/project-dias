import java.text.NumberFormat;
import java.util.Locale;

public class FormatAngka {
    public static void main(String[] args) {

        double angka = 83243463.342245;
        double angkaPecahan = 0.902235643;

        // Gunakan locale Indonesia (biar format Rp, koma, dll sesuai)
        Locale localeID = new Locale("id", "ID");

        NumberFormat numberFormatter = NumberFormat.getNumberInstance(localeID);
        NumberFormat currFormatter = NumberFormat.getCurrencyInstance(localeID);
        NumberFormat percentFormatter = NumberFormat.getPercentInstance(localeID);

        String numberStr = numberFormatter.format(angka);
        String currStr = currFormatter.format(angka);
        String percentStr = percentFormatter.format(angkaPecahan);

        System.out.println("double angka = " + angka + " berformat number : " + numberStr);
        System.out.println("double angka = " + angka + " berformat currency : " + currStr);
        System.out.println("double angka = " + angkaPecahan + " berformat percent : " + percentStr);
        System.out.println();

        // Mengatur digit minimum
        numberFormatter.setMinimumIntegerDigits(1);
        currFormatter.setMinimumIntegerDigits(1);
        percentFormatter.setMinimumIntegerDigits(1);

        numberFormatter.setMinimumFractionDigits(2);
        currFormatter.setMinimumFractionDigits(2);
        percentFormatter.setMinimumFractionDigits(2);

        System.out.println("double angka = " + angka + " berformat number : " + numberFormatter.format(angka));
        System.out.println("double angka = " + angka + " berformat currency : " + currFormatter.format(angka));
        System.out.println("double angka = " + angkaPecahan + " berformat percent : " + percentFormatter.format(angkaPecahan));
    }
}
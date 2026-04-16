import java.util.Scanner;

public class P5_DIAS{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
           float validasi=21*75/100;
            
            System.out.print("Masukkan Nilai Akhir : ");
            double nilai = input.nextDouble();
            
            System.out.print("Masukkan Persentase Kehadiran : ");
            double kehadiran = input.nextDouble();
            
            String grade;
            
            if (kehadiran < validasi){
                grade = "E (Kehadiran < 75%)";
            }else{
            
                if (nilai >= 80){
                    grade = "A";
                }else if (nilai >= 70){
                    grade = "B";
                }else if(nilai >= 60){
                    grade = "C";
                }else if (nilai >= 55){
                    grade = "D";
                }else {
                    grade ="E";
                }
                    }
            
            System.out.println("\n==========");
            System.out.println("  HASIL INPUT DATA  ");
            System.out.println("========");
            
            System.out.println("Total Nilai     : " + nilai);
           
            System.out.println("Grade Akhir     : " + grade);
            System.out.println("==========");
            
            input.close();
        }
}
package hitunguanglembur;

import java.util.Scanner;

public class hitunguanglembur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String golongan;
        int jamlembur;
        double gajipokok =0;
        double persentase = 0;
        double gajilembur = 0;
        double totalpenghasilan = 0;

        
        System.out.print("SILAHKAN MASUKKAN GOLONGAN ANDA (A / B / C): ");
        golongan = input.nextLine().trim().toUpperCase();

        if (golongan.equals("A")) {
            gajipokok = 5000000;
        } else if (golongan.equals("B")) {
            gajipokok = 6500000;
        } else if (golongan.equals("C")) {
            gajipokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid!");
        }

      
        System.out.print("MASUKKAN JAM LEMBUR ANDA =  ");
        
        jamlembur = input.nextInt(); 

     
        if (jamlembur == 1) {
            persentase = 0.30;
        } else if (jamlembur == 2) {
            persentase = 0.32;
        } else if (jamlembur == 3) {
            persentase = 0.34;
        } else if (jamlembur == 4) {
            persentase = 0.36;
        } else if (jamlembur >= 5) {
            persentase = 0.38;
        } else {
            persentase = 0.0; 
        }

      
        gajilembur = persentase * gajipokok;
        totalpenghasilan = gajipokok + gajilembur;


        System.out.println("RINCIAN PENGHASILAN KARYAWAN");
        System.out.println("Golongan          : " + golongan);
        System.out.println("Jam Lembur        : " + jamlembur );
        System.out.println("Gaji Lembur       : " + (int) gajilembur);
        System.out.println("TOTAL PENGHASILAN : " + (int) totalpenghasilan);

        input.close();
    }
}
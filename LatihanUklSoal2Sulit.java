package LatihanSoalUkl;

import java.util.Scanner;

public class LatihanUklSoal2Sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];

        System.out.println("Masukkan elemen-elemen Matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan elemen-elemen Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Hasil penjumlahan matriks A + B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

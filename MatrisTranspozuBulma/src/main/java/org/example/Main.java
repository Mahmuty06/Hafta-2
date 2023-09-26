package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matris  = {
                {2, 3, 4},
                {5, 6, 7}
        };
        int Satir = matris.length;
        int Sutun = matris[0].length;
        int [][] matrisTrans = new int[Sutun][Satir] ;

        for (int  i = 0  ;  i < Satir ;  i ++ )  {

            for  ( int j = 0 ; j < Sutun ; j ++ ) {
                  matrisTrans[j][i] = matris[i][j];
            }
        }
        System.out.println("Matris:");
        for (int i = 0; i < Satir; i++) {
            for (int j = 0; j < Sutun ;  j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < Sutun; i++) {
            for (int j = 0; j < Satir; j++) {
                System.out.print(matrisTrans[i][j] + " ");
            }
            System.out.println();
        }

    }

}

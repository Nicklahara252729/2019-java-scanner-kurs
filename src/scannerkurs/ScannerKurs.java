/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerkurs;

import java.util.Scanner;

/**
 *
 * @author nicolahara
 */
public class ScannerKurs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double dollar = 0, euro = 0;
        int rupiah;
        System.out.println("Masukkan nilai rupiah :");
        rupiah = sc.nextInt();
        dollar = rupiah / 14000;
        euro = rupiah / 17000;
        System.out.println("Nilai kurs dollar : " + dollar);
        System.out.println("NIlai kurs euro : " + euro);
    }
    
}

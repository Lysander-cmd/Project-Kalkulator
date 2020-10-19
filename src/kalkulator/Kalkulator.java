
package kalkulator;

import java.util.Scanner;


public class Kalkulator {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, b, c, d, e, f, g, h , j;
        
        System.out.println("<<<<<< Selamat Datang Di Kalkulator Sederhana ");
        System.out.print("Inputkan bilangan 1 :");
        a = input.nextInt();
        System.out.print("Inputkan bilangan 2 :");
        b = input.nextInt();
        e = a + b;
        f = a - b;
        g = a*b;
        h = a/b;
        String[] Operasi = {"Penjumlahan","Pengurangan","Perkalian","Pembagian"};
      for(int i = 0;i < Operasi.length;i++){
          System.out.println(i+"."+Operasi[i]);
      }
        System.out.println("Tentukan Pilihanmu");
        j = input.nextInt();
        switch (j){
            case 0:
                System.out.print("Penjumlahan :"+e);
                System.out.print("\n");
                break;
            case 1:
                System.out.print("Pengurangan :"+f);
                System.out.print("\n");
                break;
            case 2:
                System.out.print("Perkalian :"+g);
                System.out.print("\n");
                break;
            case 3:
                System.out.print("Pembagian :"+h);
                System.out.print("\n");
                break;
            default:
                System.out.println("erorr");
                break;
                
        }
       
        System.out.println(" Terima kasih sudah menggunakan kalkulator sederhana");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class PercabanganNo2 {
    public static void main(String[] args) {
        int UTS, UAS, Tugas;
        int a, b, c, d;
        
        Scanner data = new Scanner(System.in);
        System.out.println("Masukkan Nilai UST: ");        
        UTS = data.nextInt();
        System.out.println("Masukkan Nilai UAS: ");
        UAS = data.nextInt();
        System.out.println("Masukkan Nilai Tugas: ");
        Tugas = data.nextInt();
        
        a = 35*UTS/100;
	b = 45*UAS/100;
	c = 20*Tugas/100;
	d = a +b +c;
        
        if(d>=80 && d<=100){
            System.out.println("Nilai akhir adalah A");
	}else if(d>=70 && d<=80){
            System.out.println("Nilai akhir adalah B");
	}else if(d>=50 && d<=70){
            System.out.println("Nilai akhir adalah C");
	}else if(d>=40 && d<=50){
            System.out.println("Nilai akhir adalah D");
	}else if(d<=40){
            System.out.println("Nilai akhir adalah E");
	}                
    }
}

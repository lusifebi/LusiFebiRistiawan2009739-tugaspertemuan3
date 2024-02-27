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
public class PercabanganNo3 {
    public static void main(String[] args) {
        int JmlPeserta, mobil;
        
        Scanner data = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Peserta: ");
        
        JmlPeserta = data.nextInt();
        
        if(JmlPeserta<=7){
            System.out.println("Mobil yang disediakan adalah: 1");
	}else if(JmlPeserta>7 && JmlPeserta%7==0){
            mobil = JmlPeserta/7;
            System.out.println("Mobil yang disediakan adalah: " +mobil);
	}else if(JmlPeserta>7 && JmlPeserta%7 != 0){
            mobil = JmlPeserta/7+1;
            System.out.println("Mobil yang disediakan adalah: " +mobil);
	}
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class Percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bilangan, bilangan1, bilangan2;
        Scanner data = new Scanner(System.in);
        System.out.println("Masukkan bilangan Pertama: ");        
        bilangan1 = data.nextInt();
        System.out.println("Masukkan bilangan Kedua: ");        
        bilangan2 = data.nextInt();
        
        if(bilangan1 % 2 == 0 && bilangan2 % 2 == 0){
            bilangan = bilangan1 + bilangan2;
            System.out.println("Hasil penjulahan bilangan genap: " +bilangan);
	}
	else{
            bilangan = bilangan1 * bilangan2;
            System.out.println("Hasil Perkalian bilangan ganjil: " +bilangan);
	}
    }
    
}

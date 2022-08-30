/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeler;

import java.util.Scanner;


public class üçgenYapma{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("lÃ¼tfen bir sayÄ± girin :");
        int sayi=scan.nextInt();
        
        
        for(int i =0; i<sayi; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    
}

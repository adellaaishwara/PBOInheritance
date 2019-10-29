/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GuruMapel {
    
    public static void main(String[] args){
        
    
         MataPelajaran Guru1 = new MataPelajaran("Pak Fuad","Laki-Laki",45,"Matematika");
         MataPelajaran Guru2 = new MataPelajaran("Pak Hafidh","Laki-laki",25,"Bahasa Indonesia");
         MataPelajaran Guru3 = new MataPelajaran("Bu Rara","Perempuan",35,"PPKN");
         MataPelajaran Guru4 = new MataPelajaran("Pak Bagus","Laki-laki",27,"Siskom");
        
        
        System.out.println("\n ===Silahkan pilih yang ingin anda ketahui informasinya===");
        System.out.println("1. Pak Fuad\n2. Pak Hafidh\n3. Bu Rara\n4. Pak Bagus\n");
        Scanner adel = new Scanner(System.in);
        int jawab = adel.nextInt();
        switch (jawab){
            case 1:
                System.out.println("Informasi Guru");
                Guru1.info();
                break;
                
            case 2:
                System.out.println("Informasi Guru");
                Guru2.info();
                break;
                
            case 3:
                System.out.println("Informasi Guru");
                Guru3.info();
                break;
                
            case 4:
                System.out.println("Informasi Guru");
                Guru4.info();
                break;
                
                
        }
    }

    
    

   
            
}

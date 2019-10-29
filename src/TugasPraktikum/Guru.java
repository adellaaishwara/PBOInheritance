/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author User
 */
public class Guru {

    String nama;
    String gender;
    int usia;

    public Guru(String nama, String gender, int usia) {
        this.nama = nama;
        this.gender = gender;
        this.usia = usia;

    }
    public void info(){
        System.out.println("Nama : "+nama);
        System.out.println("Gender : "+gender);
        System.out.println("Usia : "+usia);
    }
}

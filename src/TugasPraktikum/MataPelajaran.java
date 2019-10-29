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
public class MataPelajaran extends Guru{

    private String namaMapel;

    public MataPelajaran(String nama, String gender, int usia,String namaMapel) {
        super(nama, gender, usia);
        this.namaMapel = namaMapel;
    }
    

    public void info() {
        System.out.println("Nama Mapel Yang diajar : "+this.namaMapel);
        super.info();
        
    }
}

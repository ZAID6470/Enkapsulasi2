/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasenkap2;

/**
 *
 * @author MOKLET-2
 */
public class UjiBus {

    public static void main(String[] args) {

        
        Tugasenkap2 busBesar = new Tugasenkap2(40);
        busBesar.cetak();

        
        busBesar.addpenumpang(15);
        busBesar.cetak();

        
        busBesar.addpenumpang(5);
        busBesar.cetak();

        
        busBesar.addpenumpang(26);
        busBesar.cetak();
    }
}

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
public class Tugasenkap2 {
    private int Penumpang;
    private int MaxPenumpang;

    /**
     * @param MaxPenumpang
     * @param args the command line arguments
     */
    public Tugasenkap2(int MaxPenumpang){
        this.MaxPenumpang = MaxPenumpang;
        Penumpang = 0;
        
    }
    
    public void addpenumpang(int Penumpang){
        int temp;
        temp = this.Penumpang+Penumpang;
        if (temp >= MaxPenumpang){
            System.out.println("Penumpang melebihi kuota");
            
        }else{
            this.Penumpang = temp;
        }
            
        
    }
    public void cetak(){
System.out.println("Penumpang bus sekarang adalah = " + Penumpang );
System.out.println("Penumpang maksimum seharusnya adalah = " + MaxPenumpang );
    }
    
}

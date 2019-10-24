/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradiengarislurus;

/**
 *
 * @author 'KoalaX'
 * Nama     : Fiqri Akbar Pratama
 * Nim      : 10118020
 * Kelas    : IF-1 
 * Deskripsi Program : Program ini berisi program untuk menghitung gradien garis
 * lurus
 */
public class Utama {
    
    public static void main(String[] args){
        
        Koordinat koor = new Koordinat(2,10,5,7);
        
        System.out.println("Garis yang melalui titik ("+koor.getX1()+","+koor.getY1()+") dan ("
               +koor.getX2()+","+koor.getY2()+")"+"\nmemiliki gradien sebesar "+koor.hitungGradien());
        System.out.println("");
        //============================================================================================
        
        Koordinat koor1 = new Koordinat(5,1,3,12);
        
        System.out.println("Garis yang melalui titik ("+koor1.getX1()+","+koor1.getY1()+") dan ("
               +koor1.getX2()+","+koor1.getY2()+")"+"\nmemiliki gradien sebesar "+koor1.hitungGradien());
 
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }
}

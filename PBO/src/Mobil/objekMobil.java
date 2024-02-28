/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author INDAH PUSPITASARI
 */
public class objekMobil {
    public static void main(String[] args) {
        MobilDiesel md = new MobilDiesel("TOYOTA", 200, 0, "solar");
        MobilBensin mb = new MobilBensin("AYLA", 400, 0, "bensin");
        
        mb.infoMobilBensin();
        md.infoMobilDiesel();
    }
}

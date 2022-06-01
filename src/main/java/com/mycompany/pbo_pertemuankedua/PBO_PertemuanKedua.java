/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pbo_pertemuankedua;

/**
 *
 * @author Ardena
 */
public class PBO_PertemuanKedua {

    public static void main(String[] args) {
        Result hasil = new Result();
        
        hasil.nama = "Ardena";
        hasil.result = 61;
        
        hasil.nilai();
        
        if(hasil.isSuccess()) {
            System.out.println("Selamat Anda Lulus!");
        } else {
            System.out.println("Belajar Lebih Giat Lagi!");
        }
        
        
    }
}

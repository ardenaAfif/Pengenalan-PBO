/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_pertemuankedua;

/**
 *
 * @author Ardena
 */
public class Result {
    
    String nama;
    int result;
    
    void nilai() {
        System.out.println(nama + " mendapatkan nilai");
        System.out.println("\t" + result);
    }
    
    boolean isSuccess (){
            return result > 60;
    }
    
}

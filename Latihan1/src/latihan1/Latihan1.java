/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class Latihan1 {
    public static void main(String[] args) {
        int n = 0;
        try {
            n = System.in.read();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Hasil : " + (char)n);
    }
    }
    

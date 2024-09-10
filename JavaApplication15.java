/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int califa;
       Scanner captu = new Scanner(System.in);
       System.out.println("INTRODUCE LA CALIFICACION:");
       califa= captu.nextInt();
        if (califa >=70){
            System.out.println("ACREDITAS");
            }else{
            System.out.println("NA");
        }
    }
    
}

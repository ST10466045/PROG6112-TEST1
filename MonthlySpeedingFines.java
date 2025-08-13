/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.monthlyspeedingfines;
import static java.lang.Integer.max;
import java.util.Scanner;
public class MonthlySpeedingFines {

    private static int min;
    private static int max;

    public static void main(String[] args) {
      String[]MonthlySpeedingFines = {"JAN", "FEB", "MARCH"};
      String[][]SpeedingFines = {
            {"128km", "135km", "139km"},
            {"155km", "129km", "175km"},
            {"129km", "130km", "185km"},
            {"195km", "155km", "221km"}, 
           } ;
         System.out.println("*****************************************");
         System.out.println(" SPEEDING FINES REPORT ");
         System.out.println("*****************************************");

 
        System.out.println("\t\tJAN\tFEB\tMAR");

      
        for (int i = 0; i < MonthlySpeedingFines.length; i++) {
            System.out.print(MonthlySpeedingFines[i] + "\t");
                System.out.print(MonthlySpeedingFines[i] + "\t");
            }
            System.out.println();
             System.out.println("\n*****************************************");
        System.out.println(" SPEEDING FINES STATISTICS ");
        System.out.println("*****************************************");

        String sum = "0km";
        String max =SpeedingFines[0][0];
         String min = SpeedingFines[0][0];

      
        for (String SpeedingFines1 : MonthlySpeedingFines) {
            for (int x = 0; x < SpeedingFines1.length; x++) {
                sum += SpeedingFines[x];
                if (SpeedingFines[x]  < max) {)
                }
                if (SpeedingFines1[x] > min) {
                    min = MonthlySpeedingFines[x];
                }
            }
        }

        
        System.out.println("Maximum Speed Captured: " + max);
        System.out.println("Minimum Speed Captured: " + min);
    }
} 
        
        
    

                
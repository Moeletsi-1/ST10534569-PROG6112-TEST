/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author moele
 */
import java.util.Scanner;
public class Salesreport {

    public static void main(String[] args){
        
       String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"}; 
       String[] electronics = {"PS5", "XBOX", "SWITCH"};
       
       int[][] sales = new int[3][3];
       
       sales[0][0] = 1000;
       sales[0][1] = 2000;
       sales[0][2] = 3000;
       
       sales[1][0] = 2000;
       sales[1][1] = 3000;
       sales[1][2] = 4000;
       
       sales[2][0] = 1500;
       sales[2][1] = 1100;
       sales[2][2] = 1200;
       
       System.out.println("------------------------------------");
       System.out.println("GAMING CONSOLE REPORT");
       System.out.println("------------------------------------");
       
       System.out.printf("%-18s", "");
       for (int j = 0; j < electronics.length; j++){
           System.out.printf("%-14s", electronics[j]);
       }
       
       for (int i = 0; i < cities.length; i++){
           System.out.printf("%-18s", cities[i]);
       
      
       for (int j = 0; j < electronics.length; j++){
           System.out.printf("%-14d", sales[i][j]);
       }
       }
       System.out.println();
       System.out.println("--------------------------------------");
       System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");
       System.out.println("----------------------------------------");
        
       
        
    
    
    }
    
    
    
    
    
    
    
    
}

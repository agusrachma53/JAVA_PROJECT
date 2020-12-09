/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agus
 */
public class TipeDataNumber {
    
    public static void main(String[] args) {
        
        // Basic Number
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;
        
        float inFloat = 10.10F;
        double iniDouble = 10.10;
        
        //====================================================
        
        // Literals Number
        
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b1010101010;
        
        //====================================================
        
        // Underscore
        int amount = 1000_000_000;

        //====================================================
        
        /* 
            Konversi Number, Get data from basic Number
            1. Widening Casting (Otomatis) byte -> short -> int -> long -> float -> double
            2. Narrowing Casting (Manual) double -> float -> long -> int -> char -> short -> byte
        */
        
        // 1
        
        short konversiIniShort = iniByte;
        int konversiIniInt = konversiIniShort;
        long konvershiIniLong = konversiIniInt;
        
        // 2
        byte iniByte2 = (byte) konversiIniInt; 
        
        System.out.println(iniByte2);
        
        
        
        
    }
            
    
}

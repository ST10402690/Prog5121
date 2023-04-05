
package com.mycompany.calculatorv2lec9;
import java.util.Scanner ; 

public class CalculatorV2Lec9 {

    public static void main(String[] args) {
      int num1= 0 ; 
      int num2 = 0 ; 
        Scanner scan = new Scanner(System.in) ; 


         System.out.print("Please enter number 1 : ")   ; 
          num1 = scan.nextInt() ; 
          
         System.out.print("Please enter number 2 : ")   ; 
          num2 = scan.nextInt() ; 
          
          Calculations calc = new Calculations(num1,num2) ; 
          
          System.out.println("ADDITION :       " + calc.getAddition());
          System.out.println("SUBTRACTION :    " + calc.getSubtraction());
          System.out.println("MULTIPLICATION : " + calc.getMultiply());
          System.out.println("DIVISION :       " + calc.getDivision());
          
    }
    
}

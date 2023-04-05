
package com.mycompany.lecture10_bills;
import javax.swing.*; 

public class Lecture10_Bills {

    
    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null,"ENTER THE CUSTOMER'S NAME") ; 
        double dblminutestalked = Double.parseDouble(JOptionPane.showInputDialog(null,
                "ENTER THE MINUTES TALKED")) ; 
        double dblcostperminute = Double.parseDouble(JOptionPane.showInputDialog(null,
                "ENTER THE COST PER MINUTE")) ; 
        
        //SENDS VARIABLE TO CONSTRUCTOR IN BILL CLASS
        bill b  = new bill(strName, dblminutestalked,  dblcostperminute) ; 
        
        JOptionPane.showMessageDialog(null,"CUSTOMER NAME :" + 
                b.getName().toUpperCase() +  "\n" + 
        "TOTAL DUE: R" + b.getTotalBills() ) ; 
    }
}

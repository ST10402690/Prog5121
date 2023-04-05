
package com.mycompany.lecture10_bills;

public class bill {
    private final String strcustomer ; 
    private double dblminutes = 0;
    private final double dblcost;
    
    
    //constructor receiving variables
    public bill (String strName, double dblcostperminute, double dblminutestalked) { 
            strcustomer = strName ;
    dblminutes = dblminutestalked ; 
    dblcost = dblcostperminute ;     
    
    
}

    public String getName () {
    return strcustomer ; 
    }
    public double getTotalBills () {
    return (dblminutes * dblcost) ; 
    }
    
}

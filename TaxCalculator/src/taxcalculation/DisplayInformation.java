/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculation;

import javax.swing.JOptionPane;

/**
 * Displays output to standard output stream.
 * @author smrita
 */
public class DisplayInformation 

{
	  
    public static void main(String[] args)
    {
    	 DisplayInformation di=new DisplayInformation();
     TaxCalculator taxCalc=new TaxCalculator();
        taxCalc.getInput();
        taxCalc.calculatePf();
        taxCalc.calculateCit();
        taxCalc.calculateTax();
        taxCalc.calculateCashInHand();
        taxCalc.displayInfo();
      
      //  taxCalc.displayInfo();
       // di.info=taxCalc.getObj();
       
    }
    
//    public DisplayInformation()
//    {
//    	
//    	;
//    	 
////        if (reply == JOptionPane.OK_OPTION) {
////          JOptionPane.showMessageDialog(null, "HELLO");
////        }
////        else {
////           JOptionPane.showMessageDialog(null, "GOODBYE");
////           System.exit(0);
////        }
//    	 
//    	
//    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculation;

import javax.swing.JOptionPane;

/**
 * Sends information to the standard output stream.
 * @author smrita
 */
public class DisplayInformation 

{
	/**
	 * output flow
	 * Calcu Provident Fund
	 * Then calculates CIT
	 * Then tax is calculated
	 * Then cash in hand is calculated
	 * @param args
	 */
	  
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

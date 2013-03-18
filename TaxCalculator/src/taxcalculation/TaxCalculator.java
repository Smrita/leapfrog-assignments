/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculation;

import javax.swing.JOptionPane;

/**
 *Calculates 
 *<pre>
 * Monthly tax
 * Monthly PF amount
 * Monthly CIT amount
 * Monthly cash in hand 
 *<pre>
 * @author smrita
 */


public class TaxCalculator
{
    BasicInfo info=new BasicInfo();
    /**
     * The value of this constant is {@value}
     */
    final int YEAR=12;
    
   /**
    * Stores monthly CIT
    */
    double monthlyCit;
    /**
     * Stores the excess monthly CIT
     */
    double excessMonthlyCit=0;
    /**
     * Stored the total monthly Provident fund
     */
    double totalMonthlyPf;
    /**
     * Stores the yearly taxable amount
     */
    double yearlyTaxableAmt;
    /**
     * Stores the monthly cash in hand
     */
    double monthlyCashInHand;
    
    /**
     * Stores the  monthly tax
     */
    double monthlyTax;
  

    /**
     * Retrieves input from the user 
     * @param void
     
     */
     public void getInput()
     {
           info.getUserInput();
     }
     /**
      * Calculates the Provident fund
      * @param void
      */
     public void calculatePf()
     {
          totalMonthlyPf=2*info.monthlyIncome*info.pfPercentage/100;          
          
     }
     
    /**
     * Calculates the CIT
     * @param void
     * @return void     
     */
     public void calculateCit()
     {
           
           monthlyCit=info.citPercentage/100*(info.monthlyAllowance+info.monthlyIncome+totalMonthlyPf/2);
           if(monthlyCit*12>300000)
           {
        	   excessMonthlyCit=monthlyCit*12-300000;
        	   monthlyCit=300000/12;
        	   
           }
           
     }
 /**
  * Calculates the monthly tax     
  */
   public void calculateTax()
   {
       
       
       yearlyTaxableAmt=info.monthlyIncome*12+info.monthlyAllowance*12-info.yearlyInsurance-totalMonthlyPf/2*12-monthlyCit*12+excessMonthlyCit; 
       
       if(info.maritalStatus.toLowerCase().matches("unmarried")&&yearlyTaxableAmt<=info.BRACKET_2_UNMAR)
       {
           double yearlyTax=yearlyTaxableAmt*info.BRACKET_1;
           monthlyTax=yearlyTax/12;
       }
       
      else if(info.maritalStatus.toLowerCase().matches("married")&&yearlyTaxableAmt<info.BRACKET_1_MAR)
       {
           double yearlyTax=yearlyTaxableAmt*info.BRACKET_1;
           monthlyTax=yearlyTax/12;
       }
       
      else if(info.maritalStatus.toLowerCase().matches("unmarried")&&yearlyTaxableAmt<=info.BRACKET_2_UNMAR)
       {
           double yearlyTax=yearlyTaxableAmt*info.BRACKET_2;
           monthlyTax=yearlyTax/12;
       }
       
      else if(info.maritalStatus.toLowerCase().matches("married")&&yearlyTaxableAmt<=info.BRACKET_2_MAR)
       {
           double yearlyTax=yearlyTaxableAmt*info.BRACKET_2;
           monthlyTax=yearlyTax/12;
       }
       
       else
      {
           double yearlyTax=yearlyTaxableAmt*info.BRACKET_3;
           monthlyTax=yearlyTax/12;      
      }
       
       if(info.gender.matches("female"))
           monthlyTax=monthlyTax-monthlyTax*0.1;
       
      
   }
   /**
    * Calculates Monthly Cash in hand
    */
   public void calculateCashInHand()
   {
         monthlyCashInHand=info.monthlyIncome+info.monthlyAllowance-info.yearlyInsurance/12-totalMonthlyPf/2-monthlyCit-monthlyTax;      
   }
   /**
    * Displays <pre>
    *         <ul>
    *          <li>Monthlytax</li>
    *          <li>TotalMonthlyPf</li>
    *          <li>TotalMonthlyCIT</li>
    *          <li>MonthlyCashInHand</li>
    *          <ul>
    *          </pre>
    * to standard Output Stream
    *  @param void
    *  @return void        
    */
   
 
public void displayInfo()
   {
	   String innfo="FirstName"+"     "+info.firstName+"\nLastname\t"+"     "+info.lastName+"\nGender\t"+"     "+"\t"+info.gender+"\nMarital status"+"     "+info.maritalStatus+"\n";
	   String amt="Monthly tax"+"     "+monthlyTax+"\nMonthly PF"+"    "+totalMonthlyPf+"    "+"\nCash in hand"+"    "+monthlyCashInHand+"\nMonthly CIT"+"    "+monthlyCit;
       String result=innfo+amt;
       JOptionPane.showMessageDialog(null, result);
	  
   }
   
  
}

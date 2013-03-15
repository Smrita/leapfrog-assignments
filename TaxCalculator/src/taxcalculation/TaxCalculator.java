/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculation;

import javax.swing.JOptionPane;

/**
 *calculates <pre>
 *               Monthly tax
 *               Monthly PF amount
 *			     Monthly CIT amount
 *				 Monthly cash in hand 
 *<pre>
 * @author smrita
 */


public class TaxCalculator
{
    BasicInfo info=new BasicInfo();
    
   /**
    * variable to store monthlyCit
    */
    double monthlyCit;
    /**
     * variable to store totalMonthlyPf
     */
    double excessMonthlyCit=0;
    double totalMonthlyPf;
    /**
     * variable to store yearlyTaxable amount
     */
    double yearlyTaxableAmt;
    /**
     * variable to store monthly cash in hand
     */
    double monthlyCashInHand;
    final int YEAR=12;
    /**
     * variable to store monthlyTax
     */
    double monthlyTax;
  

    /**
     * This method gets input from the user 
     * @param void
     
     */
     public void getInput()
     {
           info.getUserInput();
     }
     /**
      * this method calculates Provident fund
      * @param void
      */
     public void calculatePf()
     {
          totalMonthlyPf=2*info.monthlyIncome*info.pfPercentage/100;          
          
     }
     
    /**
     * this method calculates CIT
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
  * this method calculates monthlyTAX     
  */
   public void calculateTax()
   {
       
       
       yearlyTaxableAmt=info.monthlyIncome*12+info.monthlyAllowance*12-info.yearlyInsurance-totalMonthlyPf/2*12-monthlyCit*12+excessMonthlyCit; 
       
       if(info.maritalStatus.toLowerCase().matches("unmarried")&&yearlyTaxableAmt<=info.bracket_1_unMar)
       {
           double yearlyTax=yearlyTaxableAmt*info.bracket_1;
           monthlyTax=yearlyTax/12;
       }
       
      else if(info.maritalStatus.toLowerCase().matches("married")&&yearlyTaxableAmt<info.bracket_1_mar)
       {
           double yearlyTax=yearlyTaxableAmt*info.bracket_1;
           monthlyTax=yearlyTax/12;
       }
       
      else if(info.maritalStatus.toLowerCase().matches("unmarried")&&yearlyTaxableAmt<=info.bracket_2_unMar)
       {
           double yearlyTax=yearlyTaxableAmt*info.bracket_2;
           monthlyTax=yearlyTax/12;
       }
       
      else if(info.maritalStatus.toLowerCase().matches("married")&&yearlyTaxableAmt<=info.bracket_2_mar)
       {
           double yearlyTax=yearlyTaxableAmt*info.bracket_2;
           monthlyTax=yearlyTax/12;
       }
       
       else
      {
           double yearlyTax=yearlyTaxableAmt*info.bracket_3;
           monthlyTax=yearlyTax/12;      
      }
       
       if(info.gender.matches("female"))
           monthlyTax=monthlyTax-monthlyTax*0.1;
       
      
   }
   /**
    * Calculates Monthly CashInHand
    */
   public void calculateCashInHand()
   {
         monthlyCashInHand=info.monthlyIncome+info.monthlyAllowance-info.yearlyInsurance/12-totalMonthlyPf/2-monthlyCit-monthlyTax;      
   }
   /**
    * Displays <pre>
    *          -Monthlytax
    *          -TotalMonthlyPf
    *          -TotalMonthlyCIT
    *          -MonthlyCashInHand
    *          </pre>
    * to standard Output Stream
    *  @param void
    *  @return void        
    */
   
  /**
 * 
 */
public void displayInfo()
   {
	   String innfo="FirstName"+"     "+info.firstName+"\nLastname\t"+"     "+info.lastName+"\nGender\t"+"     "+"\t"+info.gender+"\nMarital status"+"     "+info.maritalStatus+"\n";
	   String amt="Monthly tax"+"     "+monthlyTax+"\nMonthly PF"+"    "+totalMonthlyPf+"    "+"\nCash in hand"+"    "+monthlyCashInHand+"\nMonthly CIT"+"    "+monthlyCit;
       String result=innfo+amt;
       JOptionPane.showMessageDialog(null, result);
	  
   }
   
  
}

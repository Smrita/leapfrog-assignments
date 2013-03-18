/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculation;


import taxcalculation.*;
import java.util.Scanner;

/**
 * <PRE>
 * Takes as input the below details
 * <UL>
 *   <LI>Monthly income</LI>
 *   <LI>Monthly allowance</LI>
 *   <LI>CIT %(Citizen Investment Trust)</LI>
 *   <LI>Insurance premium</LI>
 *   <LI>PF %(provident fund) {of the base salary}</LI>
 *   <LI>Married/single</LI>
 *   <LI>Male/female</LI>
 *   <LI>Name</LI>
 * </UL>   
  
 * Also asks the user for input and assigns the value to the variables
 </PRE>
 * @author Smrita
 *
 */
public class BasicInfo
{
    /**
     * Stores the monthly income
     */
    double monthlyIncome;
    /**
     * Stores the monthly allowance
     */
    double monthlyAllowance;
    /**
     * Stores the yearly insurance paid
     */
    double yearlyInsurance;
    /**
     * Stores the  marital status
     */    
    String maritalStatus;
    /**
     * Stores the gender
     */
    String gender;
    /**
     * Store the firstname
     */
    String firstName;
    /**
     * Stores the middleName
     */
    String middleName;
    /**
     * Stores the lastname
     */
    String lastName;
    /**
     * Stores the applicable PROVIENT FUND in percentage
     */
    float pfPercentage;
    /**
     * Stores the applicable CIT in percentage
     */
    float citPercentage;
    
   
    /**
     * The value of this constant is {@value}.
     */
     final float BRACKET_1=(float) 0.01;
     /**
      * The value of this constant is {@value}.
      */
     final float BRACKET_2=(float) 0.15;
     /**
      * The value of this constant is {@value}.
      */
     final float BRACKET_3=(float) 0.25;
     /**
      * The value of this constant is {@value}.
      */
     final int BRACKET_1_UNMAR=160000; 
     /**
      * The value of this constant is {@value}.
      */
     final int BRACKET_1_MAR=200000;
     /**
      * The value of this constant is {@value}.
      */
     final int BRACKET_2_UNMAR=260000;
     /**
      * The value of this constant is {@value}.
      */
     final int BRACKET_2_MAR=300000;
    
    /**
     * Takes input from user and assigns it to the fields of the class
     * {@link BasicInfo} 
     */
    public void getUserInput()
    {
      Scanner input=new Scanner(System.in);
      
      System.out.println("Enter the monthly income");
      monthlyIncome=input.nextDouble();
      
     
      
      
      System.out.println("Enter the monthly allowance");
      monthlyAllowance=input.nextDouble();
      
      System.out.println("Enter the yearly amount that goes to the insurance company ");
      yearlyInsurance=input.nextDouble();
      
      do
      {
      System.out.println("Enter pf in % (should be less than 10)");
      pfPercentage=input.nextFloat();
      }while(pfPercentage>10);
      
      System.out.println("Enter the cit in % eg:if its 8% enter 8 not 0.08");
      citPercentage=input.nextFloat();
     
      
//      if(pfPercentage>10)
//      {
//          System.out.println("pf should be less than 10%\n ");
//          System.out.println("Enter pf again in % eg:if its 8% enter 8 not 0.08");
//          pfPercentage=input.nextFloat();
//           
//      }
      if((citPercentage+pfPercentage*2)>33)
      {
    	  System.out.println("CIT+PF should be less than 33%\n ");
    	  System.out.println("Enter the cit in % again eg:if its 8% enter 8 not 0.08");
          citPercentage=input.nextFloat();
          
          System.out.println("Enter pf in % again eg:if its 8% enter 8 not 0.08");
          pfPercentage=input.nextFloat();
    	  
      }
      System.out.println("Enter your firstname");
      firstName=input.next();
      
      System.out.println("Enter your middlename");
      middleName=input.next();
      
      System.out.println("Enter your lastname");
      lastName=input.next();
      
      System.out.println("Enter your marital status (married/unmarried");
      maritalStatus=input.next();
     
      System.out.println("Enter your gender");
      gender=input.next();
      
     
      
      
      
    }

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public double getMonthlyAllowance() {
		return monthlyAllowance;
	}

	public double getYearlyInsurance() {
		return yearlyInsurance;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String getGender() {
		return gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public float getPfPercentage() {
		return pfPercentage;
	}

	public float getCitPercentage() {
		return citPercentage;
	}

	
    
//    public static void main(String[] args)
//    {
//        BasicInfo b=new BasicInfo();
//        b.getUserInput();
//        System.out.println(b.monthlyIncome+"\t"+b.yearlyInsurance+b.maritalStatus+b.monthlyAllowance+b.pfPercentage+b.citPercentage);
//        
//    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculation;


import taxcalculation.*;
import java.util.Scanner;

/**
 * Takes as input the below details
 * Monthly income
 * Monthly allowance
 * CIT %(Citizen Investment Trust)
 * Insurance premium
 * PF %(provident fund) {of the base salary}
 * Married/single
 * Male/female
 * Name (optional)
 * 
 * and aks user for input and assigns the value to the variables
 * @author smrita
 *
 */
public class BasicInfo
{
    /**
     * variable to store monthlyIncome
     */
    double monthlyIncome;
    /**
     * variable to store monthlyAllowance
     */
    double monthlyAllowance;
    /**
     * variable to store yearlyInsurance
     */
    double yearlyInsurance;
    /**
     * variable to store marital status
     */    
    String maritalStatus;
    /**
     * variable to store gender
     */
    String gender;
    /**
     * variable to store firstname
     */
    String firstName;
    /**
     * variable to store middleName
     */
    String middleName;
    /**
     * variable to store lastname
     */
    String lastName;
    /*
     * variable to store pfPercentage
     */
    float pfPercentage;
    /**
     * variable to store citPrcentage
     */
    float citPercentage;
    
   
    
     final float bracket_1=(float) 0.01;
     final float bracket_2=(float) 0.15;
     final float bracket_3=(float) 0.25;
     final int bracket_1_unMar=160000;    
     final int bracket_1_mar=200000;
     final int bracket_2_unMar=260000;
     final int bracket_2_mar=300000;
    
    /**
     * Takes input from user and assigns it to the fields of the class
     * {@link taxcalculation.BasicInfo} 
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
      
      System.out.println("Enter the cit in % eg:if its 8% enter 8 not 0.08");
      citPercentage=input.nextFloat();
      
      System.out.println("Enter pf in % eg:if its 8% enter 8 not 0.08");
      pfPercentage=input.nextFloat();
      
      if(pfPercentage>10)
      {
          System.out.println("pf should be less than 10%\n ");
          System.out.println("Enter pf again in % eg:if its 8% enter 8 not 0.08");
          pfPercentage=input.nextFloat();
           
      }
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

	public float getBracket_1() {
		return bracket_1;
	}

	public float getBracket_2() {
		return bracket_2;
	}

	public float getBracket_3() {
		return bracket_3;
	}

	public int getBracket_1_unMar() {
		return bracket_1_unMar;
	}

	public int getBracket_1_mar() {
		return bracket_1_mar;
	}

	public int getBracket_2_unMar() {
		return bracket_2_unMar;
	}

	public int getBracket_2_mar() {
		return bracket_2_mar;
	}
    
//    public static void main(String[] args)
//    {
//        BasicInfo b=new BasicInfo();
//        b.getUserInput();
//        System.out.println(b.monthlyIncome+"\t"+b.yearlyInsurance+b.maritalStatus+b.monthlyAllowance+b.pfPercentage+b.citPercentage);
//        
//    }
}

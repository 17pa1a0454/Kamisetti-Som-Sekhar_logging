package com.code.loggingdemo;

import org.apache.logging.log4j.*;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logr=LogManager.getLogger(App.class);
	
	public static void SimpleAndCompoundInterest(int principle,int rate,int time) {
		int i;
	float si=0,ci=0;
	 si=principle+(principle*rate*time)/100;
	 for(i=0;i<time;i++)
		 principle+=(principle*rate)/100;
	 ci=principle;
	 logr.info("Simple Interest = "+String.format ("%.2f", si)+" Compound Interest = "+String.format ("%.2f", ci)+"\n");
}
	
	 public static void MaterialCost(int cost,int area) {
		   if(cost==1)
			   logr.info("Material Cost = "+Integer.toString(1200*area)+" INR");
		   else if(cost==2)
			   logr.info("Material Cost = "+Integer.toString(1500*area)+" INR");
		   else if(cost==3)
			   logr.info("Material Cost = "+Integer.toString(1800*area)+" INR");
		   else
			   logr.info("Material Cost = "+Integer.toString(2000*area)+" INR");
		 
	   }
	
    public static void main( String[] args )
    {
    	 Scanner in=new Scanner(System.in);
		 logr.info("Press 1 to Calculate Interest along with calculate House Construction Cost else press 2\n");
		 int z=in.nextInt();
		 if(z==1) {
			 logr.info("Enter Principle,Rate of Interest,Time in Years\n");
			 int principle=in.nextInt();
			 int rate=in.nextInt();
			 int time=in.nextInt();
			 SimpleAndCompoundInterest(principle,rate,time);
		 }
		 System.out.println("Enter area of House in Integer\n");
		 int area=in.nextInt();
		 logr.info("Choice for Construction Cost per Square Area\n");
		 logr.info("Choice '1' for 1200INR if you want to use Standard Material\n");
		 logr.info("Choice '2' for 1500INR if you want to use Above Standard Material\n");
		 logr.info("Choice '3' for 1800INR if you want to use High Standard Material\n");
		 logr.info("Choice '4' for 2000INR if you want to use High Standard Material And Fully Automated Home\n");
		 int cost=in.nextInt();
		 MaterialCost(cost,area);
    }
    
}

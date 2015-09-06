// Xu Yan
// 8/29/2015
// CSE 002 HW#2 : Arithmetic

// Defining the Class

public class Arithmetic{
    
// Adding the main method
    
public static void main(String[] args){
        
// Constant Declaration
    
    double taxRate=0.06;

// # of pairs of socks and the cost of each pair

    int nSocks=3;
    double costSocks$=2.58;
        
// # of glasses and the cost of each glass

    int nGlass=6;
    double costGlass$=2.29;

// # of boxes of envelopes and the cost of each envelope

    int nEnvelopes=1;
    double costEnvelopes$=3.25;

// calculating and printing the total cost and tax of each item

    double totalSocks$=nSocks*costSocks$;
    double tax1=totalSocks$*taxRate*100;
    tax1=Math.round(tax1);
    double totalSocksTax$=tax1/100;
    System.out.println("The "+nSocks+" socks cost $"+totalSocks$);
    System.out.println("The tax on the socks is $"+totalSocksTax$);
        
    double totalGlass$=nGlass*costGlass$;
    double tax2=totalGlass$*taxRate*100;
    tax2=Math.round(tax2);
    double totalGlassTax$=tax2/100;
    System.out.println("The "+nGlass+" glasses cost $"+totalGlass$);
    System.out.println("The tax on the glasses is $"+totalGlassTax$);
        
    double totalEnvelope$=nEnvelopes*costEnvelopes$;
    double tax3=totalEnvelope$*taxRate*100;
    tax3=Math.round(tax3);
    double totalEnvelopeTax$=tax3/100;
    System.out.println("The "+nEnvelopes+" envelope cost $"+totalEnvelope$);
    System.out.println("The tax on the envelopes is $"+totalEnvelopeTax$);
        
// calculating and printing total cost before tax, total tax, and total cost
// after tax

    double totalCostnoTax$=totalSocks$+totalGlass$+totalEnvelope$;
    double totalTax$=totalSocksTax$+totalGlassTax$+totalEnvelopeTax$;
    double totalCostwithTax$=totalCostnoTax$+totalTax$;
    System.out.println("The items cost $"+totalCostnoTax$+
        " in total before tax");
    System.out.println("A total of $"+totalTax$+" is collected as tax");
    System.out.println("The items cost $"+totalCostwithTax$+
        " in total after tax");
    }
}
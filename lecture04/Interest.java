public class Interest{

public static void main(String[] args){

float balance;
float InterestRate;
float Interest;
int intInterest;
float floatInterest;

balance=1234f;
InterestRate=0.0056f;
Interest=balance*InterestRate;
intInterest=(int)Interest;
floatInterest=(float)Interest;

System.out.println("interest="+ intInterest);
System.out.println("interest="+ floatInterest);


}
}
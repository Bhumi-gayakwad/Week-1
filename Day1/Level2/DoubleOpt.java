// import Scanner package
import java.util.*;

class DoubleOpt{
	public static void  main(String[] args){
		
	// create scanner class for reading inputs
    Scanner sc=new Scanner(System.in);
	
	//take first input a 
	System.out.println(" Enter first number ");
	double a=sc.nextDouble();
	
	//take second input b
	System.out.println(" Enter second number ");
	double b=sc.nextDouble();
	
	//take third input c 
	System.out.println(" Enter third number ");
	double c=sc.nextDouble();
	sc.close();
	
	// create result1 variable to store first result
    double result1 = a + b *c;

    // create result2 variable to store second result 
    double result2 = a * b + c;

    // create result3 variable to store third result
    double result3 = c + a / b;

    //create result4 variable to store fourth result 
    double result4 = a % b + c;

    // print all the values of result1 , result2 , result3 and result4
    System.out.println("The results of Double Operations are "+ result1 + " , "+ result2 + " , "+ " , "+ result3+ " and " + result4);
}
}
		
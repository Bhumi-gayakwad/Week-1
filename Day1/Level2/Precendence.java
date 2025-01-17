import java.util.*;
class Precendence{
public static void main(String[] args){

//create scanner class to take input
Scanner sc=new Scanner(System.in);

// take first input name a
int a=sc.nextInt();

//take second input name b
int b=sc.nextInt();

//take third input name c
int c=sc.nextInt();

// create result1 variable to store first result
int result1 = a + b *c;

// create result2 variable to store second result 
int result2 = a * b + c;

// create result3 variable to store third result
int result3 = c + a / b;

//create result4 variable to store fourth result 
int result4 = a % b + c;

// print all the values of result1 , result2 , result3 and result4
System.out.println("The results of Int Operations are "+ result1 + " , "+ result2 + " , "+ " , "+ result3+ " and " + result4);
}
}


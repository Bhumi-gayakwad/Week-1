import java.util.*;
class Reminder{
public static void main(String args[]){
// make scanner class
Scanner sc=new Scanner(System.in);

// create a variable number1
int number1=sc.nextInt();

// create another variable number 2
int number2=sc.nextInt();

// create quotient variable to store quotient of two numbers
int quotient=number1/number2;

// create reminder variable to store reminder of two numbers
int reminder=number1%number2;

// print quotient and reminder
System.out.println( "The Quotient is " +  quotient +" and Reminder is "+ reminder + " of two number "+ number1 +" and "+number2);
}
}

 import java.util.*;
 class DivibleByFive{
public static void main(String[] args){
 
// create Scanner object to take user input
Scanner sc=new Scanner(System.in);
 
// take number as input
System.out.println("enter any number");
int number=sc.nextInt();
 
// check whether the number is divisible by 5 or not
if(number % 5==0)
System.out.println( number +" is divisible by 5 ");
else
System.out.println( number +" is not divisible by 5 ");

}
}
import java.util.Scanner;
class Digits{
public static void main(String[] args){
  
  int n, count=0;
System.out.println("Please Enter Any Number");
Scanner obj =new Scanner(System.in);
n=obj.nextInt();
while(n>0){
      n=n/10;
      count++;
     }
      System.out.println("Number of digit " + count);s
 
   }
}
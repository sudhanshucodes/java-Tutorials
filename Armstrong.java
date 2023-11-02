import java.util.Scanner;
class Armstrong{
  public static void main(String[] args){
   int n, arm=0,rem=0, c;
   System.out.println("Enter any number");
   Scanner obj=new Scanner(System.in);
   n=obj.nextInt();
   c=n;
   while(n>0){
    rem=n%10;
    arm=(rem*rem*rem)+arm;
     n=n/10;
    }if(c==arm)
    System.out.print(" Armstrong Number");
    else
System.out.print("Not a Armstrong Number");
 
   }
     }       
    
    
 
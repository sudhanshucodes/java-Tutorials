import java.util.Scanner;
 class Reverse{
  public static void main(String[] args){
    int n,r;
   Scanner obj=new Scanner(System.in);
    n=obj.nextInt();
    while(n>0){
     r=n%10;
     System.out.println("Reverse Order" +r);
     n=n/10;
     }    
   } 
 }
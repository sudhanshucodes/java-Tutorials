import java.util.Scanner;
 class sum{
  public static void main(String[] args){
    int n,r,sum=0;
    System.out.println("Enter any number ");
     Scanner obj=new Scanner(System.in);
      n=obj.nextInt();
      while(n>0){
       r=n%10;
       sum=sum+r;
       n=n/10;
     }
      System.out.print("Sum of digit "+ sum);
   }
 }
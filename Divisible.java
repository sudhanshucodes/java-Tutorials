import java.util.Scanner;
class Divisible{
  public static void main(String[] args){
   int n;
     System.out.println("Enter you any number ");
     Scanner obj=new Scanner(System.in);
      n=obj.nextInt();
      if(n%5==0){
           System.out.print("Divisible by 5 ");
     }else{
           System.out.println("Not Divisible by 5 ");
      }
   }
 }
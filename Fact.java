import java.util.Scanner;
class Fact{
 public static void main(String[] args){
 int n,fact=1;
System.out.println("Please inter any number");
  Scanner obj = new Scanner (System.in);
    n=obj.nextInt();
    for(int i=1;i<=n; i++){
         fact=fact*i;
   }
 System.out.println("Factorial " + fact);
 }
}
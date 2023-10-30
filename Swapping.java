import java.util.Scanner;
class Swapping{
 public static void main(String[] args){

    int a,b;
   System.out.print("Enter any two number ");
   Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    System.out.println("Before Swapping " + a + " " + b);
         a=a+b;
         b=a-b;
         a=a-b;
    System.out.println("After Swapping " + a +" " + b);

  }
}
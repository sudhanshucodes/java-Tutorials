import java.util.Scanner;
class Eligible{
public static void main(String[] args){
   int age;
System.out.println("Please Enter Your Age ");
    Scanner obj =new Scanner(System.in);
   age=obj.nextInt();
    if(age<=18){
     System.out.println("YOU ARE NOT ELIGIBLE");
    }else{
     System.out.println("YOU ARE ELIGIBLE");
    }
  }
}
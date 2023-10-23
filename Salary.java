import java.util.Scanner;
class Salary{
public static void main(String[] args){
  int sal;double tax;
    Scanner obj =new Scanner(System.in);
    sal=obj.nextInt();
    if(sal<=10000){
      System.out.println(sal+ " No tax ");
  } else if(sal>=10000 && sal<=100000){
       tax=sal*0.10;
    System.out.println(sal+ " tax- "+tax);
  }else{
   tax = sal*0.20;
   System.out.println(sal+ " tax- "+tax);

    
  }
     
   }
}
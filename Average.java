import java.util.Scanner;
class Average{
  public static void main(String[] args){
   int a, b, c, d, e;
     Scanner obj =new Scanner(System.in);
 System.out.println("Enter your first no ");
      a=obj.nextInt();
 System.out.println("Enter your second no ");
      b=obj.nextInt();
 System.out.println("Enter your third no ");
      c=obj.nextInt();
 System.out.println("Enter your four no ");
      d=obj.nextInt();
 System.out.println("Enter your five no ");
      e=obj.nextInt();

      int Sum=a+b+c+d+e;
      System.out.println("Total marks " +Sum);
      
      double avg=Sum/5.0;
      System.out.println("Average marks " + avg);
    
    }
  }
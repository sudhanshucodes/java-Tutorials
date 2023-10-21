import java.util.Scanner;
class Max{
 public static void main(String[] args){
   int a,b;
    
   Scanner obj =new Scanner(System.in);
System.out.println("Please inter your first number");
   a=obj.nextInt();
System.out.println("Please inter your Second number");

   b= obj.nextInt();
   if(a>b){
      System.out.println("This is big " + a);
}else{
      System.out.println("This is big " + b);
}
 } 
}
import java.util.Scanner;
 class Factor{
  public static void main(String[] args){
     int n;
     System.out.println("Enter any number ");
     Scanner obj=new Scanner(System.in);
     n=obj.nextInt();

     for(int i=1; i<=n; i++){
     if(n%i==0){
       System.out.println(i +" ");

        }
      }
   } 
 }
import java.util.Scanner;
class Calculator{
   public static void main(String[] args){
     int n1,n2,ch,cal;
Scanner obj =new Scanner(System.in);
 System.out.println("Please enter your first value");
   n1=obj.nextInt();
 System.out.println("Please enter your second value");
   n2=obj.nextInt();    
    System.out.println("Select Operation"); 
    ch=obj.nextInt();
     if(ch==1){
       cal=n1+n2;
      System.out.println("ADDITION " +cal);

      }else if(ch==2){   
      cal=n1-n2;
      System.out.println("SUBTRACTION " +cal);

      }else if(ch==3){
       cal=n1*n2;
      System.out.println("MULTIPLICATION " +cal);

      }else if(ch==4){
      cal=n1/n2;
      System.out.println("DIVISION " +cal);     

      }else{
      cal=n1%n2;
      System.out.println("REMAINDER" +cal);
      }
   }
 }
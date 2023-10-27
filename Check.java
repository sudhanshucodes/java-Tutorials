import java.util.Scanner;
class Check{
public static void main(String[] args){
  int n;
   Scanner obj =new Scanner(System.in);
     n=obj.nextInt();
      if(n>0){
   System.out.println("+ve Number");
}else if(n<0){
   System.out.println("-ve Number");
   }else{
    System.out.println("Niether +ve nor -ve Number");
    }
  }
}
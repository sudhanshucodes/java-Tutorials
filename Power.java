import java.util.Scanner;
class Power{
public static void main(String[] args){
  int n, p,result=1; 
  Scanner obj =new Scanner(System.in);
System.out.println("Enter your no");
    n=obj.nextInt();
System.out.println("Enter your power");
    p=obj.nextInt();
       for(int i=1; i<=p; i++){
    result=n*result;
}
System.out.println("Power " + result);
}
}
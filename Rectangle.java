import java.util.Scanner;
class Rectangle{
  public static void main(String[] args){
        int l,b,area;
        System.out.println("Enter Value for sides ");
        Scanner obj=new Scanner(System.in);
        l=obj.nextInt();
        b=obj.nextInt();
        area=l*b; 
        System.out.println("Area of rectangle " +area);
       
    }
  }
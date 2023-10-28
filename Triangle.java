import java.util.Scanner;
 class Triangle{
 public static void main(String[] args){
   int l,b,area;
   Scanner obj=new Scanner(System.in);
    l=obj.nextInt();
    b=obj.nextInt();
    area=l*b;
    System.out.println(area*1/2);

 }
}
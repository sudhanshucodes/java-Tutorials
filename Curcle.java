import java.util.Scanner;
class Curcle{
 public static void main(String[] args){
  final double PI=3.14, area;
  int r;
System.out.println("Enter redius of curcle ");
   Scanner obj = new Scanner(System.in);
    r=obj.nextInt();
    area=PI*r*r;
    System.out.println(area);
   }
 }
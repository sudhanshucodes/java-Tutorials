import java.util.Scanner;
class Year {
    public static void main(String[] args) {
        int y;
        System.out.println("Enter any year ");
        Scanner obj = new Scanner(System.in);
        y = obj.nextInt();
        if (y%100==0 && y%400==0 || y%100!= 0&&y%4==0){
            System.out.println("Leap Year");
        }
     else{
            System.out.print("Not Leap Year ");
        }
    }
}
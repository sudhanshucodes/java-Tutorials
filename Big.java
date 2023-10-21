import java.util.Scanner;
class Big{
    public static void main(String[] args) {
        int a, b, c;
        Scanner obj =new Scanner (System.in);
        System.out.println("Please enter your First no");
        a=obj.nextInt();
        System.out.println("Please enter your Second no");
        b=obj.nextInt();
        System.out.println("Please enter your Third no");

        c=obj.nextInt();
        if(a>b){
            if(a>c)
                System.out.println(a);
            else
                System.out.println(c);
        }else{
            if(b>c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}

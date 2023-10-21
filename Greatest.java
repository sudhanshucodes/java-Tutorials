import java.util.Scanner;
class Greatest {
    public static void main(String[] args) {
        int a, b, c;
       Scanner obj =new Scanner (System.in);
        a=obj.nextInt();
        b=obj.nextInt();
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

import java.util.Scanner;
class Convert{
    public static void main(String[] args){
        char ch,ch2;
        System.out.print("Enter any character");
        Scanner obj =new Scanner(System.in);
        ch=obj.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            ch2=Character.toLowerCase(ch);
            System.out.print("Lower Case "+ ch2);
        }else{
            ch2=Character.toUpperCase(ch);
            System.out.print("Upper Case " + ch2);
        }
    }
}

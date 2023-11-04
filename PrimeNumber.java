import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args){
        int n1,n2,i,j;
        System.out.print("Enter any two number ");
        Scanner obj=new Scanner(System.in);
        n1=obj.nextInt();
        n2=obj.nextInt();
        for(i=n1;i<=n2;i++){
            for(j=2;j<=i;j++){
                if(i%j==0)
                    break;

            }if(i==j)
                System.out.print(j+" ");
        }
    }
}

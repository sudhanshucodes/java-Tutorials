import java.util.Scanner;
class Perfect{
    public static void main(String[] args){
        int n ,sum=0;
         System.out.println("Enter any number ");
        Scanner obj = new Scanner(System.in);
        n=obj.nextInt();
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum=sum+i;
               }
            } 
             if(n==sum)
            System.out.print("Perfect Number ");
            else
                System.out.print("Not Perfect Number ");

        }
    }

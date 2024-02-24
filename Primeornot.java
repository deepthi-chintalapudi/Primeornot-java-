import java.util.Scanner;
public class Primeornot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();
        int flag=0;
        int m=n/2;
        if(n==0||n==1){
            System.out.println("Not a prime");
        }
        for (int i=2;i<m;i++){
            if(n%i==0){
                System.out.println(n+"is not a prime number");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(n+"is a prime number");
        }

    }
}

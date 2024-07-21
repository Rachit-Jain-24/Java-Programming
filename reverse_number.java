import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rev=0;

        while(num>0){
            int last_digit = num % 10 ;
            num= num / 10;
            rev = (rev * 10) + last_digit;

        }
        System.out.print("the reverse num is :"+" "+rev);
        System.out.println(" ");
}
}

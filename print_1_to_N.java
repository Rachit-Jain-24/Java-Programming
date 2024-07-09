import java.util.*;
public class print_1_to_N {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the range you want to print upto:"+" ");
        int N = sc.nextInt();
        int i = 1;
        while(i<=N){
            System.out.print(i+" ");
            i++;
        }
    }
}


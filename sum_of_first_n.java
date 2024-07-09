public class sum_of_first_n {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
            
}

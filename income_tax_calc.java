import java.util.*;

public class income_tax_calc {
    public static void main(String[] args) {
        
        Scanner inc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = inc.nextInt();
        int tax = 0;
        int taxableamount = 0;

        if (income <= 500000) {
            System.out.println("0% Tax");
            tax = income * (0);
            taxableamount = income + tax;
            
        }
        else if(income > 500000 && income < 1000000){
            System.out.println("20% Tax");
            tax = (int) (income * (0.2));
            taxableamount = income + tax;
            
        }
        else if(income > 1000000){
            System.out.println("30% Tax");
            tax = (int) (income * (0.3));
            taxableamount = income + tax;
        }
        System.out.println("Tax amount is " + " " + tax);
        System.out.println("Your taxable amount is" + " " + taxableamount);
    }

}

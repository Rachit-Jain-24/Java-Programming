import java.util.*;
public class switch_st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice 1-5:");
        int number = sc.nextInt();
        
        switch(number){
            case 1 : System.out.println("Burger");
                    break;
            case 2 : System.out.println("fries");
                    break;
            case 3 : System.out.println("noodles");
                    break;
            case 4 : System.out.println("pasta");
                    break;
            case 5 : System.out.println("pizza");
                    break;
            default : System.out.println("choose between 1 to 5");
        }
    }
}
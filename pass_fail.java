import java.util.*;
public class pass_fail {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter student's marks:"+" ");
    int marks = sc.nextInt();

    // if else method
    if(marks>=33){
        System.out.println("Student passed !!!!");
    }
    else{
        System.out.println("Student failed.....");
    }

    // ternary op method
    String result = ((marks>33)?  "Passed" : "Failed");
    System.out.println("Student"+" "+result);


}

}
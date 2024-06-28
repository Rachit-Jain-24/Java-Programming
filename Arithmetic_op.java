public class Arithmetic_op{
    public static void main(String[] args){
        //Arithmetic operators
        // Binary & Unary

        // Binary Arithmetic Operations
        int a = 10;
        int b = 5;

        System.out.println("Addition of "+a+"+"+b+" = " + (a+b));
        System.out.println("Subtraction of "+a+"-"+b+" = " + (a-b));
        System.out.println("Multiplication of "+a+"x"+b+" = " + (a*b));
        System.out.println("Division of "+a+"/"+b+" = " + (a/b));
        System.out.println("Modulas of "+a+"%"+b+" = " + (a%b));


        //Unary Arithmetic Operations
        // 1.increment operator --> pre and post increment 
        // In pre inc value changes first in memory then will be used if declared ++before variable i.e. ++a
        // In post inc value changes after first assigned value i.e. a++

        int c = 24;
        int d = ++c;

        System.out.println("\n"+"Value of c after preincrement is"+" "+c);
        System.out.println("Value of d is"+" "+d);

        int e = 10;
        int f = e++;
        System.out.println("\n"+"Value of E after post increment is"+ " "+ e);
        System.out.println("Value of f after post increment of e is"+ " "+ f);
    
        int g = 200;
        int h = --g;
        System.out.println("\n"+"Value of g after pre decrement is" + g);
        System.out.println("Value of h after pre decrement is" + h);

        int i = 289;
        int l = i--;
        System.out.println("\n"+"Value of i after post decrement is" + i);
        System.out.println("Value of l after post decrement is" + l);
    
    }
}
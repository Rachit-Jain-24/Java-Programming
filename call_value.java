public class call_value {
    public static void swap(int a , int b){
        //SWAP
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A ="+a);
        System.out.println("B ="+b);
    }




    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    
    }
    public static void main(String[] args) {
        int a =30;
        int b =34;
        // swap(a,b);
        int prod = multiply(a,b);
        System.out.println("Product ="+prod);
        prod = multiply(24,02);
        System.out.println("Product ="+prod);

    }

}

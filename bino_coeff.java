public class bino_coeff {
    public static int factoriall(int n){
        
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact *i;
        }
        return fact;
    }
    public static int bincoeff(int n, int r){
        int fact_n = factoriall(n);
        int fact_r = factoriall(r);
        int fact_nmr = factoriall(n-r);

        int bincoeff = fact_n / ( fact_r * fact_nmr );
        return bincoeff;
    }

public static void main(String[] args) {
    System.out.println(bincoeff(5,2));
}
}
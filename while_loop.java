public class while_loop {
        public static void main(String[] args) {
            int counter = 0;

            while(counter<=24){
                counter++; // if I want to print from line 1 then first initialze this
                System.out.println("The number of this line is:"+" "+ counter);
                
                // counter++; if i want to print from line 0  then increment after the statement
            }
            System.out.println("total lines printed is"+" "+ counter);
}
}

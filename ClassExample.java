public class ClassExample {
    public static void main(String[] args) {

        /*
         Example 1: Create a triangle of *
         *
         **
         ***
         ****
         *****
        */

        //outer loop
        for (int i = 1; i <= 5; i++) { //loops for 5 lines
            //inner loop
            for (int x = 1; x <= i; x++) 
            {
                System.out.print("*"); //prints * per line
            }
            System.out.println(); // move to next line
        }
    }
}
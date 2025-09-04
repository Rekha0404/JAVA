public class loops {
    public static void main (String[] args){
        
        // for loop
        System.out.println("For loop: ");
        for(int i=1; i<=5; i++){
            System.out.println(i + " Hello World!");
        }

        // while loop
        System.out.println("\nWhile loop: ");
        int j=1;
        while (j<=5){
            System.out.println(j + " How are you!");
            j++;
        }

        // do while loop
        System.out.println("\nDo while loop: ");
        int k=1;
        do{
            System.out.println(k + " Lets learn JAVA!");
            k++;
        } while (k<=5);

    }
}

import java.util.Scanner;

public class ques_loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Print even numbers from 1 to n
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i=2; i<=n; i+=2){
            System.out.println(i);
        }



        // Print the multiplication table of a number.
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Multiplication table of " + n + ":");
        for(int j=1; j<=10; j++){
            System.out.println(a + " x " + j + " = " + a*j);
        }



        // Sum of first n natural numbers
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Sum of natural numbers: ");
        int sum=0;
        for (int k=1; k<=b; k++){
            sum=sum+k;
        }
        System.out.println(sum);



        // Factorial of a number
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        int fact=1;
        System.out.print("Factorial of " + c + ": ");
        for(int l=1; l<=c; l++){
            fact = fact*l;
        }
        System.out.println(fact);



        // Sum of digits of a number
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum2 = 0;
        int temp = num;
        while (temp!=0){
            int digit = temp % 10;
            sum2 = sum2 + digit;
            temp = temp / 10;
        }
        System.out.println("Sum of digits of " + num + ": " + sum2);



        // Reverse a number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int rev = 0; 
        int temp2 = number;
        while(temp2!=0){
            int digit2 = temp2 % 10;
            rev = rev * 10 + digit2;
            temp2 = temp2 / 10;
        }
        System.out.println("Reverse of " + number + " is " + rev);


        sc.close();
    }
}

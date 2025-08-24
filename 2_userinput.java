import java.util.Scanner;

public class userinput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter your name: "); 
        String name = sc.nextLine();          
        System.out.println("Hello " + name);
        sc.close(); 
    }
}


// Explanation
// import: a keyword that brings in extra functionality from Java's libraries
// java.util: package inside Java's standard library that contains utility classes (like Scanner)
// Scanner → a class used for getting user input

// public: access specifier means accessible anywhere
// class userinput: a class with name userinput is maded

// inside class{}
// static: method belongs to the class, so it can be called without creating an object
// void → this method doesn’t return anything.
// main: function (entry point or from where execution starts)
// String args[]: allows the program to accept command-line arguments

// sc: a variable name which can be anything that you chose 
// new Scanner(System.in): creates a new Scanner object that reads input from System.in

// String → data type for text
// name → variable name to store user input
// sc.nextLine() → calls the nextLine() method of the Scanner object sc, which: waits for the user to type something, reads the entire line, returns it as a String.

// System: built-in class that does system-related works
// out: object of system class that refers to output
// sc.close() → closes the Scanner object

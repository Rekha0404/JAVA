public class conditional_stmts {
    public static void main (String[] args){
        int num=10;

        // 1. if-else
        if(num%2==0){
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }


        // 2. if-else-if
        if(num>0) {
            System.out.println("Number is Positive");
        } else if (num==0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Numvber is Negative");
        }


        // 3. Nested if
        if(num>0){
            if(num<20){
                System.out.println("Number is positive and less than 20");
            }
        }


        // Switch statement
        int day = 3; // Example: 3 = Wednesday
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}


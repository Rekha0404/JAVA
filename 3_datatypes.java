public class datatypes {
    public static void main(String[] args){
        byte b=100;
        short s=30000;
        int i = 100000;
        long l = 10000000000L; // we use l to tell compiler that it is a long value, not an int because without L it treats whole number as int by default
        float f = 3.14f;    // if we do not use f after value then we have to type cast like this float f = (float) 3.14;  otherwise it will throw error
        double d = 3.14159265359;
        char c = 'A'; // character is always written inside single quotes
        boolean bool = true; // boolean value is always either true or false

        String str = "Hello Java"; // string is always written inside double quotes

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
    }
}


// java is a typed langauge
// Data types are of two types: Primitive and Non-Primitive

//Primitive(These are basic types built into java)
//Non-Primitive(These are not built into java directly, but created by programmer or provided by java libraries)
// Primitive(size)                         Non-Primitive
// 1. byte                                 1. String
// 2. char(2 bytes)                        2. Array
// 3. boolean(1 byte)                      3. Class
// 4. int(4 bytes)                         4. Objects
// 5. long(8 bytes)                        5. Interface
// 6. float(4 bytes)
// 7. double(8 bytes)
// 8. short(2 bytes)

/* To Install Java in Mac, 
    1. Download Java Development Kit(JDK) for mac & Install it.
    2. Install 'zSh' instead of default 'bash'  for Terminal. This is optional. We can use Bash Shell as well.
       zSh is just modern than baSh
    3. To setup environment variable,
            open .bash_profile (This will open the file in TextEdit)
                Type this at the end,
                     export JAVA_HOME =  '/Library/Java/JavaVirtualMachines/jdk-12.0.2.jdk/Contents/Home'
            open .zshrc (This will open the file in TextEdit)
                Type this at the end,
                     export JAVA_HOME =  '/Library/Java/JavaVirtualMachines/jdk-12.0.2.jdk/Contents/Home'
        To ensure that the environment variable is set properly, restart the Terminal and type the following
            'echo $JAVA_HOME'
        This should give the following,
            /Library/Java/JavaVirtualMachines/jdk-12.0.2.jdk/Contents/Home
    4. Now to check the java version give the following command
            java -version
        This should give the following,
            java version "12.0.2" 2019-07-16
            Java(TM) SE Runtime Environment (build 12.0.2+10)
            Java HotSpot(TM) 64-Bit Server VM (build 12.0.2+10, mixed mode, sharing)
    5. That's all.
*/

/* Difference between Java & Other Languages:
    Other Languages such as C, C++ : Code --> Compiler --> Machine Code
    Java: Code --> Compiler --> Byte Code --> JVM --> Machine Code
This Byte code is universal. JVM is platform specific thus its Machine Code as well.
 */

/*
OOPS: An Approach to programming that breaks programming problems into objects that interact with each other.
*/

// Java is a case sEnSiTiVe language. It doesn't have type inference.

/*package Introduction;
    This statement tells the compiler that the Java file we wrote belongs to the 'Introduction' package
A package is simply a group of related classes & Interfacts.

When we write package Introduction; then the compiler will create a folder named 'Introduction' and save
the file into the folder. Files that belong to the same package are stored in the same folder.
*/
package Introduction;

/*
    The reason we need Class in Java is, All codes are insided the classes. So to have any java code, we need a Class.
    
    Public Class & the file name must be same for most IDEs. However we can execute via Terminal if they are different.
    A single Java file can have more than one classes inside. 
    However compiling the .Java file will produce separate .class file for each class.
    
    Public classes can be called from any package. If the Class starts with the word 'public', then it is public class
    
    Package is nothing but a folder with collection of classes.

    According to Java standards and common practices, we should declare every class in its own source file. 
    And even if we declare multiple classes in a single source file (.java), 
    still each class will have its own class file after compilation. 
    But the fact is that we can declare more than one class in a single source file with these constraints    

        Each source file(.Java) should contain only one public class and 
        the name of that public class should be similar to the name of the source file.

        If you are declaring a main method in your source file then main should lie in that public class.

    If there is no public class in the source file then main method can lie in any class 
    and we can give any name to the source file.
*/
public class IntroSetup { // The is a public class
    
    /*
        "﻿The main() method" is the entry point of all Java applications. Whenever a Java application is started, 
    the main() method is the first method to be called. Notice the words String[] args inside the parenthesis
    of our main() method. This means the main() method can take in an array of strings as input.
    */
    public static void main(String[] args){ // This is Main Method
    
        
        System.out.println("***Hello World: The main() method which is the entry point of all Java program is called****");
        
        declarationsExamples();
        basicOperatorsExamples();
        
    }
    
    //This method explains Primitive Data Types, Byte, Short, Int, Float, Double, Char:
    static char declarationsExamples(){
    
    /*
    Naming Variables:
        ﻿A variable name in Java can only contain letters, numbers, underscores (_) or the dollar sign ($). 
    However, the first character cannot be a number. Hence, you can name your variables _userName, $username, 
    username or userName2 but not 2userName. The convention, however, is to always begin your variable names 
    with a letter, not "$" or "_". Additionally, the dollar sign character is almost never used when naming 
    a variable (although it is not technically wrong to use it).
    
    Variable names are case sensitive. thisIsAVariableName is not the same as thisisavariablename.

    ﻿Every time you declare a new variable, you need to give it an initial value. 
    This is known as initializing the variable. You can change the value of the variable in your program later. 
    There are two ways to initialize a variable. You can initialize it at the point of declaration or initialize 
    it in a separate statement.
    */
    
    System.out.println("*** The method declarationsExamples() is being executed *** ");
        
    /*
    byte: 
        This is used only if storage space is a concern or if we're cerntain that the vaule will not exceed 
    the range -127 to 127. For instance, we can use the byte data type to store the age of user as it is unlikely
    the user's age will exceed 127.
    */
        byte userAge = 20;
        System.out.println("userAge is byte. Ex: " + userAge);
        
        
    /*short:
        ﻿The short data type uses 2 bytes of storage space and has a range of -32768 to 32767.
    */
        short numberOfStudents = 45;
        System.out.println("numberOfStudents is short. Ex: " + numberOfStudents);
        
     /*int:
        ﻿The int data type uses 4 bytes of storage space and has a range of -231 (-2147483648) to 231-1 (2147483647).
    It is the most commonly used data type for storing integers as it has the most practical range.
    */
        int numberOfEmployees = 500;
        System.out.println("numberOfEmployees is int. Ex: " + numberOfEmployees);
        
    /*long:
        ﻿The long data type uses 8 bytes of storage space and has a range of -263 to 263-1. It is rarely used unless 
    we really need to store a very large integer (such as the number of inhabitants on Earth). In order to 
    specify a long value, you have to add the suffix “L” to the end of the number.    
    */    
        long numberOfInhabitants = 1234567890L;
        System.out.println("numberOfInhabitants is long. Ex: " + numberOfInhabitants);

    /*float:
        ﻿The float data type uses 4 bytes of storage and has a range of approximately negative 3.40282347 x 1038 to 
    positive 3.40282347 x 1038. It has a precision of about 7 digits. This means that if you use float to 
    store a number like 1.23456789 (10 digits), the number will be rounded off to approximately 
    7 digits (i.e. 1.234568).    
    */        
        float hourlyRate = 60.5F;
        System.out.println("hourlyRate is float. Ex: " + hourlyRate);
        
     /*double:
        ﻿The double data type uses 8 bytes of storage and has a range of approximately negative 1.79769313486231570 x 10308 
    to positive 1.79769313486231570 x 10308, with a precision of approximately 15 digits. By default, whenever you 
    specify a floating point number in Java, it is automatically considered to be a double, not a float. If you want 
    Java to treat the floating point number as a float, you have to add a suffix “F” to the end of the number. 
    Unless memory space is a concern, you should always use a double instead of a float as it is more precise.    
    */
        double numberOfHours = 5120.5;
        System.out.println("numberOfHours is double which is also default in Java. Ex: " + numberOfHours);
        
    /*char:
        ﻿char stands for character and is used to store single Unicode characters ﻿such as ‘A’, ‘%’, ‘@’ and ‘p’ etc.
    It uses 2 bytes of memory.    
    */    
        char grade = 'A';
        System.out.println("grade is char. Ex: " + grade);
        
    /*boolean:
        ﻿boolean is a special data type that can only hold two values: true and false. It is commonly used in 
    control flow statements.    
    */    
        boolean promote = true;
        System.out.println("promote is boolean. Ex: " + promote);
    
    /*byte:
        ﻿The byte data type is used for storing integers from -128 to 127. It uses 1 byte of storage 
    space (this is known as the width or the size of ﻿the data type). We normally use 
    the byte data type if storage space is a concern or if we are certain the value of the variable 
    will not exceed the -128 to 127 range. For instance, we can use the byte data type to store 
    the age of a user as it is unlikely that the user’s age will ever exceed 127 years old.
    */    
        byte level = 2;
        System.out.println("level is byte. Ex: " + level);
        
        return 0;
    }
     static char basicOperatorsExamples () {
       // Java is a case sEnSiTiVe language. It doesn't have type inference.  
         
        int x = 7;
        int y = 2;
        return 0;
    }
}

/* Basic Operators:
    
    ﻿Suppose x = 7, y = 2 
        Addition:               x + y = 9 
        Subtraction:           x - y = 5 
        Multiplication:           x*y = 14 
        Division:                x/y = 3 (rounds down the answer to the nearest integer)  
        Modulus:               x%y = 1 (gives the remainder when 7 is divided by 2) 

    In Java, division gives an integer answer if both x and y are integers. 
    However, if either x or y is a non integer, we will get a non integer answer. 
    
    For instance,
        ﻿7 / 2 = 3
        ﻿7.0 / 2 = 3.5       
        7 / 2.0 = 3.5       
        7.0 / 2.0 = 3.5       

    In the first case, when an integer is divided by another integer, you get an integer as the answer. 
    The decimal portion of the answer, if any, is truncated. Hence, we get 3 instead of 3.5. 
    In all other cases, the result is a non integer as at least one of the operands is a non integer. 
    Note that 7.0 is not the same as 7 in Java. The former is a floating point number while the latter is an integer.

*/

/* Short Hand Operators

    x = x + 2 can be expressed as x += 2
    x = x - 2 can be expressed as x -= 2
    
    x = x + 1 can be expressed as x++;
    ﻿The ++ operator can be placed in front of or behind the variable name. This affects the order in which tasks are 
    performed. Suppose we have an integer named counter. If we write

    ﻿System.out.println(counter++); 
    Here, the program first prints the original value of counter before incrementing counter by 1.

    ﻿System.out.println(++counter); 
    Here, the program first increments counter by 1 before printing the new value of counter.

    ++ & -- operators behaves alike.
*/

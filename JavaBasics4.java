// Functions & methods

// public class JavaBasics4 {
//     public static void printHelloWorld(){
//         System.out.println("Hello wolrd");
//         System.out.println("Hello wolrd");
//         System.out.println("Hello wolrd");
//         System.out.println("Hello wolrd");
//     }
//     public static void main(String args []){
//         printHelloWorld(); // function call

//     }
// }

// import java.util.Scanner;
// public class JavaBasics4{
//     public static int  calculateSum(int a, int b){
//         int sum = a + b;
//         return sum;
//     }
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a,b);
//         System.out.println("Sum is : " + sum);
//     }
// }


// call by value 

// public class JavaBasics4{
//     public static void swap(int a, int b){
//         // swap 
//        int temp = a;
//        a = b;
//        b = temp;

//     //    System.out.println("a = " + a); // 5
//     //    System.out.println("b = " + b); // 4
       
//     }
//     public static void main(String args []){
//         // swap values - exchange
//        int a = 4;
//        int b = 5;
//        swap(a, b); //function call

//        System.out.println("a = " + a); // 4
//        System.out.println("b = " + b); // 5
//     }
// }


// import java.util.Scanner;
// public class JavaBasics4{
//     public static int mutiply(int a, int b){
//         int product = a * b;

//         return product;
//     }
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int product = mutiply(a, b);
//         System.out.println("product of a & b : " + product);

//     }

// }


// public class JavaBasics4{
//     public static int factorial(int n){
//         int f = 1;

//         for(int i=1; i<=n; i++){
//             f *= i; // f = f * i
//         }
//         return f;
//     }
//      public static int binCoeff(int n, int r){

//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n - r);
        
//         int binCoeff = fact_n / (fact_r * fact_nmr);
//         return binCoeff;

//     }
//     public static void main(String args []){
//         System.out.println(factorial(4));
//         System.out.println(binCoeff(5, 2));
//     }
// }

// function overloading concept

// public class JavaBasics4{
//     // function to calc sum of 2 nums
//     public static int sum(int a, int b){
//         return a + b;
//     }
//     // function to calc sum of 3 nums
//     public static int sum(int a, int b, int c){
//         return a + b +c;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(3, 5));
//         System.out.println(sum(1,2,5));


//     }
// }

// public class JavaBasics4{
//     // function to calc int sum
//     public static int sum(int a, int b){
//         return a + b;
//     }
//     // function to calc float sum
//     public static float sum(float a, float b){
//         return a + b;
//     }
//     public static void main(String args []){
//         System.out.println(sum(3,5));
//         System.out.println(sum(3.2f,4.8f));

//     }
// }

// check if a number is prime or not 

// import java.util.Scanner;
// public class JavaBasics4{
//     public static void main(String args []){
//         System.out.print("Enter number: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); // nextInt() java ke andar in build function hai 

//         if(n == 2){
//             System.out.println("prime");
//         }else{
//             boolean isPrime = true;
//             for(int i=2; i<=n-1; i++){
//                 if(n % i == 0){
//                     isPrime = false;
//                 }  
//             }
//             if(isPrime == true){
//                 System.out.println("Prime");
//             }else{
//                 System.out.println("Not Prime");
//             }
            
//         }

//     }
// }

// import java.util.Scanner;
// public class JavaBasics4{
//     public static void main(String args []){
//         System.out.print("Enter number: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); // nextInt() java ke andar in build function hai 

//         if(n == 2){
//             System.out.println("prime");
//         }else{
//             boolean isPrime = true;
//             for(int i=2; i<=Math.sqrt(n); i++){
//                 if(n % i == 0){
//                     isPrime = false;
//                 }  
//             }
//             if(isPrime == true){
//                 System.out.println("Prime");
//             }else{
//                 System.out.println("Not Prime");
//             }
            
//         }

//     }
// }



// public class JavaBasics4{
//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//         for(int i=2; i<=n-1; i++){
//             if(n % i == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;

//     }
//     public static void main(String args []){
//         System.out.println(isPrime(4));

//     }
// }


// public class JavaBasics4{
//     // only for n>=2
//     public static boolean isPrime(int n){
//         // corner cases
//         // 2
//         if(n == 2){
//             return true;
//         }
//         for(int i=2; i<=n-1; i++){ // completely dividing
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;

//     }
//     public static void main(String args []){
//         System.out.println(isPrime(4));

//     }
// }


// public class JavaBasics4{
//     public static boolean isPrime(int n){
//         if(n == 2){ // corner case or special case
//             return true;
//         }
//         for(int i=2; i<=Math.sqrt(n); i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         System.out.println(isPrime(4));

//     }
// }



// public class JavaBasics4{
//     public static boolean isPrime(int n){
//         if(n == 2){ // corner case or special case
//             return true;
//         }
//         for(int i=2; i<=Math.sqrt(n); i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void primeInRange(int n){
//         for(int i=2; i<=n; i++){
//             if(isPrime(i)){ // true
//                 System.out.print(i +" ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         primeInRange(20); // 2 to 20
//     }
// }


// Convert Binary to Decimal Number 

// public class JavaBasics4{
//     public static void binToDec(int binNum){
//         int myNum = binNum;
//         int pow = 0;
//         int decNum = 0;

//         while(binNum > 0){
//             int lastDigit = binNum % 10;
//             decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
//             pow++;
//             binNum = binNum / 10; // binNum /= 10
//         }
//         System.out.println("decimal of " + myNum + " = " + decNum);
//     }
//     public static void main(String args []){
//         binToDec(1000); // function call
//     }
// }




// Convert Decimal to Binary Number 

// public class JavaBasics4{
//     public static void decToBin(int n){
//         int myNum = n;
//         int pow = 0;
//         int binNum = 0;

//         while(n > 0){
//             int rem = n % 2;
//             binNum = binNum + (rem * (int)Math.pow(10,pow));
//             pow++;
//             n /= 2;  // n = n / 2;
//         }
//         System.out.println(" Binary of : " + myNum + " = " + binNum);
//     }
//     public static void main(String args[]){
//         decToBin(7);

//     }
// }


// FUNCTIONS QUESTIONS

// Question 1 : Write a Java method to compute the average of three numbers..

// import java.util.Scanner;
// public class JavaBasics4{
//     public static int avgOfThreeNums(int a, int b, int c){
//         int avg = (a + b + c ) / 3;
//         return avg;
//     }
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1st number:");
//         int a = sc.nextInt();
//         System.out.print("Enter 2nd number:");
//         int b = sc.nextInt();
//         System.out.print("Enter 3th number:");
//         int c = sc.nextInt();

//             int avg = avgOfThreeNums(a,b,c);
//             System.out.println("average of 3 nums : "  + avg);
//     }
// }


// Question 2 : Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method

// import java.util.Scanner;
// public class JavaBasics4{
//     public static boolean isEven(int n){
//         if(n % 2 == 0){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();

//         System.out.println(isEven(n));


//     }
// }


// Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.


// import java.util.Scanner;
// public class JavaBasics4{
//     public static void isPalindrome(int n){
//         int original  = n;
//         int rev = 0;
//         while(n > 0){     
//             int lastDigit = n % 10; 
//             rev =  (rev * 10) + lastDigit;
//             n /= 10; // n = n / 10 --> remove lastDigit

//         }
//         if(original == rev){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println(" Not Palindrome");
//         }
//     }

//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int n = sc.nextInt();
//         isPalindrome(n);


//     }
// }

// Note:
// original = 121
// n:   121 → 12 → 1 → 0
// rev:   0 → 1 → 12 → 121

// Key concept you learned: When a variable is being modified inside a loop, 
// but you still need its starting value later, save the original value in another variable first.


// Question 4 : READ & CODE EXERCISE
// Search about(Google) & use the following methods of the Math class in Java:
// a. Math.min( )
// b. Math.max( )
// c. Math.sqrt( )
// d. Math.pow( )
// e. Math.avg( )
// f. Math.abs( )

// Free reading resource (https://www.javatpoint.com/java-math)
// Please feel free to look for more resources/websites on your own.


// public class JavaBasics4{
//     public static void main(String args []){
//         int a = 10;
//         int b = 20;

//         int minVal = Math.min(a, b); // min() method
//         int maxVal = Math.max(a, b); //  max() method
//         int sqrtVal = (int)Math.sqrt(a); // sqrt() method
//         int powVal = (int) Math.pow(4,2); // pow() method 

//         System.out.println(minVal);
//         System.out.println(maxVal);
//         System.out.println(sqrtVal);
//         System.out.println(powVal);
       
        
//     }
// }

// There is no Math.avg() method in Java. 
// The standard java.lang.Math class does not provide a built-in method 
// to calculate the average of numbers


// Math.abs() method is a built-in static function provided by the java.lang.Math class. 
// It calculates and returns the absolute value of a number, which represents its distance from zero on a number line, 
// effectively stripping away its negative sign to make it positive.

// How Math.abs() WorksIf the input is negative, it returns the positive version.
// If the input is positive or zero, it returns the value unchanged.
// It is overloaded, meaning it automatically accepts and processes four numeric data types: 
// int, long, float, and double

// Code Example: How to Use ItBecause abs() is a static method, 
// you call it directly using the class name Math without creating an object


// AbsoluteValueExample 

// public class JavaBasics4 {
//     public static void main(String[] args) {
//         // Working with integers
//         int negativeInt = -42;
//         int positiveInt = Math.abs(negativeInt);
//         System.out.println("Absolute of " + negativeInt + " is: " + positiveInt); // Outputs: 42

//         // Working with doubles/decimals
//         double negativeDouble = -78.95;
//         System.out.println("Absolute of " + negativeDouble + " is: " + Math.abs(negativeDouble)); // Outputs: 78.95

//         // Zero remains zero
//         int zeroValue = 0;
//         System.out.println("Absolute of 0 is: " + Math.abs(zeroValue)); // Outputs: 0
//     }
// }



// Question 5 :
// Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )

import java.util.Scanner;
public class JavaBasics4{
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int sum = sumOfDigits(n);
        System.out.println("Sum of Digit : " + sum);
    }
}
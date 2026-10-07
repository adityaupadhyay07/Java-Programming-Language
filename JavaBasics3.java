// 7.Loops(Flow control)


// while loop

// public class JavaBasics3 {
//     public static void main(String args []){
//         System.out.println("Hello world!");
//         System.out.println("Hello world!");
//         System.out.println("Hello world!");
//     }
// }

// public class JavaBasics3{
//     public static void main(String args []){
//         int counter = 0;

//         while(counter < 10){
//             System.out.println("Hello world!");
//             counter++;
//         }
//     }
// }


// public class JavaBasics3{
//     public static void main(String args []){
//         int number = 1;

//         while(number  <= 10){
//             // System.out.println(number); // nextline
//             System.out.print(number + " "); // sameLine
//             number++;
//         }
//     }
// }


// Print number from 1 to n

// import java.util.Scanner;
// public class JavaBasics3{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number : ");
//         int range = sc.nextInt();
//         int counter = 1;

//         while(counter <= range){
//             System.out.print(counter + " ");
//             counter++;
//         }


//     }
// }

// import java.util.Scanner;
// public class JavaBasics3{
//     public static void main(String args []){
//         System.out.println("Enter Number : ");
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         int sum = 0;

//         int i = 1;
//         while(i <= n){
//             sum += i ;
//             i++;
//         }
//         System.out.println("Sum is : " + sum);

//     }
// }


// for loop

// public class JavaBasics3{
//     public static void main(String args []){
//         for(int i = 1; i <= 10; i++){
//             System.out.println("Hello wolrd");
//         }
//     }
// }


// public class JavaBasics3{
//     public static void main(String args []){
//         for(int i = 1; i <= 4; i++){
//             System.out.println("* * * *");
//         }
//     }
// }


// print reverse of a numbers

// public class JavaBasics3{
//     public static void main(String args []){
//         int n = 10899;
//         while(n > 0){
//             int lastDigit = n  % 10;
//             System.out.print(lastDigit);
//             n =  n / 10;  // n /= 10
//         }
//         System.out.println();
//     }
// }


// reverse the give number

// public class JavaBasics3{
//     public static void main(String args []){
//         int n = 10899;
//         int rev = 0;

//         while(n > 0){
//             int lastDigit = n % 10;
//             rev = (rev * 10) + lastDigit;
//             n /= 10 ; // n = n / 10
//         }
//         System.out.println(rev);
//     }
// }


// public class JavaBasics3{
//     public static void main(String args []){

//         int counter = 1;
//         do { 
//             System.out.println("Hello World");
//             counter++;
//         } while( counter <= 10);
//     }
// }



// public class JavaBasics3{
//     public static void main(String args []){
//         for(int i = 1; i <= 5; i++){
//             if(i == 3){
//                 break; // to exit the loop 
//             }
//             System.out.println(i);
//         }
//         System.out.println("i am out of the loop");
//     }
// }

// import java.util.Scanner;
// public class JavaBasics3{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
      

//         do { 
//             System.out.print("Enter number : ");
//             int n = sc.nextInt();
//             if(n % 10 == 0){
//                 break;
//             }
//             System.out.println(n);
//         } while (true);
//     }
// }



// public class JavaBasics3{
//     public static void main(String args []){
//       for(int i = 1; i <= 5; i++){
//         if( i == 3){
//             continue; // to skip an iteration
//         }
//         System.out.println(i);
//       }
      
//     }
// }

// import java.util.Scanner;
// public class JavaBasics3{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);

//         do { 
//             System.out.print("Enter your number :");
//             int n = sc.nextInt();
//             if(n % 10 == 0){
//                 continue;
//             }
//             System.out.println("number was : " + n);
//         } while (true);
        
//     }
// }


// check n is prime or not 

// import java.util.Scanner;
// public class JavaBasics3{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         if(n == 2){
//             System.out.println("n is prime");
//         }else{
//             boolean isPrime = true;
//             for(int i=2; i <=n-1; i++){
//                 if(n % i == 0){ // n is a multiple of i (i not equal to 1 or n )
//                     isPrime = false;
//                 }
//             }

//             if(isPrime == true){
//                 System.out.println("n is prime");
//             }else{
//                 System.out.println("n is not prime");
//             }
            
//         }
//     }
// }


// check number is prime or not - Optimize code 

// import java.util.Scanner;
// public class JavaBasics3{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         if(n == 2){
//             System.out.println("n is prime");
//         }else{
//             boolean isPrime = true;
//             for(int i=2; i<=Math.sqrt(n); i++){
//                 if(n % i == 0){ // n is a multiple of i (i not equal to 1 or n )
//                     isPrime = false;
//                 }
//             }

//             if(isPrime == true){
//                 System.out.println("n is prime");
//             }else{
//                 System.out.println("n is not prime");
//             }
            
//         }
//     }
// }

// Question 1 : How many times 'Hello' is printed?

// public class JavaBasics3{
//     public static void main(String[] args){
//         for(int i=0; i<5; i++) {
//             System.out.println("Hello"); // output : print "Hello" 2 times
//             i+=2;
//         }
//     }
// }  


// Question 2 : Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers. 



// Question 3 : Write a program to find the factorial of any number entered by the user.
// (Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and exists for positive numbers
// only. We write factorial as n!
// So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
// Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)



// Question 4 : Write a program to print the multiplication table of a number N, 
// entered by the user

// import java.util.Scanner;
// public class JavaBasics3{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1;  i<=10; i++){
//             System.out.println(n + "*" + i  + "=" + n*i);
//         }
//     }
// }


// Question 5 : What is wrong in the following program?

// public class JavaBasics3 {
//     public static void main(String args[]) {
//         for(int i = 0; i <= 5; i++ ) {
//             System.out.println("i = " + i );
//         }
//         // System.out.println("i after the loop = " + i );
//     }
// }


// Patterns (Part 1)

// print STAR pattern

// public class JavaBasics3{
//     public static void main(String args[]){
       
//         int n = 4;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// public class JavaBasics3{
//     public static void main(String args[]){
       
//         int n = 4;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<= n-i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class JavaBasics3{
//     public static void main(String args[]){
       
//         int n = 4;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// public class JavaBasics3{
//     public static void main(String args[]){
//        int n = 4;
//        char ch = 'A';
       
//        for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print(ch);
//             ch++;
//         }
//         System.out.println();
//        }
//     }
// }





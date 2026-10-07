// 6.Conditional Statements

// public class JavaBasics2{
//     public static void main(String args []){
//         int a = 1;
//         int b = 3;

//         if(a > b){
//             System.out.println(a);
//         }else{
//             System.out.println(b);
//         }

//     }
// }



// import java.util.*;
// public class JavaBasics{
//     public static void main(String args []){
//         Scanner sc =  new Scanner(System.in);

//         int  num = sc.nextInt();

//         if(num % 2 == 0){
//             System.out.println("num is even");
//         }else {
//             System.out.println("num is odd");
//         }
         
//     }
// }



// import java.util.*;
// public class JavaBasics{
//     public static void main(String args []){
//         Scanner sc =  new Scanner(System.in);

//         int  income = sc.nextInt();
//         int tax; 

//         if( income < 500000){
//             tax = 0;
//         }else if( income >= 500000 && income < 1000000) {
//             // System.out.println("20% tax : " + (income * 0.20f));
//             tax = (int) (income * 0.20);
//         }else{
//             // System.out.println("30% tax : " + (income * 0.30f));
//             tax = (int) (income * 0.30);
//         }

//         System.out.println("your tax is : " + tax);
         
//     }
// }



// import java.util.*;
// public class JavaBasics{
//     public static void main(String args []){
//         Scanner sc =  new Scanner(System.in);

//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();

//         if((A >= B)  && (A >= C)){
//             System.out.println(A);
//         }else if (B >= C) {
//                 System.out.println(B);
//         }else{
//             System.out.println(C);
//         }   
//     }
// }


// import java.util.Scanner;
// public class JavaBasics2{
//     public static void main(String args []){
//         Scanner sc =  new Scanner(System.in);

//         int number = sc.nextInt();
//         String type = ((number % 2 ) == 0)  ? "even" :"odd";
//         System.out.println(type);

        
//     }
// }


// import java.util.Scanner;
// public class JavaBasics2{
//     public static void main(String args []){
//         Scanner sc =  new Scanner(System.in);

//         int marks = sc.nextInt();
//         String result = marks >= 33 ? "Pass" : "Fail";
//         System.out.println(result);
//     }
// }



// import java.util.Scanner;
// public class JavaBasics2{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a : ");
//         int a = sc.nextInt();
//         System.out.println("Enter b : ");
//         int b = sc.nextInt();
//         System.out.println("Enter operator : ");
//         char operator = sc.next().charAt(0);
        

//         switch(operator){
//             case '+': System.out.println(a + b);
//             break;
//             case '-': System.out.println(a - b);
//             break;
//             case '*': System.out.println(a * b);
//             break;
//             case '/': System.out.println(a / b);
//             break;
//             case '%': System.out.println(a % b);
//             break;
//             default: System.out.println("Wrong Enter!");
//         }
//     }
// }


// Question 1 : Write a Java program to get a number from the user and print whether it is
// positive or negative.

// import java.util.Scanner;
// public class JavaBasics2{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number : ");
//         int num = sc.nextInt();

//         if(num  >= 1){
//             System.out.println("positive number!");
//         }else{
//             System.out.println("negative number!");
//         }

//     }
// }


// Question 2 : Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever.


// public class JavaBasics2{ 
//     public static void main(String[] args) {
//         double temp = 103.5;

//         if(temp > 100){
//             System.out.println("fever");
//         }else{
//             System.out.println("don't have a fever");
//         }
//     }
// }


// Question 3 : Write a Java program to input week number(1-7) and print day of week name
// using switch case.


// import java.util.Scanner;
// public class JavaBasics2{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number :");
//         int number = sc.nextInt();

//         switch(number){
//             case 1: System.out.println("Monday");
//             break;
//             case 2: System.out.println("Tuesday");
//             break;
//             case 3: System.out.println("Wednesday");
//             break;
//             case 4: System.out.println("Thrusday");
//             break;
//             case 5: System.out.println("Friday");
//             break;
//             case 6: System.out.println("Saturday");
//             break;
//             case 7: System.out.println("Sunday");
//             break;
//             default: System.out.println("Wrong number");
//         }

//     }
// }

// Question 4 : What will be the value of x & y in the following program:

// public class JavaBasics2{
//     public static void main(String args[]) {
//         int a = 63, b = 36;
//         boolean x = (a < b ) ? true : false; // false
//         int y= (a > b ) ? a : b; // a = 63 
//         System.out.println(x);
//         System.out.println(y);
//     }
// }


// Question 5 : Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.


// import java.util.Scanner;
// public class JavaBasics2{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter year :");
//         int year = sc.nextInt();

//         if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
//             System.out.println("Leap year");
//         } else{
//             System.out.println("Not leap year");
//         }


//     }
// }
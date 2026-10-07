// 4. Variables & Data Types

// public class JavaBasics {
//     public static void main(String args []){
//         System.out.print("Hello world!");
//     }
// }


// public class JavaBasics {
//     public static void main(String args []){
//         System.out.print("Hello world!");
//         System.out.print("Hello world!");
//         System.out.print("Hello world!");
//     }
// }


// public class JavaBasics {
//     public static void main(String args []){
//         System.out.println("Hello world!");
//         System.out.println("Hello world!");
//         System.out.println("Hello world!");
//     }
// }


// public class JavaBasics {
//     public static void main(String args []){
//         System.out.print("Hello world!\n");
//         System.out.print("Hello world!\n");
//         System.out.print("Hello world!\n");
//     }
// }


// public class JavaBasics{
//     public static void main(String args []){
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");

//     }
// }

// public class JavaBasics{
//     public static void main(String args []){
//        int a = 10;
//        int b = 20;

//        System.out.println("a"); // a
//        System.out.println(a);  // 10 
//        System.out.println(b);  // 20

//        String name = "Aditya Kumar Upadhyay";
//        System.out.println(name);
//     }
// }


// public class JavaBasics{
//     public static void main(String args []){
//       byte b = 8;
//       System.out.println(b);
//       char ch = 'a';
//       System.out.println(ch);
//       boolean var = true;
//       System.out.println(var);
//     //   float price = 10.5;
//     //   System.out.println(price);
//       int num = 11;
//       System.out.println(num);
//        // long - > store large integer values
//        // double -> store large decimal values
//        short n = 250;
//        System.out.println(n);
//     }
// }


// public class JavaBasics{
//     public static void main(String args []){
//         int a = 10;
//         int b = 20;
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         // String input = sc.next();
//         // System.out.println(input);  

//         // input -> Aditya
//         // Output print - > Aditya


//         // String name = sc.nextLine();
//         // System.out.println(name);

//         // input -> Aditya kumar Upadhyay
//         // output print -> Aditya Kumar Upadhyay

//         // int num = sc.nextInt();
//         // System.out.println(num);

//         // float price = sc.nextFloat();
//         // System.out.println(price);

//         // boolean var = sc.nextBoolean();
//         // System.out.println(var);

//         // long num = sc.nextLong();
//         // System.out.println(num);
//     }
// }



// import java.util.Scanner;
// public class JavaBasics {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = a  + b ;
//         System.out.println("Sum of a & b : " + sum);


//     }
// }


// import java.util.Scanner;
// public class JavaBasics{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int product = a * b;
//         System.out.println("Product of a & b : " + product);
//     }
// }

// import java.util.Scanner;
// public class JavaBasics{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         float rad = sc.nextFloat();
       

//         float area = 3.14f * rad * rad;
//         System.out.println("Area of Circle : " + area);
//     }
// }


/* Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */


// import java.util.Scanner;
// public class JavaBasics{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();

//         int average = (A + B + C) / 3;
//         System.out.println(average);
//     }
// }

// Question 2: In a program, input the side of a square. You have to output the area of the
// square.
// (Hint : area of a square is (side x side))


// import java.util.Scanner;
// public class JavaBasics{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int  side = sc.nextInt();

//         int area = side * side;
//         System.out.println(area);
//     }
// }


// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

// import java.util.Scanner;
// public class JavaBasics{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);

//         float pencil = sc.nextFloat();
//         float pen = sc.nextFloat();
//         float eraser = sc.nextFloat();

//         float totalCost = pencil + pen + eraser;

//         float tax = totalCost / 100 * 18;

//         System.out.println("Total Cost of Item : " + totalCost);
//         System.out.println("Tax of Item : " + tax);
//         System.out.println("TotalCost of Item with 18% gst tax : " + (totalCost+tax));

//     }
// }


// public class JavaBasics{
//     public static void main(String[] args) {
//         int $ = 24;
//         System.out.println($);
//     }
// }



// 5.Operators


// import java.util.Scanner;
// public class JavaBasics{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = a + b;
//         int sub = a - b;
//         int div =  a / b;
//         int mult = a * b;
//         int mod = a % b;

//         System.out.println(sum);
//         System.out.println(sub);
//         System.out.println(div);
//         System.out.println(mult);
//         System.out.println(mod);

//     }
// }


// public class JavaBasics{
//     public static void main(String args []){
//         int a = 10;
//         int b = ++a;
//         System.out.println(a); // 11
//         System.out.println(b); // 11
//     }
// }


// public class JavaBasics{
//     public static void main(String args []){
//         int a = 10;
//         int b = a++;
//         System.out.println(a); // 11
//         System.out.println(b); // 10
//     }
// }


// public class JavaBasics{
//     public static void main(String args []){
//         int a = 10;
//         int b = --a;
//         System.out.println(a); // 9
//         System.out.println(b); // 9
//     }
// }


// public class JavaBasics{
//     public static void main(String args []){
//         int a = 10;
//         int b = a--;
//         System.out.println(a); // 9
//         System.out.println(b); // 10
//     }
// }


// Question : What will be the output of the following programs 

// public class JavaBasics {
//     public static void main(String[] args){
//         int x = 2, y = 5;
//         int exp1 = (x * y / x);
//         int exp2 = (x * (y / x));

//         System.out.print(exp1 + ","); // 5 
//         System.out.print(exp2);  // 4    // ( y / x ) Because both are int, Java performs integer division, so 5 / 2 becomes 2, not 2.5.
//     }
// }


// public class JavaBasics {
//     public static void main(String[] args) {
//         int x = 200, y = 50, z = 100;
        
//         if(x > y && y > z){
//             System.out.println("Hello");
//         }
//         if(z > y && z < x){
//             System.out.println("Java");
//         }
//         if((y+200) < x && (y+150) < z){
//             System.out.println("Hello Java");
//         }
//     }
// }




// public class JavaBasics {
//     public static void main(String[] args){
//         int x, y, z;
//         x = y = z = 2;
//         x += y;
//         y -= z;
//         z /= (x + y);
//         System.out.println(x + " " + y + " " + z);
//     }
// }


// public class JavaBasics {
//     public static void main(String[] args){
//         int x = 9, y = 12;
//         int a = 2, b = 4, c = 6;
//         int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
//         System.out.println(exp);
//     }
// }


// public class JavaBasics {
//     public static void main(String[] args){
//         int x = 10, y = 5; 
//         int exp1 = (y * (x / y + x / y));
//         int exp2 = (y * x / y + y * x / y);

//         System.out.println(exp1);
//         System.out.println(exp2);
//     }
// }
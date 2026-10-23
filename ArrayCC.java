// Arrays (Part - 1)

// import java.util.Scanner;
// public class ArrayCC{
//     public static void main(String args []){
//         int marks[] = new int[50]; // create 

//         Scanner sc = new Scanner(System.in);

//         marks[0] = sc.nextInt(); // phy  // input
//         marks[1] = sc.nextInt(); // chem
//         marks[2] = sc.nextInt(); // math

//         System.out.println("Phy : " + marks[0]); // output
//         System.out.println("chem : " + marks[1]);
//         System.out.println("math : " + marks[2]);

//         // marks[2] = 100; // update
//         // System.out.println("math : " + marks[2]);

//         // marks[2] = marks[2] + 1; // update
//         // System.out.println("math : " + marks[2]);

//         int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("percentage : " + percentage);

//         System.out.println("length of array = " + marks.length);
//         }
// }  

public class ArrayCC{
    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] =  marks[i] + 1;
        }
    }
    public static void main(String args []){
        int marks[] = {97, 98, 99};
        int nonChangable = 5;
        update(marks, nonChangable);

        System.out.println(nonChangable);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
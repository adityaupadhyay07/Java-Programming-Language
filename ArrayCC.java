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

// public class ArrayCC{
//     public static void update(int marks[], int nonChangable){
//         nonChangable = 10;
//         for(int i=0; i<marks.length; i++){
//             marks[i] =  marks[i] + 1;
//         }
//     }
//     public static void main(String args []){
//         int marks[] = {97, 98, 99};
//         int nonChangable = 5;
//         update(marks, nonChangable);

//         System.out.println(nonChangable);


//           // print our marks
//         //   System.out.print(marks[0] + " ");
//         //   System.out.print(marks[1] + " ");
//         //   System.out.print(marks[2] + " ");
//                                                // -->  both are same 
//         // print our marks
//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }

// public class ArrayCC{
//     public static int linearSearch(int numbers[], int key){
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return  -1;
//     }
//     public static void main(String args []){
//         int numbers[] ={2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;

//         int  index = linearSearch(numbers, key);

//         if(index == -1){
//             System.out.println("Not found");
//         }else{
//             System.out.println("key is at index : " + index);
//         }
//     }
// }



// public class ArrayCC{
//     public static int linearSearch(String foodMenu[], String key){
//         for(int i=0; i<foodMenu.length; i++){
//             if(foodMenu[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args []){
//         String foodMenu[] = {"Pizza", "Burger","Biryani", "Paneer Tikka", "Masala Dosa", "Pasta",
//         "French Fries", "Momos", "Cold Coffee","Ice Cream"};
//         String key = "Momos";

//         int index = linearSearch(foodMenu, key);

//         if(index == -1){
//             System.out.println("Not found");
//         }else{
//             System.out.println("key is at index : " + index);
//         }
//     }
// }

// find Largest in Array and smallest in Array
// public class ArrayCC{
//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE; // -infinity 
//         int smallest = Integer.MAX_VALUE; // +infinity

//         for(int i=0; i<numbers.length; i++){
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//             if(smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("smallest value is : "+ smallest);
//         return largest;
//     }
//     public static void main(String args[]){
//         int numbers[] = {1, 2, 6, 3, 5};
//         System.out.println("largest value is : " + getLargest(numbers));
//     }
// }

// binarySearch
public class ArrayCC{
    public static int binarySearch(int numbers[], int key){
        int start = 0, end=numbers.length-1;

        while(start <= end){

            int mid = (start + end) / 2;

            // comparisons
            if(numbers[mid] == key){ // found
                return mid;
            }
            if(numbers[mid] < key ){ // right
                start = mid + 1;
            }else{ // left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args []){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 4;

        System.out.println("index for key is : " + binarySearch(numbers, key));
    }
}


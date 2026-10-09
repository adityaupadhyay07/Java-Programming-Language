// import java.util.*;
// public class ArraysCC{
//     public static void main(String args []){
//         int marks [] = new int[100];

//         Scanner sc = new Scanner(System.in);
//         // int phy;
//         // phy = sc.nextInt();

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("Phy : " + marks[0]);
//         System.out.println("chem : " + marks[1]);
//         System.out.println("math : " + marks[2]);

//         // marks[2] = 100;
//         // System.out.println("math :" + marks[2]);

//         // marks[2] = marks[2] + 1;
//         // System.out.println("math :" + marks[2]);

//         int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("percentage = " + percentage + "%");

//         System.out.println("length of array = " + marks.length);
//     }
// }


// public class ArraysCC{
//     public static void update(int marks[], int nonChangable){
//         nonChangable = 10;
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args []){
//         int marks[] = {96,97,98};
//         int nonChangable = 5;
//         update(marks, nonChangable);
//         System.out.println(nonChangable); // 5

//         // print our marks
//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i]+" "); // output: 97 98 99
//         }
//     }
// }


// public class ArraysCC{
//     public static int linearSearch(int numbers[], int key){
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args []){
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;
//         int index = linearSearch(numbers, key);

//         if(index == -1){
//             System.out.println("Not Found");
//         }else{
//             System.out.println("key is at index : " + index);
//         }



//     }
// }

// Linear Search
// public class ArraysCC{
//     public static int linearSearch(String menu[], String key){
//         for(int i=0; i<menu.length; i++){
//             if(menu[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args []){
//         String menu[] = {"dosa", "chole bhature", "samosa","tea", "coke"};
//         String key = "tea";

//         int index = linearSearch(menu, key);
        
//         if(index == -1){
//             System.out.println("Not found");
//         }else{
//             System.out.println("key is at index : " + index);
//         }
//     }
// }  // T.C - o(n)


// find largest number in a given Array
// import java.util.*;
// public class ArraysCC{
//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE; // -Infinity
//         int smallest = Integer.MAX_VALUE; // +Infinity

//         for(int i=0; i<numbers.length; i++){
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//             if(smallest > numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("smallest value is : " + smallest);
//         return largest;
//     }
//     public static void main(String args []){
//         int numbers[] = {1, 2, 6, 3, 5};
//         System.out.println("largest value is : " + getLargest(numbers));

//     }
// }

// Binary Search 
public class ArrayCC{
    public static int  binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length -1;

        while(start <= end){
            int mid = (start + end) / 2;

            // Comparisons
            if(numbers[mid] == key){ // found
                return mid;
            }
            if(numbers[mid] < key){ // right
                start = mid + 1;
            }else{ // left
                end = mid - 1;

            }
        }
        return -1;
    }
    public static void main(String args []){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("index for key is : " + binarySearch(numbers, key));
    }
}
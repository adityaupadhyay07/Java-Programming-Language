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


public class ArraysCC{
    public static int linearSearch(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args []){
        String menu[] = {"dosa", "chole bhature", "samosa","tea", "coke"};
        String key = "tea";

        int index = linearSearch(menu, key);
        
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index : " + index);
        }
    }
}  // T.C - o(n)
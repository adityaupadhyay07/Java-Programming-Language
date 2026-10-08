// Patterns (Part 2) - Advanced


// public class JavaBasics5{
//     public static void hollow_rectangle(int totRows, int totCols){
//         // outer loop for rows
//         for(int i=1; i<=totRows; i++){
//             // inner loop for Cols
//             for(int j=1; j<=totCols; j++){
//                 // cell -(i,j)
//                 if(i==1 || i==totRows || j==1 || j==totCols){
//                     // boundary cells
//                     System.out.print("x");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args []){
//         hollow_rectangle(4, 5);
//     }
// }


// public class JavaBasics5{
//     public static void inverted_rotated_half_pyramid(int n){
//         // outer loop
//         for(int i=1; i<=n; i++){ // i --> line / row
//             // space 
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             // star
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }

//     }
//     public static void main(String args []){
//         inverted_rotated_half_pyramid(4);
//     }
// }


// public class JavaBasics5{
//     public static void inverted_half_pyramid(int n){
//         // outer loop
//         for(int i=1; i<=n; i++){
//             // inner loop
//             for(int j=1; j<=(n-i+1); j++){
//                 System.out.print(j);
//             }
//            System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         inverted_half_pyramid(5);
//     }
// }


// public class JavaBasics5{
//     public static void floyds_Triangle(int n){
//         // outer loop 
//         int counter = 1;
//         for(int i=1; i<=n; i++){
//             // inner loop - how many times will counter be printed
//             for(int j=1; j<=i; j++){
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         floyds_Triangle(5);
//     }
// }


public class JavaBasics5{
    public static void zero_one_triangle(int n){
        // outer loop - rows / lines
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1" + " ");
                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }

    }

    public static void butterfly_Pattern(int n){
        // 1st Half

        // outer loop 
        for(int i=1; i<=n; i++){
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();

        }

        // 2st Half

        // outer loop 
        for(int i=n; i>=1; i--){
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void solid_Rhombus(int n){
        // outer loop 
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_Rhombus(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String args []){
        // zero_one_triangle(5);
        // butterfly_Pattern(4);
        // solid_Rhombus(5);
        hollow_Rhombus(5);
    }
}


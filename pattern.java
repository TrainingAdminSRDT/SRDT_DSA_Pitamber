// Square Hollow Pattern
// public class  pattern{
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i == 1 || i == n || j == 1 || j == n)
//                     System.out.print("* ");
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }
// 
// // Number Triangular Pattern
// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;
// 
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// 
// // Number Increasing Pyramid
// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;
// 
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// 
// // Number Increasing Reverse Pyramid
// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;
// 
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// 
// // Number Changing Pyramid
// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;
//         int num = 1;
// 
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num++ + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// 
// // Zero-One Triangle
// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;
// 
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print((i + j) % 2 + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// 
// // Palindrome Triangular Pattern
// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;
// 
//         for (int i = 1; i <= n; i++) {
// 
//             for (int j = i; j >= 1; j--)
//                 System.out.print(j);
// 
//             for (int j = 2; j <= i; j++)
//                 System.out.print(j);
// 
//             System.out.println();
//         }
//     }
// }
// 
// // Rhombus Pattern
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = 1; i <= n; i++) {
// 
//             for (int j = 1; j < i; j++)
//                 System.out.print(" ");
// 
//             for (int j = 1; j <= n; j++)
//                 System.out.print("* ");
// 
//             System.out.println();
//         }
//     }
// }
// 
// // Diamond Pattern
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = 1; i <= n; i++) {
// 
//             for (int j = i; j < n; j++)
//                 System.out.print(" ");
// 
//             for (int j = 1; j <= 2 * i - 1; j++)
//                 System.out.print("*");
// 
//             System.out.println();
//         }
// 
//         for (int i = n - 1; i >= 1; i--) {
// 
//             for (int j = n; j > i; j--)
//                 System.out.print(" ");
// 
//             for (int j = 1; j <= 2 * i - 1; j++)
//                 System.out.print("*");
// 
//             System.out.println();
//         }
//     }
// }
// 
// // Butterfly Star Pattern
// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;
// 
//         for (int i = 1; i <= n; i++) {
// 
//             for (int j = 1; j <= i; j++)
//                 System.out.print("*");
// 
//             for (int j = 1; j <= 2 * (n - i); j++)
//                 System.out.print(" ");
// 
//             for (int j = 1; j <= i; j++)
//                 System.out.print("*");
// 
//             System.out.println();
//         }
// 
//         for (int i = n; i >= 1; i--) {
// 
//             for (int j = 1; j <= i; j++)
//                 System.out.print("*");
// 
//             for (int j = 1; j <= 2 * (n - i); j++)
//                 System.out.print(" ");
// 
//             for (int j = 1; j <= i; j++)
//                 System.out.print("*");
// 
//             System.out.println();
//         }
//     }
// }
// 
// // Square Fill Pattern
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = 1; i <= n; i++) {
// 
//             for (int j = 1; j <= n; j++)
//                 System.out.print("* ");
// 
//             System.out.println();
//         }
//     }
// }
// 
// // Right Half Pyramid
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = 1; i <= n; i++) {
// 
//             for (int j = 1; j <= i; j++)
//                 System.out.print("* ");
// 
//             System.out.println();
//         }
//     }
// }
// 
// // Reverse Right Half Pyramid
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = n; i >= 1; i--) {
// 
//             for (int j = 1; j <= i; j++)
//                 System.out.print("* ");
// 
//             System.out.println();
//         }
//     }
// }
// 
// // Left Half Pyramid
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = 1; i <= n; i++) {
// 
//             for (int j = i; j < n; j++)
//                 System.out.print(" ");
// 
//             for (int j = 1; j <= i; j++)
//                 System.out.print("*");
// 
//             System.out.println();
//         }
//     }
// }
// 
// // Reverse Left Half Pyramid
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = n; i >= 1; i--) {
// 
//             for (int j = n; j > i; j--)
//                 System.out.print(" ");
// 
//             for (int j = 1; j <= i; j++)
//                 System.out.print("*");
// 
//             System.out.println();
//         }
//     }
// }
// 
// // K Pattern
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++)
//                 System.out.print("* ");
//             System.out.println();
//         }
// 
//         for (int i = 2; i <= n; i++) {
//             for (int j = 1; j <= i; j++)
//                 System.out.print("* ");
//             System.out.println();
//         }
//     }
// }
// 
// // Triangle Star Pattern
// public class pattern{
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = 1; i <= n; i++) {
// 
//             for (int j = i; j < n; j++)
//                 System.out.print(" ");
// 
//             for (int j = 1; j <= 2 * i - 1; j++)
//                 System.out.print("*");
// 
//             System.out.println();
//         }
//     }
// }
// 
// // Reverse Number Triangle Pattern
// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;
// 
//         for (int i = 1; i <= n; i++) {
// 
//             for (int j = i; j <= n; j++)
//                 System.out.print(j + " ");
// 
//             System.out.println();
//         }
//     }
// }
// 
// // Pascal's Triangle
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
// 
//         for (int i = 0; i < n; i++) {
// 
//             int num = 1;
// 
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num = num * (i - j) / (j + 1);
//             }
// 
//             System.out.println();
//         }
//     }
// }

// Right Pascal's Triangle
public class pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}
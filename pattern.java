 public class pattern {
 public static void printPattern(int n)
    {


        

// Square Hollow Pattern
        // int i, j;
        

        // for (i = 0; i < n; i++) {
            
            
        //     for (j = 0; j < n; j++) {
                
               
        //         if (i == 0 || j == 0 || i == n - 1
        //             || j == n - 1) {
        //             System.out.print("*");
        //         }
                
               
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //Number Triangle Pattern
        //  int i, j;
        
        
        // for (i = 1; i <= n; i++) {
            
        
        //     for (j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
           
        //     for (j = 1; j <= i; j++) {
        //         System.out.print(i + " ");
        //     }
            
           
        //     System.out.println();
        // }


        //Number-Increasing Pyramid Pattern
        //   int i, j;
        
     
        // for (i = 1; i <= n; i++) {
            
         
        //     for (j = 1; j <= i; j++) {
                
              
        //         System.out.print(j + " ");
        //     }

           
        //     System.out.println();
        // }


        // Number-Increasing Reverse Pyramid Pattern
        //  int i, j;
        
      
        // for (i = n; i >= 1; i--) {
            
           
        //     for (j = 1; j <= i; j++) {
                
              
        //         System.out.print(j + " ");
        //     }

           
        //     System.out.println();
        // }


        //Number-Changing Pyramid Pattern
        //  int i, j;
        // int num = 1;
        
       
        // for (i = 1; i <= n; i++) {
            
            
        //     for (j = 1; j <= i; j++) {
                
              
        //         System.out.print(num + " ");
                
               
        //         num++;
        //     }

           
        //     System.out.println();
        // }


        // Zero-One Triangle Pattern
        // int i, j;
        // int num = 1;
        
    
        // for (i = 1; i <= n; i++) {
            
          
        //     for (j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     for (j = 1; j <= n; j++) {
        //         System.out.print("*");
        //     }
            
            
        //     System.out.println();
        // }


        //Palindrome Triangle Pattern
        //  int i, j;
        // int num = 1;
        
       
        // for (i = 1; i <= n; i++) {
            
           
        //     for (j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
            
            
        //     for (j = 1; j <= 2 * i - 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    
        //Rhombus Pattern
        // for (i = n-1; i >= 1; i--) {
            
           
        //     for (j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
            
          
        //     for (j = 1; j <= 2 * i - 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // Diamond Star Pattern
        //  for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= 2 * n; j++) {
              
               
        //         if (j > i && j <= 2 * n - i) {
        //             System.out.print(" ");
        //         }
                
              
        //         else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

     
        //butterfly Star Pattern
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= 2 * n; j++) {
              
                
        //         if (j > i && j <= 2 * n - i) {
        //             System.out.print(" ");
        //         }
                
                
        //         else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }


        //Square Fill Pattern
        //  int i, j;

       
        // for (i = 0; i < n; i++) {

            
        //     for (j = 0; j < n; j++) {
        //         System.out.print("*");
        //     }

            
        //     System.out.println();
        // }



        //Right Half Pyramid Pattern
        //  int i, j;

        
        // for (i = 1; i <= n; i++) {

            
        //     for (j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

          
        //     System.out.println();
        // }



        //Reverse Right Half Pyramid Pattern
        //  int i, j;

        
        // for (i = n; i >= 1; i--) {

            
        //     for (j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

            
        //     System.out.println();
        // }



        //Left Half Pyramid Pattern
        // int i, j;

       
        // for (i = n; i >= 1; i--) {

            
        //     for (j = 1; j < i; j++) {
        //         System.out.print(" ");
        //     }


        //     for (j = 0; j <= n - i; j++) {
        //         System.out.print("*");
        //     }

          
        //     System.out.println();
        // }



        //Reverse Left Half Pyramid Pattern
        // int i, j;

        // for (i = n; i > 0; i--) {
            
           
        //     for (j = 0; j < n - i; j++) {
        //         System.out.print(" ");
        //     }
            
            
        //     for (j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }

           
        //     System.out.println();
        // }


        //Triangle Star Pattern

         int i, j;
        
        
        for (i = 0; i < n; i++) {
            
            
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
    
}

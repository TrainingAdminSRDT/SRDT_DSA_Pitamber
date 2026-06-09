public class MissingNumber {
      public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 6, 7},
                {8, 9, 0}
        };

        int row = matrix.length;
        int column = matrix[0].length;

        int totalElem = row * column;

        int Sum1 = totalElem * (totalElem + 1) / 2;

        int Sum2 = 0;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                Sum2 = Sum2 + matrix[i][j];
            }
        }

        int missingElement = Sum1 - Sum2;

        System.out.println("Missing Element: " + missingElement);
    }
}

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.io.*;
 
 
class TestClass {
     private static final int[][][] diagonalSet = {
            {{0, 0}, {1, 1}, {2, 2}},
            {{1, 1}, {2, 2}, {3, 3}},
            {{0, 3}, {1, 2}, {2, 1}},
            {{1, 2}, {2, 1}, {3, 0}},
            {{1, 3}, {2, 2}, {3, 1}},
            {{1, 0}, {2, 1}, {3, 2}},
            {{0, 1}, {1, 2}, {2, 3}},
            {{0, 2}, {1, 1}, {2, 0}},
    };
 
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int testCaseCount = Integer.valueOf(br.readLine());
 
            while (testCaseCount-- > 0) {
                char[][] matrix = new char[4][4];
                matrix[0] = br.readLine().toCharArray();
                matrix[1] = br.readLine().toCharArray();
                matrix[2] = br.readLine().toCharArray();
                matrix[3] = br.readLine().toCharArray();
 
                int countX = 0, countO = 0;
 
                for (int outer = 0; outer < 4; outer++) {
                    for (int inner = 0; inner < 4; inner++) {
                        if (matrix[outer][inner] == 'x') {
                            countX++;
                        } else if (matrix[outer][inner] == 'o') {
                            countO++;
                        }
                    }
                }
 
                char myChar = countX == countO ? 'x' : 'o';
 
                boolean wonFlag = false;
                // horizontal or row wise check
                int counter = 0;
                while (counter < 4) {
                    char[] rowsArr = matrix[counter++];
 
                    boolean flag = isWonScenarioAvailableForRowsAndColumns(myChar, rowsArr, 0, 3);
                    if (flag) {
                        System.out.println("YES");
                        wonFlag = true;
                        break;
                    } else {
                        flag = isWonScenarioAvailableForRowsAndColumns(myChar, rowsArr, 1, 4);
                        if (flag) {
                            System.out.println("YES");
                            wonFlag = true;
                            break;
                        }
                    }
                }
 
                if (wonFlag) continue;
                counter = 0; // resetting it to ZERO.
                // columns wise check
                while (counter < 4) {
                    char[] columnsArr = {matrix[0][counter], matrix[1][counter], matrix[2][counter], matrix[3][counter]};
 
                    boolean flag = isWonScenarioAvailableForRowsAndColumns(myChar, columnsArr, 0, 3);
                    if (flag) {
                        System.out.println("YES");
                        wonFlag = true;
                        break;
                    } else {
                        flag = isWonScenarioAvailableForRowsAndColumns(myChar, columnsArr, 1, 4);
                        if (flag) {
                            System.out.println("YES");
                            wonFlag = true;
                            break;
                        }
                    }
                    counter++;
                }
 
                if (wonFlag) continue;
                wonFlag = isWonScenarioAvailableForDiagonal(myChar, matrix);
                System.out.println(wonFlag ? "YES" : "NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static boolean isWonScenarioAvailableForRowsAndColumns(char myChar, char[] charArr, int startIndex, int endIndex) {
        int myCharCount = 0, emptyCellCount = 0;
 
        for (int index = startIndex; index < endIndex; index++) {
            if (charArr[index] == myChar) myCharCount++;
            else if (charArr[index] == '.') emptyCellCount++;
        }
 
        if (myCharCount == 2 && emptyCellCount == 1) {
            return true;
        }
 
        return false;
    }
 
    public static boolean isWonScenarioAvailableForDiagonal(char myChar, char[][] matrix) {
        int myCharCount = 0, emptyCellCount = 0;
 
        for (int index = 0; index < diagonalSet.length; index++) {
            int[][] eachSet = diagonalSet[index];
            for (int outer = 0; outer < eachSet.length; outer++) {
                int[] set = eachSet[outer];
                char currentChar = matrix[set[0]][set[1]];
                if (currentChar == myChar) myCharCount++;
                else if (currentChar == '.') emptyCellCount++;
            }
            if (myCharCount == 2 && emptyCellCount == 1) {
                return true;
            }
            myCharCount = 0; emptyCellCount = 0;
        }
 
        return false;
    }
}
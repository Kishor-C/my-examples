package com.examples.session2;
import java.util.Scanner;
abstract class MatrixOperation {
//------------------------------------------------------------------------------
    abstract public int[][] performOperation(int[][] arr1,int[][] arr2);
}

class MatrixAddition extends MatrixOperation{
    
    public int[][] performOperation(int[][] arr1,int[][] arr2){
        int[][] arr3 = new int[arr1.length][arr1.length];
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr3;
        
    }
}

class S3{
    
    public static void inputMatrix(int[][] arr,Scanner scan){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = scan.nextInt();
            }
        }
    }
    
    public static void displayMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
//-------------------------------------------------------------------------------------    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        inputMatrix(matrix1, scanner);
        inputMatrix(matrix2, scanner);

        MatrixOperation addition = new MatrixAddition();
        int[][] resultAddition = addition.performOperation(matrix1, matrix2);

        displayMatrix(resultAddition);

        scanner.close();
    }
}
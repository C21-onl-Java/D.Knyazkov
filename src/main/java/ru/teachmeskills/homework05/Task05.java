package ru.teachmeskills.homework05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task05 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите номер задачи:");
        int task = scanner.nextInt();
        switch (task) {
            case 0:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число:");
                int q = scanner.nextInt();
                int[][][] array = new int[3][2][2];
                Random random = new Random();
                for (int a = 0; a < array.length; a++) {
                    for (int w= 0; w < array[a].length; w++) {
                        for (int k = 0; k < array[a][w].length; k++) {
                            array[a][w][k] = random.nextInt(10);
                            System.out.print(array[a][w][k]);
                            System.out.print(" ");
                        }
                        System.out.println();

                        System.out.println("==========================================================");
                        for (int i = 0; i < array.length; i++) {
                            for (int j = 0; j < array[i].length; j++) {
                                for (int k = 0; k < array[i][j].length; k++) {
                                    array[i][j][k] += q;
                                    System.out.print(array[i][j][k]);
                                    System.out.print(" ");
                                }
                                System.out.println();
                            }


                        }
                    }
                }

                break;
            case 1:    String[][] arrays=new String[8][8];
                for (int i = 0; i < arrays.length ; i++) {
                    for (int j = 0; j < arrays.length ; j++) {
                        if ((i+j)%2==0)
                            arrays[i][j]="W";
                        else arrays[i][j]="B";

                    }


                }
                for (int i = 0; i < arrays.length ; i++) {
                    for (int j = 0; j < arrays.length; j++) {
                        System.out.print(arrays[i][j]);
                    }
                    System.out.println();
                }

                break;
            case 2:       int  [][] firstMatrix={{1,0,0,0},{0,1,0,0},{0,0,0,0}};
                int[][] secondMatrix={{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
                int[][] thirdMatrix=new int[3][3];
                for (int i = 0; i < firstMatrix.length ; i++) {
                    for (int j = 0; j < secondMatrix[i].length ; j++) {
                        for (int k = 0; k < 3; k++) {
                            thirdMatrix[i][j]+=firstMatrix[i][k]*secondMatrix[k][j];
                        }


                    }


                }
                for (int i = 0; i < thirdMatrix.length ; i++) {

                    System.out.print(Arrays.toString(thirdMatrix[i]));

                    System.out.println();
                }
                break;
            case 3: int summ=0;
                int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};
                for (int i = 0; i < numbers.length; i++) {
                    for (int j = 0; j < numbers.length ; j++) {
                        summ+=numbers[i][j];

                    }
                }
                System.out.println(summ);
                break;
            case 4:
                random = new Random();
                scanner = new Scanner(System.in);
                int rowCount = scanner.nextInt();
                int columnCount = scanner.nextInt();
                int[][] multiArray = new int[rowCount][columnCount];
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j <columnCount ; j++) {
                        multiArray[i][j] = random.nextInt(10);
                    }

                    System.out.println(Arrays.toString(multiArray[i]));
                }
                for (int i = 0; i <rowCount; i++) {
                    System.out.print(multiArray[i][i]+" ");
                }

                System.out.println();

                for (int i =rowCount-1,x=0; i>=0&&x<=rowCount;i--,x++) {
                    System.out.print(multiArray[x][i]+" ");

                }
                break;
            case 5:
                int[][] intArray={{5,3,7,12,4},{13,4,8,6,22},{4,1,8,7,9}};
                for (int i = 0; i <intArray.length ; i++) {
                    Arrays.sort(intArray[i]);


                }
                System.out.println(Arrays.deepToString(intArray));

        }

    }
}

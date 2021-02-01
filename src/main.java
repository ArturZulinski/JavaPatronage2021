import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.io.*;
import java.util.Vector;

public class main {
    public static void main(String[] args)
        throws Exception{

            System.out.println("...::: Patronage 2021 - JAVA :::...\n\n");
            System.out.println("What type of value You want to put in? :\n1.Real number\n2.Vector\n3.Matrix");

            int choice1, choice2;
            double val1, val2;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice1 = Integer.parseInt(br.readLine());

            switch (choice1) {
                case 1:
                System.out.println("What is Your first number:");
                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                val1 = Integer.parseInt(br1.readLine());
                break;

                case 2:
                System.out.println("What is the size of Your vector (No bigger then 4):");
                BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(br2.readLine());
                //char character = (char)n;
                if(0<n && n<=4) {
                    Vector<Integer> v = new Vector<Integer>(n);
                    for (int i = 0; i < n; i++) {
                        System.out.println("Please put value " + (i + 1));
                        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
                        int vectorValue = Integer.parseInt(br3.readLine());
                        v.add(vectorValue);
                    }
                    System.out.println("Your vector is : " + v);
                }
                else System.out.printf("Wrong value!!");
                break;

                case 3:
                    System.out.println("Please enter the rows in the matrix (No bigger then 4):");
                    Scanner sc = new Scanner(System.in);
                    int row = sc.nextInt();
                    System.out.println("Please enter the columns in the matrix (No bigger then 4):");
                    int column = sc.nextInt();

                    if(row>4||row<0||column>4||column<0){
                        System.out.printf("Wrong value!");
                        break;}

                    int[][] first = new int[row][column];

                    for (int r = 0; r < row; r++) {
                        for (int c = 0; c < column; c++) {
                            System.out.println(String.format("Enter first[%d][%d] integer", r, c));
                            first[r][c] = sc.nextInt();
                        }
                    }
                    for (int r = 0; r < row; r++) {
                        for (int c = 0; c < column; c++) {
                            System.out.print(first[r][c]+ "\t");
                        }
                        System.out.println();
                    }
                break;
                default:
                    System.out.println("You put the wrong value in!!!");
        }
    }
}

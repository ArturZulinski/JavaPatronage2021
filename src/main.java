import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

public class main {
    public static void main(String[] args)
        throws Exception{

            System.out.println("...::: Patronage 2021 - JAVA :::...\n\n");
            System.out.println("What type of value You want to put in? :\n1.Real number\n2.Vector\n3.Matrix");

            int choice1, choice2;
            double val1=1, val2=1;
            double v1[] = new double[4];
            double v2[] = new double[4];
            //double m1[][], m2[][];

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
                if(0<n && n<=4) {
                    Vector<Integer> v = new Vector<Integer>(n);
                    for (int i = 0; i < n; i++) {
                        System.out.println("Please put value " + (i + 1));
                        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
                        int vectorValue = Integer.parseInt(br3.readLine());
                        v.add(vectorValue);
                        v1[i] = vectorValue;
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
                    break;
            }
            System.out.println("What is the second type of value You want to put in? :\n1.Real number\n2.Vector\n" +
                    "3.Matrix");

            BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
            choice2 = Integer.parseInt(br3.readLine());

            switch (choice2) {
            case 1:
                System.out.println("What is Your second number:");
                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                val2 = Integer.parseInt(br1.readLine());
                break;

            case 2:
                System.out.println("What is the size of Your second vector (No bigger then 4):");
                BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(br2.readLine());
                if(0<n && n<=4) {
                    Vector<Integer> v = new Vector<Integer>(n);
                    for (int i = 0; i < n; i++) {
                        System.out.println("Please put value " + (i + 1));
                        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
                        int vectorValue = Integer.parseInt(br4.readLine());
                        v.add(vectorValue);
                        v2[i] = vectorValue;
                    }
                    System.out.println("Your second vector is : " + v);
                }
                else System.out.printf("Wrong value!!");
                break;

            case 3:
                System.out.println("Please enter the rows in the second matrix (No bigger then 4):");
                Scanner sc = new Scanner(System.in);
                int row = sc.nextInt();
                System.out.println("Please enter the columns in the second matrix (No bigger then 4):");
                int column = sc.nextInt();

                if(row>4||row<0||column>4||column<0){
                    System.out.printf("Wrong value!");
                    break;}

                int[][] second = new int[row][column];

                for (int r = 0; r < row; r++) {
                    for (int c = 0; c < column; c++) {
                        System.out.println(String.format("Enter second[%d][%d] integer", r, c));
                        second[r][c] = sc.nextInt();
                    }
                }
                for (int r = 0; r < row; r++) {
                    for (int c = 0; c < column; c++) {
                        System.out.print(second[r][c]+ "\t");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("You put the wrong value in!!!");
                break;
            }

        if(choice1==1 && choice2==1){
                System.out.println("What do You want to do with inputted data:\n1.Add\n2.Subtraction\n3.Multiply\n" +
                        "4.Division\n5.Exponentiation (only if second value 0 <= value <= 128)\n6.Square root");
                BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
                int choice3 = Integer.parseInt(br4.readLine());

                switch(choice3) {
                    case 1:
                        System.out.println("Your result is: "+ (val1+val2));
                        break;
                    case 2:
                        System.out.println("Your result is: "+ (val1-val2));
                        break;
                    case 3:
                        System.out.println("Your result is: "+ (val1*val2));
                        break;
                    case 4:
                        System.out.println("Your result is: "+ (val1/val2));
                        break;
                    case 5:
                        System.out.println("Your result is: "+ Math.pow(val1,val2));
                        break;
                    case 6:
                        //System.out.println("Your result is: "+ (val1+val2));
                        break;
                    default:
                        System.out.println("Wrong value");
                        break;
                }
            }
        if(choice1==1 && choice2==2){
            System.out.println("Your only option is to multiply the two.\nYour result is:");
            for (int i = 0; i < v2.length; i++) {
                double result = val1 * v2[i];
                System.out.printf(" "+ result);
            }
        }

        if(choice1==2 && choice2==1){
            System.out.println("Your only option is to multiply the two.\nYour result is:");
            for (int i = 0; i < v1.length; i++) {
                double result = val2 * v1[i];
                System.out.printf(" "+result);
            }
        }
    }
}


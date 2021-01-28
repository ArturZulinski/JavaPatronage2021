import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class main {
    public static void main(String[] args)
        throws Exception{

            System.out.println("...::: Patronage 2021 - JAVA :::...\n\n");
            System.out.println("Please input values for calculations:");

            double val1, val2;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            val1 = Double.parseDouble(br.readLine());
            val2 = Double.parseDouble(br.readLine());

            System.out.printf("%f    %f", val1, val2);
    }
}
